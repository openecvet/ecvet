
package eu.open_ecvet.app.view;


import xdev.db.DBException;
import xdev.lang.EventHandlerDelegate;
import xdev.ui.*;
import xdev.vt.VirtualTable.VirtualTableRow;

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
import javax.swing.event.ListSelectionEvent;

import eu.open_ecvet.app.helper.UpdateView;
import eu.open_ecvet.app.helper.UpdateViewHelper;
import eu.open_ecvet.app.model.Competentinstitutionlist;
import eu.open_ecvet.app.model.Complementarydocuments;
import eu.open_ecvet.app.model.Ecvetframework;
import eu.open_ecvet.app.model.Qualification;


public class FrameworkView extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	private UpdateView	updateView	= new UpdateView()
									{
										
										@Override
										public String getName()
										{
											
											return FrameworkView.class.getSimpleName();
										}
										
										
										public void update()
										{
											competentInstitutionComboBox.setModel(
													Competentinstitutionlist.VT,"TITLE","ID",true);
											complementaryDocumentsComboBox.setModel(
													Complementarydocuments.VT,"TITLE","ID",true);
											qualificationComboBox.setModel(Qualification.VT,
													"TITLE","ID",true);
											table.refresh();
										}
									};
	
	
	public FrameworkView()
	{
		
	}
	
	
	public FrameworkView(MainWindow mainWindow)
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
			formular.reset(Ecvetframework.VT);
			mainWindow.updateExportMenuItem(0);
		}
		catch(DBException e)
		{
			// TODO Auto-generated code
			e.printStackTrace();
			updateView.update();
			this.openInDialog(new AlertWindow(),true);
			
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void qualificationShortcut_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		mainWindow.tabbedPane.setSelectedComponent(mainWindow.qualificationTab);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void this_init() // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		UpdateViewHelper.instance().add(updateView);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void button_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		mainWindow.tabbedPane.setSelectedComponent(null);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void button2_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		mainWindow.tabbedPane.setSelectedComponent(null);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset(eu.open_ecvet.app.model.Ecvetframework.VT);
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
				formular.reset(eu.open_ecvet.app.model.Ecvetframework.VT);
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
	
	
	@EventHandlerDelegate
	void table_valueChanged(ListSelectionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		VirtualTableRow virtualTableRow = table.getSelectedVirtualTableRow();
		if(virtualTableRow != null)
		{
			Integer object = (Integer)virtualTableRow.get("ID");
			System.out.println(object);
			
			mainWindow.updateExportMenuItem(object);
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevContainer	container, container3, container2;
	XdevButton		button2, button, qualificationShortcut, cmdNew, cmdReset, cmdSave,
			cmdSaveAndNew, cmdSearch, deleteButton;
	XdevTextField	textField2, textField;
	XdevFormular	formular;
	XdevTable		table;
	XdevTextArea	textArea;
	XdevComboBox	competentInstitutionComboBox, complementaryDocumentsComboBox,
			qualificationComboBox;
	XdevLabel		label2, label3, label4, label5, label6, label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		button2 = new XdevButton();
		button = new XdevButton();
		qualificationShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		label4 = new XdevLabel();
		textField = new XdevTextField();
		label5 = new XdevLabel();
		competentInstitutionComboBox = new XdevComboBox();
		label6 = new XdevLabel();
		complementaryDocumentsComboBox = new XdevComboBox();
		label = new XdevLabel();
		qualificationComboBox = new XdevComboBox();
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
		button2.setTabIndex(17);
		button2.setText("Competent Institution List");
		button2.setEnabled(false);
		button.setTabIndex(16);
		button.setText("Complementary Documents");
		button.setEnabled(false);
		qualificationShortcut.setTabIndex(1);
		qualificationShortcut.setText("Qualification");
		table.setTabIndex(29);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(
				Ecvetframework.VT,
				"ID, TITLE, URI, COMPETENTINSTITUTIONLIST_TITLE, COMPLEMENTARYDOCUMENTS_TITLE, QUALIFICATION_TITLE",
				true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Ecvetframework.TITLE");
		textField2.setTabIndex(30);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Ecvetframework.DESCRIPTION");
		textArea.setTabIndex(31);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		label4.setText("URI");
		label4.setName("label4");
		textField.setDataField("eu.open_ecvet.app.model.Ecvetframework.URI");
		textField.setTabIndex(32);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("COMPETENTINSTITUTIONLIST_ID");
		label5.setName("label5");
		competentInstitutionComboBox
				.setDataField("eu.open_ecvet.app.model.Ecvetframework.COMPETENTINSTITUTIONLIST_ID");
		competentInstitutionComboBox.setTabIndex(33);
		competentInstitutionComboBox.setName("comboBox2");
		competentInstitutionComboBox.setModel(Competentinstitutionlist.VT,"TITLE","ID",true);
		label6.setText("COMPLEMENTARYDOCUMENTS_ID");
		label6.setName("label6");
		complementaryDocumentsComboBox
				.setDataField("eu.open_ecvet.app.model.Ecvetframework.COMPLEMENTARYDOCUMENTS_ID");
		complementaryDocumentsComboBox.setTabIndex(34);
		complementaryDocumentsComboBox.setName("comboBox3");
		complementaryDocumentsComboBox.setModel(Complementarydocuments.VT,"TITLE","ID",true);
		label.setText("QUALIFICATION_ID");
		qualificationComboBox
				.setDataField("eu.open_ecvet.app.model.Ecvetframework.QUALIFICATION_ID");
		qualificationComboBox.setTabIndex(35);
		qualificationComboBox.setModel(Qualification.VT,"TITLE","ID",true);
		cmdNew.setTabIndex(36);
		cmdNew.setText("New");
		cmdReset.setTabIndex(37);
		cmdReset.setText("Reset");
		cmdSave.setTabIndex(38);
		cmdSave.setText("Save");
		cmdSaveAndNew.setTabIndex(39);
		cmdSaveAndNew.setText("Save + New");
		cmdSearch.setTabIndex(40);
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
		competentInstitutionComboBox.saveState();
		label6.saveState();
		complementaryDocumentsComboBox.saveState();
		label.saveState();
		qualificationComboBox.saveState();
		
		container.setLayout(new GridBagLayout());
		container.add(button2,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(3,3,3,3),0,0));
		container.add(button,new GBC(2,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(3,3,3,3),0,0));
		container.add(qualificationShortcut,new GBC(3,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,
				0,0,0),0,0));
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
		formular.add(competentInstitutionComboBox,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,
				GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,
				3),0,0));
		formular.add(complementaryDocumentsComboBox,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,
				GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,6,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,
				new Insets(3,3,3,3),0,0));
		formular.add(qualificationComboBox,new GBC(2,6,1,1,1.0,0.0,GBC.BASELINE_LEADING,
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
		button2.addActionListener(e -> button2_actionPerformed(e));
		button.addActionListener(e -> button_actionPerformed(e));
		qualificationShortcut.addActionListener(e -> qualificationShortcut_actionPerformed(e));
		table.addListSelectionListener(e -> table_valueChanged(e));
		cmdNew.addActionListener(e -> cmdNew_actionPerformed(e));
		cmdReset.addActionListener(e -> cmdReset_actionPerformed(e));
		cmdSave.addActionListener(e -> cmdSave_actionPerformed(e));
		cmdSaveAndNew.addActionListener(e -> cmdSaveAndNew_actionPerformed(e));
		cmdSearch.addActionListener(e -> cmdSearch_actionPerformed(e));
		deleteButton.addActionListener(e -> deleteButton_actionPerformed(e));
		this_init();
	}// ${GENERATED-CODE-BLOCK-END:INITIALIZERS}
	
}