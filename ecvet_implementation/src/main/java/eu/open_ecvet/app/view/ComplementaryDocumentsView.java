
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
import eu.open_ecvet.app.model.Complementarydocuments;
import eu.open_ecvet.app.model.Credittransferlist;
import eu.open_ecvet.app.model.Learningagreementlist;
import eu.open_ecvet.app.model.Memorandumofunderstanding;
import eu.open_ecvet.app.model.Procedureandguidelinelist;
import eu.open_ecvet.app.model.Transcriptsofrecordlist;
import eu.open_ecvet.app.model.Userguidelist;


public class ComplementaryDocumentsView extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	
	private UpdateView	updateView	= new UpdateView()
									{
										
										@Override
										public String getName()
										{
											
											return ComplementaryDocumentsView.class.getSimpleName();
										}
										
										
										public void update()
										{
											proceduresAndGuidelinesListComboBox.setModel(Procedureandguidelinelist.VT,"TITLE","ID",true);
											memorandumOfUnderstandingComboBox.setModel(Memorandumofunderstanding.VT,"TITLE","ID",true);
											creditTransferListComboBox.setModel(Credittransferlist.VT,"TITLE","ID",true);
											learningAgreementListComboBox.setModel(
													Learningagreementlist.VT,"TITLE","ID",true);
											transcriptsOfRecordListComboBox.setModel(Transcriptsofrecordlist.VT,"TITLE","ID",true);
											userGuideListComboBox.setModel(Userguidelist.VT,
													"TITLE","ID",true);
											table.refresh();
										}
									};
	
	
	public ComplementaryDocumentsView()
	{
		
	}
	
	
	public ComplementaryDocumentsView(MainWindow mainWindow)
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
			formular.reset(Complementarydocuments.VT);
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
	void this_init() // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	
		UpdateViewHelper.instance().add(updateView);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void cmdNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset(eu.open_ecvet.app.model.Complementarydocuments.VT);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void cmdReset_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void cmdSave_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
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


	@EventHandlerDelegate void cmdSaveAndNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		if(formular.verifyFormularComponents())
		{
			try
			{
				formular.save();
				formular.reset(eu.open_ecvet.app.model.Complementarydocuments.VT);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void cmdSearch_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.search("AND",table);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevContainer	container, container3, container2;
	XdevButton		learningAgreementListShortcut, transcriptionOfRecordListShortcut,
			userGuideListShortcut, cmdNew, cmdReset, cmdSave, cmdSaveAndNew, cmdSearch,
			deleteButton;
	XdevTextField	textField2, textField;
	XdevFormular	formular;
	XdevTable		table;
	XdevTextArea	textArea;
	XdevComboBox	creditTransferListComboBox, learningAgreementListComboBox,
			memorandumOfUnderstandingComboBox, proceduresAndGuidelinesListComboBox,
			transcriptsOfRecordListComboBox, userGuideListComboBox;
	XdevLabel		label2, label3, label4, label5, label6, label7, label8, label9, label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		learningAgreementListShortcut = new XdevButton();
		transcriptionOfRecordListShortcut = new XdevButton();
		userGuideListShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		label4 = new XdevLabel();
		textField = new XdevTextField();
		label5 = new XdevLabel();
		creditTransferListComboBox = new XdevComboBox();
		label6 = new XdevLabel();
		learningAgreementListComboBox = new XdevComboBox();
		label7 = new XdevLabel();
		memorandumOfUnderstandingComboBox = new XdevComboBox();
		label8 = new XdevLabel();
		proceduresAndGuidelinesListComboBox = new XdevComboBox();
		label9 = new XdevLabel();
		transcriptsOfRecordListComboBox = new XdevComboBox();
		label = new XdevLabel();
		userGuideListComboBox = new XdevComboBox();
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
		learningAgreementListShortcut.setTabIndex(1);
		learningAgreementListShortcut.setText("Learning Agreement List");
		learningAgreementListShortcut.setEnabled(false);
		transcriptionOfRecordListShortcut.setTabIndex(16);
		transcriptionOfRecordListShortcut.setText("Transcription of Record List");
		transcriptionOfRecordListShortcut.setName("xShortcut2");
		transcriptionOfRecordListShortcut.setEnabled(false);
		userGuideListShortcut.setTabIndex(17);
		userGuideListShortcut.setText("User Guide List");
		userGuideListShortcut.setName("xShortcut3");
		userGuideListShortcut.setEnabled(false);
		table.setTabIndex(3);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(Complementarydocuments.VT,"TITLE, URI, CREDITTRANSFERLIST_TITLE, LEARNINGAGREEMENTLIST_TITLE, MEMORANDUMOFUNDERSTANDING_TITLE, PROCEDUREANDGUIDELINELIST_TITLE, TRANSCRIPTSOFRECORDLIST_TITLE, USERGUIDELIST_TITLE",true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Complementarydocuments.TITLE");
		textField2.setTabIndex(18);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Complementarydocuments.DESCRIPTION");
		textArea.setTabIndex(19);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		label4.setText("URI");
		label4.setName("label4");
		textField.setDataField("eu.open_ecvet.app.model.Complementarydocuments.URI");
		textField.setTabIndex(20);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("CREDITTRANSFERLIST_ID");
		label5.setName("label5");
		creditTransferListComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.CREDITTRANSFERLIST_ID");
		creditTransferListComboBox.setTabIndex(21);
		creditTransferListComboBox.setName("comboBox2");
		creditTransferListComboBox.setModel(Credittransferlist.VT,"TITLE","ID",true);
		label6.setText("LEARNINGAGREEMENTLIST_ID");
		label6.setName("label6");
		learningAgreementListComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.LEARNINGAGREEMENTLIST_ID");
		learningAgreementListComboBox.setTabIndex(22);
		learningAgreementListComboBox.setName("comboBox3");
		learningAgreementListComboBox.setModel(Learningagreementlist.VT,"TITLE","ID",true);
		label7.setText("MEMORANDUMOFUNDERSTANDING_ID");
		label7.setName("label7");
		memorandumOfUnderstandingComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.MEMORANDUMOFUNDERSTANDING_ID");
		memorandumOfUnderstandingComboBox.setTabIndex(23);
		memorandumOfUnderstandingComboBox.setName("comboBox4");
		memorandumOfUnderstandingComboBox.setModel(Memorandumofunderstanding.VT,"TITLE","ID",true);
		label8.setText("PROCEDUREANDGUIDELINELIST_ID");
		label8.setName("label8");
		proceduresAndGuidelinesListComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.PROCEDUREANDGUIDELINELIST_ID");
		proceduresAndGuidelinesListComboBox.setTabIndex(24);
		proceduresAndGuidelinesListComboBox.setName("comboBox5");
		proceduresAndGuidelinesListComboBox.setModel(Procedureandguidelinelist.VT,"TITLE","ID",true);
		label9.setText("TRANSCRIPTSOFRECORDLIST_ID");
		label9.setName("label9");
		transcriptsOfRecordListComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.TRANSCRIPTSOFRECORDLIST_ID");
		transcriptsOfRecordListComboBox.setTabIndex(25);
		transcriptsOfRecordListComboBox.setName("comboBox6");
		transcriptsOfRecordListComboBox.setModel(Transcriptsofrecordlist.VT,"TITLE","ID",true);
		label.setText("USERGUIDELIST_ID");
		userGuideListComboBox.setDataField("eu.open_ecvet.app.model.Complementarydocuments.USERGUIDELIST_ID");
		userGuideListComboBox.setTabIndex(26);
		userGuideListComboBox.setModel(Userguidelist.VT,"TITLE","ID",true);
		cmdNew.setTabIndex(27);
		cmdNew.setText("New");
		cmdReset.setTabIndex(28);
		cmdReset.setText("Reset");
		cmdSave.setTabIndex(29);
		cmdSave.setText("Save");
		cmdSaveAndNew.setTabIndex(30);
		cmdSaveAndNew.setText("Save + New");
		cmdSearch.setTabIndex(31);
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
		creditTransferListComboBox.saveState();
		label6.saveState();
		learningAgreementListComboBox.saveState();
		label7.saveState();
		memorandumOfUnderstandingComboBox.saveState();
		label8.saveState();
		proceduresAndGuidelinesListComboBox.saveState();
		label9.saveState();
		transcriptsOfRecordListComboBox.saveState();
		label.saveState();
		userGuideListComboBox.saveState();
		
		container.setLayout(new GridBagLayout());
		container.add(learningAgreementListShortcut,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		container.add(transcriptionOfRecordListShortcut,new GBC(2,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		container.add(userGuideListShortcut,new GBC(3,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
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
		formular.add(label3,new GBC(1,2,1,1,0.1,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		JScrollPane textArea_carrier = new XScrollPane(textArea,XScrollPane.VERTICAL_SCROLLBAR_ALWAYS,XScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		formular.add(textArea_carrier,new GBC(2,2,1,1,1.0,1.0,GBC.BASELINE_LEADING,GBC.BOTH,new Insets(3,3,3,3),0,0));
		formular.add(label4,new GBC(1,3,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField,new GBC(2,3,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label5,new GBC(1,4,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(creditTransferListComboBox,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(learningAgreementListComboBox,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label7,new GBC(1,6,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(memorandumOfUnderstandingComboBox,new GBC(2,6,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label8,new GBC(1,7,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(proceduresAndGuidelinesListComboBox,new GBC(2,7,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label9,new GBC(1,8,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(transcriptsOfRecordListComboBox,new GBC(2,8,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,9,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(userGuideListComboBox,new GBC(2,9,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(container3,new GBC(1,10,2,1,1.0,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(formular,true,true);
		container2.setLayout(new GridBagLayout());
		container2.add(deleteButton,new GBC(1,1,1,1,0.0,0.0,GBC.EAST,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(container2,true,true);
		this.setLayout(new GridBagLayout());
		this.add(container,new GBC(1,1,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		JScrollPane table_carrier = new XScrollPane(table,XScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,XScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(table_carrier,new GBC(1,2,1,1,0.1,0.0,GBC.WEST,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		this.add(formular,new GBC(1,3,1,1,0.1,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(0,0,0,0),0,0));
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