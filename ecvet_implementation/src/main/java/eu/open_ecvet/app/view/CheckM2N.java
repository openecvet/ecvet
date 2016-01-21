
package eu.open_ecvet.app.view;


import xdev.db.DBException;
import xdev.lang.EventHandlerDelegate;
import xdev.lang.XDEV;
import xdev.lang.cmd.Query;
import xdev.ui.*;
import xdev.ui.event.FormularAdapter;
import xdev.ui.event.FormularEvent;
import xdev.vt.VirtualTable.VirtualTableRow;
import xdev.vt.VirtualTableFillMethod;

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

import eu.open_ecvet.app.data_src.EcvetH2;
import eu.open_ecvet.app.helper.UpdateView;
import eu.open_ecvet.app.helper.UpdateViewHelper;
import eu.open_ecvet.app.model.Attachment;
import eu.open_ecvet.app.model.Evaluations;
import eu.open_ecvet.app.model.Learningoutcomelist;
import eu.open_ecvet.app.model.LearningoutcomelistLearningoutcome;
import eu.open_ecvet.app.model.LearningoutcomelistLearningoutcomelist;
import eu.open_ecvet.app.model.Qualificationframeworklist;


public class CheckM2N extends XdevWindow //  ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	
	private UpdateView	updateView	= new UpdateView()
									{
										
										@Override
										public String getName()
										{
											
											return CheckM2N.class.getSimpleName();
										}
										
										
										public void update()
										{
											table.refresh();
											// nmListBox.setModel(LearningoutcomelistLearningoutcome.VT,"{$LEARNINGOUTCOME_TITLE}","LEARNINGOUTCOME_ID",true);
											// comboBox.refresh();
										}
									};
	
	
	public CheckM2N()
	{
		
	}
	
	
	public CheckM2N(MainWindow mainWindow)
	{
		this.mainWindow = mainWindow;
	}
	
	
	@EventHandlerDelegate
	void this_windowClosing(WindowEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		close();
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void deleteButton_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		// try
		// {
		// formular.delete();
		// formular.reset(Unitlist.VT);
		// }
		// catch(DBException e)
		// {
		// // TODO Auto-generated code
		// e.printStackTrace();
		updateView.update();
		this.openInDialog(new AlertWindow(),true);
		// }
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void this_init() //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	
		UpdateViewHelper.instance().add(updateView);
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void button_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	try
	{
		XDEV.Query(new Query()
		{
			@Override
			public void init()
			{
				setDataSource(EcvetH2.DB);
				
				from("ATTACHMENT");
				select("ATTACHMENT","ID").into(Attachment.ID);
				select("ATTACHMENT","ATTACHMENTURL").into(Attachment.ATTACHMENTURL);
				select("ATTACHMENT","DESCRIPTION").into(Attachment.DESCRIPTION);
				select("ATTACHMENT","IDREFTOKEN").into(Attachment.IDREFTOKEN);
				select("ATTACHMENT","TITLE").into(Attachment.TITLE);
				select("ATTACHMENT","URI").into(Attachment.URI);
				
				setVirtualTable(Attachment.VT);
				setFillMethod(VirtualTableFillMethod.OVERWRITE);
			}
		});
	}
	catch(DBException e)
	{
		// TODO Auto-generated code
		e.printStackTrace();
	}
		//		nmListBox.setModel(Test.VT, "{$LEARNINGOUTCOMELIST_TITLE}", "LEARNINGOUTCOMELIST_ID", true);
		
		nmListBox.refresh(formular.getVirtualTable().createRow());
		
		// System.out.println(LearningoutcomelistLearningoutcome.VT);
		VirtualTableRow[] virtualTableRows = LearningoutcomelistLearningoutcome.VT.getRows();
		
		// System.out.println(virtualTableRows.length);
		for(VirtualTableRow virtualTableRow : virtualTableRows)
		{
			// System.out.println(virtualTableRow);
		}
		
		// System.out.println((LearningoutcomelistLearningoutcome.VT.getRowCount()));
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdNew_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset(eu.open_ecvet.app.model.Learningoutcomelist.VT);
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdReset_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset();
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSave_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
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
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSaveAndNew_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		if(formular.verifyFormularComponents())
		{
			try
			{
				formular.save();
				formular.reset(eu.open_ecvet.app.model.Learningoutcomelist.VT);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void cmdSearch_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.search("AND",table);
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void formular_formularModelChanged(FormularEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void button2_actionPerformed(ActionEvent event) //  ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//  ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		VirtualTableRow formularVirtualTableRow = formular.getVirtualTableRow();
		// System.out.println("formularVirtualTableRow: " +
		// formularVirtualTableRow);
		
		// VirtualTableRow[] virtualTableRows =
		// nmListBox.getVirtualTable().getRows();
		// System.out.println(nmListBox.getVirtualTable());
		// System.out.println("virtualTableRows");
		// for (VirtualTableRow virtualTableRow : virtualTableRows) {
		// System.out.println(virtualTableRow);
		// }
		//
		// System.out.println("selectedVirtualTableRows");
		// VirtualTableRow[] selectedVirtualTableRows =
		// nmListBox.getSelectedVirtualTableRows();
		// for (VirtualTableRow selectedVirtualTableRow :
		// selectedVirtualTableRows) {
		// System.out.println(selectedVirtualTableRow);
		// }
		
	}//  ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	// Generated definitions, do not
	// edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevContainer	container, container3, container2;
	XdevButton		xShortcut, cmdNew, cmdReset, cmdSave, cmdSaveAndNew, cmdSearch, button2,
			button, deleteButton;
	XdevTextField	textField2, textField;
	XdevFormular	formular;
	XdevTable		table;
	XdevTextArea	textArea;
	XdevComboBox	comboBox2, comboBox;
	XdevLabel		label2, label6, label3, label4, label5, label;
	XdevNmListBox	nmListBox;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not
		// edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		xShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label6 = new XdevLabel();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		nmListBox = new XdevNmListBox();
		label4 = new XdevLabel();
		textField = new XdevTextField();
		label5 = new XdevLabel();
		comboBox2 = new XdevComboBox();
		label = new XdevLabel();
		comboBox = new XdevComboBox();
		container3 = new XdevContainer();
		cmdNew = new XdevButton();
		cmdReset = new XdevButton();
		cmdSave = new XdevButton();
		cmdSaveAndNew = new XdevButton();
		cmdSearch = new XdevButton();
		container2 = new XdevContainer();
		button2 = new XdevButton();
		button = new XdevButton();
		deleteButton = new XdevButton();
		
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setPreferredSize(new Dimension(800,600));
		xShortcut.setTabIndex(1);
		xShortcut.setText("Button");
		table.setTabIndex(3);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(Learningoutcomelist.VT,"ID, TITLE, URI, EVALUATIONS_TITLE, QUALIFICATIONFRAMEWORKLIST_TITLE",true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Learningoutcomelist.TITLE");
		textField2.setTabIndex(6);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label6.setText("Label");
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Learningoutcomelist.DESCRIPTION");
		textArea.setTabIndex(7);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		nmListBox.setTabIndex(16);
		label4.setText("URI");
		label4.setName("label4");
		textField.setDataField("eu.open_ecvet.app.model.Learningoutcomelist.URI");
		textField.setTabIndex(8);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("EVALUATIONS_ID");
		label5.setName("label5");
		comboBox2.setDataField("eu.open_ecvet.app.model.Learningoutcomelist.EVALUATIONS_ID");
		comboBox2.setTabIndex(9);
		comboBox2.setName("comboBox2");
		comboBox2.setModel(Evaluations.VT,"TITLE","ID",true);
		label.setText("QUALIFICATIONFRAMEWORKLIST_ID");
		comboBox.setDataField("eu.open_ecvet.app.model.Learningoutcomelist.QUALIFICATIONFRAMEWORKLIST_ID");
		comboBox.setTabIndex(10);
		comboBox.setModel(Qualificationframeworklist.VT,"TITLE","ID",true);
		cmdNew.setTabIndex(11);
		cmdNew.setText("Neu");
		cmdReset.setTabIndex(12);
		cmdReset.setText("Zurücksetzen");
		cmdSave.setTabIndex(13);
		cmdSave.setText("Speichern");
		cmdSaveAndNew.setTabIndex(14);
		cmdSaveAndNew.setText("Speichern + Neu");
		cmdSearch.setTabIndex(15);
		cmdSearch.setText("Suche");
		button2.setTabIndex(17);
		button2.setText("show row");
		button.setTabIndex(5);
		button.setText("Fill");
		deleteButton.setTabIndex(4);
		deleteButton.setText("Delete");
		
		table.saveState();
		MasterDetail.connect(table,formular);
		label2.saveState();
		textField2.saveState();
		label6.saveState();
		label3.saveState();
		textArea.saveState();
		nmListBox.saveState();
		label4.saveState();
		textField.saveState();
		label5.saveState();
		comboBox2.saveState();
		label.saveState();
		comboBox.saveState();
		
		container.setLayout(new GridBagLayout());
		container.add(xShortcut,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		GBC.addSpacer(container,true,true);
		container3.setLayout(new FlowLayout(FlowLayout.TRAILING,3,3));
		container3.add(cmdNew);
		container3.add(cmdReset);
		container3.add(cmdSave);
		container3.add(cmdSaveAndNew);
		container3.add(cmdSearch);
		formular.setLayout(new GridBagLayout());
		formular.add(label2,new GBC(1,1,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField2,new GBC(2,1,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(3,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(label3,new GBC(1,2,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		JScrollPane textArea_carrier = new XScrollPane(textArea,XScrollPane.VERTICAL_SCROLLBAR_ALWAYS,XScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		formular.add(textArea_carrier,new GBC(2,2,1,1,1.0,1.0,GBC.BASELINE_LEADING,GBC.BOTH,new Insets(3,3,3,3),0,0));
		JScrollPane nmListBox_carrier = new XScrollPane(nmListBox,XScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,XScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		formular.add(nmListBox_carrier,new GBC(3,2,1,4,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		formular.add(label4,new GBC(1,3,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField,new GBC(2,3,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label5,new GBC(1,4,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(comboBox2,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(comboBox,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(container3,new GBC(1,6,3,1,1.0,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(formular,true,true);
		container2.setLayout(new GridBagLayout());
		container2.add(button2,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(3,3,3,3),0,0));
		container2.add(button,new GBC(2,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(3,3,3,3),0,0));
		container2.add(deleteButton,new GBC(3,1,1,1,0.0,0.0,GBC.EAST,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(container2,true,true);
		this.setLayout(new GridBagLayout());
		this.add(container,new GBC(1,1,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		JScrollPane table_carrier = new XScrollPane(table,XScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,XScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(table_carrier,new GBC(1,2,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		this.add(formular,new GBC(1,3,1,1,0.1,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(0,0,0,0),0,0));
		this.add(container2,new GBC(1,4,1,1,0.1,0.0,GBC.EAST,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(this,true,true);
		
		nmListBox.setModel(LearningoutcomelistLearningoutcomelist.VT,"{$LEARNINGOUTCOMELISTCHILD_TITLE}","LEARNINGOUTCOMELIST_ID",true);
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				this_windowClosing(e);
			}
		});
		formular.addFormularListener(new FormularAdapter()
		{
			@Override
			public void formularModelChanged(FormularEvent event)
			{
				formular_formularModelChanged(event);
			}
		});
		cmdNew.addActionListener(e -> cmdNew_actionPerformed(e));
		cmdReset.addActionListener(e -> cmdReset_actionPerformed(e));
		cmdSave.addActionListener(e -> cmdSave_actionPerformed(e));
		cmdSaveAndNew.addActionListener(e -> cmdSaveAndNew_actionPerformed(e));
		cmdSearch.addActionListener(e -> cmdSearch_actionPerformed(e));
		button2.addActionListener(e -> button2_actionPerformed(e));
		button.addActionListener(e -> button_actionPerformed(e));
		deleteButton.addActionListener(e -> deleteButton_actionPerformed(e));
		this_init();
	}//  ${GENERATED-CODE-BLOCK-END:INITIALIZERS}
	
}