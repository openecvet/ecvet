
package eu.open_ecvet.app.view;


import xdev.db.DBException;
import xdev.lang.EventHandlerDelegate;
import xdev.ui.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import eu.open_ecvet.app.helper.UpdateView;
import eu.open_ecvet.app.helper.UpdateViewHelper;
import eu.open_ecvet.app.model.Assessmentlist;
import eu.open_ecvet.app.model.Evaluations;
import eu.open_ecvet.app.model.Recognitionlist;
import eu.open_ecvet.app.model.Unitlist;
import eu.open_ecvet.app.model.Validationlist;


public class EvaluationsView extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	
	private UpdateView	updateView	= new UpdateView()
									{
										
										@Override
										public String getName()
										{
											
											return EvaluationsView.class.getSimpleName();
										}
										
										
										public void update()
										{
											assessmentListComboBox.setModel(Assessmentlist.VT,
													"TITLE","ID",true);
											validationListComboBox.setModel(Validationlist.VT,
													"TITLE","ID",true);
											recognitionListComboBox.setModel(Recognitionlist.VT,
													"TITLE","ID",true);
											table.refresh();
											
										}
									};
	
	
	public EvaluationsView()
	{
		
	}
	
	
	public EvaluationsView(MainWindow mainWindow)
	{
		this.mainWindow = mainWindow;
	}
	
	
	@EventHandlerDelegate
	void this_windowClosing(WindowEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		close();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void deleteButton_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		try
		{
			formular.delete();
			formular.reset(Evaluations.VT);
		}
		catch(DBException e)
		{
			e.printStackTrace();
			updateView.update();
			this.openInDialog(new AlertWindow(),true);
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void this_init() // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	
		UpdateViewHelper.instance().add(updateView);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset(eu.open_ecvet.app.model.Evaluations.VT);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdReset_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSave_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		if(formular.verifyFormularComponents())
		{
			try
			{
				formular.save();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSaveAndNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		if(formular.verifyFormularComponents())
		{
			try
			{
				formular.save();
				formular.reset(eu.open_ecvet.app.model.Evaluations.VT);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSearch_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.search("AND",table);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevContainer	container, container3, container2;
	XdevButton		assessmentListShortcut, recognitionListShortcut, validationListShortcut,
			cmdNew, cmdReset, cmdSave, cmdSaveAndNew, cmdSearch, deleteButton;
	XdevTextField	textField2, textField;
	XdevFormular	formular;
	XdevTable		table;
	XdevTextArea	textArea;
	XdevComboBox	assessmentListComboBox, recognitionListComboBox, validationListComboBox;
	XdevLabel		label2, label3, label4, label5, label6, label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		assessmentListShortcut = new XdevButton();
		recognitionListShortcut = new XdevButton();
		validationListShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		label4 = new XdevLabel();
		textField = new XdevTextField();
		label5 = new XdevLabel();
		assessmentListComboBox = new XdevComboBox();
		label6 = new XdevLabel();
		recognitionListComboBox = new XdevComboBox();
		label = new XdevLabel();
		validationListComboBox = new XdevComboBox();
		container3 = new XdevContainer();
		cmdNew = new XdevButton();
		cmdReset = new XdevButton();
		cmdSave = new XdevButton();
		cmdSaveAndNew = new XdevButton();
		cmdSearch = new XdevButton();
		container2 = new XdevContainer();
		deleteButton = new XdevButton();
		
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setPreferredSize(new Dimension(800,600));
		assessmentListShortcut.setTabIndex(1);
		assessmentListShortcut.setText("Assessment List");
		assessmentListShortcut.setEnabled(false);
		recognitionListShortcut.setTabIndex(16);
		recognitionListShortcut.setText("Recognition List");
		recognitionListShortcut.setEnabled(false);
		validationListShortcut.setTabIndex(17);
		validationListShortcut.setText("Validation List");
		validationListShortcut.setEnabled(false);
		table.setTabIndex(3);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(Evaluations.VT,
				"TITLE, URI, ASSESSMENTLIST_TITLE, RECOGNITIONLIST_TITLE, VALIDATIONLIST_TITLE",
				true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Evaluations.TITLE");
		textField2.setTabIndex(5);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Evaluations.DESCRIPTION");
		textArea.setTabIndex(6);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		label4.setText("URI");
		label4.setName("label4");
		textField.setDataField("eu.open_ecvet.app.model.Evaluations.URI");
		textField.setTabIndex(7);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("ASSESSMENTLIST_ID");
		label5.setName("label5");
		assessmentListComboBox
				.setDataField("eu.open_ecvet.app.model.Evaluations.ASSESSMENTLIST_ID");
		assessmentListComboBox.setTabIndex(8);
		assessmentListComboBox.setName("comboBox2");
		assessmentListComboBox.setModel(Assessmentlist.VT,"TITLE","ID",true);
		label6.setText("RECOGNITIONLIST_ID");
		label6.setName("label6");
		recognitionListComboBox
				.setDataField("eu.open_ecvet.app.model.Evaluations.RECOGNITIONLIST_ID");
		recognitionListComboBox.setTabIndex(9);
		recognitionListComboBox.setName("comboBox3");
		recognitionListComboBox.setModel(Recognitionlist.VT,"TITLE","ID",true);
		label.setText("VALIDATIONLIST_ID");
		validationListComboBox
				.setDataField("eu.open_ecvet.app.model.Evaluations.VALIDATIONLIST_ID");
		validationListComboBox.setTabIndex(10);
		validationListComboBox.setModel(Validationlist.VT,"TITLE","ID",true);
		cmdNew.setTabIndex(11);
		cmdNew.setText("New");
		cmdReset.setTabIndex(12);
		cmdReset.setText("Reset");
		cmdSave.setTabIndex(13);
		cmdSave.setText("Save");
		cmdSaveAndNew.setTabIndex(14);
		cmdSaveAndNew.setText("Save + New");
		cmdSearch.setTabIndex(15);
		cmdSearch.setText("Search");
		deleteButton.setTabIndex(4);
		deleteButton.setText("Delete");
		
		table.saveState();
		MasterDetail.connect(table,formular);
		label2.saveState();
		textField2.saveState();
		label3.saveState();
		textArea.saveState();
		label4.saveState();
		textField.saveState();
		label5.saveState();
		assessmentListComboBox.saveState();
		label6.saveState();
		recognitionListComboBox.saveState();
		label.saveState();
		validationListComboBox.saveState();
		
		container.setLayout(new GridBagLayout());
		container.add(assessmentListShortcut,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(
				0,0,0,0),0,0));
		container.add(recognitionListShortcut,new GBC(2,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(
				3,3,3,3),0,0));
		container.add(validationListShortcut,new GBC(3,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(
				3,3,3,3),0,0));
		GBC.addSpacer(container,true,true);
		container3.setLayout(new FlowLayout(FlowLayout.TRAILING,3,3));
		container3.add(cmdNew);
		container3.add(cmdReset);
		container3.add(cmdSave);
		container3.add(cmdSaveAndNew);
		container3.add(cmdSearch);
		formular.setLayout(new GridBagLayout());
		formular.add(label2,new GBC(1,1,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		formular.add(textField2,new GBC(2,1,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,
				new Insets(3,3,3,3),0,0));
		formular.add(label3,new GBC(1,2,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		JScrollPane textArea_carrier = new XScrollPane(textArea,
				XScrollPane.VERTICAL_SCROLLBAR_ALWAYS,XScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		formular.add(textArea_carrier,new GBC(2,2,1,1,1.0,1.0,GBC.BASELINE_LEADING,GBC.BOTH,
				new Insets(3,3,3,3),0,0));
		formular.add(label4,new GBC(1,3,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		formular.add(textField,new GBC(2,3,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,
				new Insets(3,3,3,3),0,0));
		formular.add(label5,new GBC(1,4,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		formular.add(assessmentListComboBox,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,
				GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		formular.add(recognitionListComboBox,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,
				GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,6,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,
				new Insets(3,3,3,3),0,0));
		formular.add(validationListComboBox,new GBC(2,6,1,1,1.0,0.0,GBC.BASELINE_LEADING,
				GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(container3,new GBC(1,7,2,1,1.0,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(3,3,3,
				3),0,0));
		GBC.addSpacer(formular,true,true);
		container2.setLayout(new GridBagLayout());
		container2.add(deleteButton,new GBC(1,1,1,1,0.0,0.0,GBC.EAST,GBC.NONE,new Insets(3,3,3,3),
				0,0));
		GBC.addSpacer(container2,true,true);
		this.setLayout(new GridBagLayout());
		this.add(container,new GBC(1,1,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		JScrollPane table_carrier = new XScrollPane(table,XScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				XScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(table_carrier,new GBC(1,2,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),
				0,0));
		this.add(formular,
				new GBC(1,3,1,1,0.1,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(0,0,0,0),0,0));
		this.add(container2,new GBC(1,4,1,1,0.1,0.0,GBC.EAST,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(this,true,true);
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				this_windowClosing(e);
			}
		});
		cmdNew.addActionListener(e -> cmdNew_actionPerformed(e));
		cmdReset.addActionListener(e -> cmdReset_actionPerformed(e));
		cmdSave.addActionListener(e -> cmdSave_actionPerformed(e));
		cmdSaveAndNew.addActionListener(e -> cmdSaveAndNew_actionPerformed(e));
		cmdSearch.addActionListener(e -> cmdSearch_actionPerformed(e));
		deleteButton.addActionListener(e -> deleteButton_actionPerformed(e));
		this_init();
	}// ${GENERATED-CODE-BLOCK-END:INITIALIZERS}
	
}