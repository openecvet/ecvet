
package eu.open_ecvet.app.view;


import xdev.db.DBException;
import xdev.lang.EventHandlerDelegate;
import xdev.ui.*;
import xdev.ui.text.TextFormat;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import eu.open_ecvet.app.helper.UpdateView;
import eu.open_ecvet.app.helper.UpdateViewHelper;
import eu.open_ecvet.app.model.Evaluations;
import eu.open_ecvet.app.model.Learningoutcomelist;
import eu.open_ecvet.app.model.Qualificationframeworklist;
import eu.open_ecvet.app.model.Unit;
import eu.open_ecvet.app.model.Unitlist;


public class UnitView extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	
	private UpdateView	updateView	= new UpdateView()
									{

										
										
										@Override
										public String getName()
										{
											return UnitView.class.getSimpleName();
										}


										public void update()
										{
											evaluationsComboBox.setModel(Evaluations.VT,"TITLE","ID",true);
											learningOutcomeListComboBox.setModel(Learningoutcomelist.VT,"TITLE","ID",true);
											qualificationFrameworkListComboBox.setModel(Qualificationframeworklist.VT,"TITLE","ID",true);
											unitListComboBox.setModel(Unitlist.VT,"TITLE","ID",true);
											
											table.refresh();
										}
									};
	
	
	public UnitView()
	{
		
	}
	
	
	public UnitView(MainWindow mainWindow)
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
			formular.reset(Unit.VT);
		}
		catch(DBException e)
		{
			// TODO Auto-generated code
			e.printStackTrace();
			updateView.update();
			this.openInDialog(new AlertWindow(),true);
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void this_init() // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		UpdateViewHelper.instance().add(updateView);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void unitListShortcut_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		mainWindow.tabbedPane.setSelectedComponent(mainWindow.unitListTab);
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void cmdNew_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		formular.reset(eu.open_ecvet.app.model.Unit.VT);
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
				formular.reset(eu.open_ecvet.app.model.Unit.VT);
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


	@EventHandlerDelegate void qualificationFrameworkListComboBox_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevContainer	container, container3, container2;
	XdevFormattedTextField	formattedTextField2, formattedTextField3, formattedTextField;
	XdevButton				evaluationShortcut, learningOutcomeListShortcut,
			qualificationFrameworkShortcut, unitListShortcut, cmdNew, cmdReset, cmdSave,
			cmdSaveAndNew, cmdSearch, deleteButton;
	XdevTextField			textField2, textField;
	XdevFormular			formular;
	XdevTable				table;
	XdevTextArea			textArea;
	XdevComboBox			evaluationsComboBox, learningOutcomeListComboBox,
			qualificationFrameworkListComboBox, unitListComboBox;
	XdevLabel				label2, label3, label4, label5, label6, label7, label8, label9,
			label10, label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		evaluationShortcut = new XdevButton();
		learningOutcomeListShortcut = new XdevButton();
		qualificationFrameworkShortcut = new XdevButton();
		unitListShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		label4 = new XdevLabel();
		formattedTextField2 = new XdevFormattedTextField();
		label5 = new XdevLabel();
		formattedTextField3 = new XdevFormattedTextField();
		label6 = new XdevLabel();
		textField = new XdevTextField();
		label7 = new XdevLabel();
		formattedTextField = new XdevFormattedTextField();
		label8 = new XdevLabel();
		evaluationsComboBox = new XdevComboBox();
		label9 = new XdevLabel();
		learningOutcomeListComboBox = new XdevComboBox();
		label10 = new XdevLabel();
		qualificationFrameworkListComboBox = new XdevComboBox();
		label = new XdevLabel();
		unitListComboBox = new XdevComboBox();
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
		evaluationShortcut.setTabIndex(35);
		evaluationShortcut.setText("Evaluation");
		evaluationShortcut.setName("xShortcut2");
		evaluationShortcut.setEnabled(false);
		learningOutcomeListShortcut.setTabIndex(1);
		learningOutcomeListShortcut.setText("Learning Outcome List");
		learningOutcomeListShortcut.setEnabled(false);
		qualificationFrameworkShortcut.setTabIndex(36);
		qualificationFrameworkShortcut.setText("Qualification Framework");
		qualificationFrameworkShortcut.setName("xShortcut3");
		qualificationFrameworkShortcut.setEnabled(false);
		unitListShortcut.setTabIndex(37);
		unitListShortcut.setText("Unit List");
		unitListShortcut.setName("xShortcut4");
		table.setTabIndex(38);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(Unit.VT,"TITLE, URI, EVALUATIONS_TITLE, LEARNINGOUTCOMELIST_TITLE, QUALIFICATIONFRAMEWORKLIST_TITLE, UNITLIST_TITLE",true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Unit.TITLE");
		textField2.setTabIndex(39);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Unit.DESCRIPTION");
		textArea.setTabIndex(40);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		label4.setText("CREDIT");
		label4.setName("label4");
		formattedTextField2.setDataField("eu.open_ecvet.app.model.Unit.CREDIT");
		formattedTextField2.setTabIndex(41);
		formattedTextField2.setName("formattedTextField2");
		formattedTextField2.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		formattedTextField2.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("RELATIVEWEIGHT");
		label5.setName("label5");
		formattedTextField3.setDataField("eu.open_ecvet.app.model.Unit.RELATIVEWEIGHT");
		formattedTextField3.setTabIndex(42);
		formattedTextField3.setName("formattedTextField3");
		formattedTextField3.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		formattedTextField3.setHorizontalAlignment(SwingConstants.LEFT);
		label6.setText("URI");
		label6.setName("label6");
		textField.setDataField("eu.open_ecvet.app.model.Unit.URI");
		textField.setTabIndex(43);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		label7.setText("WEIGHTSUM");
		label7.setName("label7");
		formattedTextField.setDataField("eu.open_ecvet.app.model.Unit.WEIGHTSUM");
		formattedTextField.setTabIndex(44);
		formattedTextField.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		formattedTextField.setHorizontalAlignment(SwingConstants.LEFT);
		label8.setText("EVALUATIONS_ID");
		label8.setName("label8");
		evaluationsComboBox.setDataField("eu.open_ecvet.app.model.Unit.EVALUATIONS_ID");
		evaluationsComboBox.setTabIndex(45);
		evaluationsComboBox.setName("comboBox2");
		evaluationsComboBox.setModel(Evaluations.VT,"TITLE","ID",true);
		label9.setText("LEARNINGOUTCOMELIST_ID");
		label9.setName("label9");
		learningOutcomeListComboBox.setDataField("eu.open_ecvet.app.model.Unit.LEARNINGOUTCOMELIST_ID");
		learningOutcomeListComboBox.setTabIndex(46);
		learningOutcomeListComboBox.setName("comboBox3");
		learningOutcomeListComboBox.setModel(Learningoutcomelist.VT,"ID","ID",true);
		label10.setText("QUALIFICATIONFRAMEWORKLIST_ID");
		label10.setName("label10");
		qualificationFrameworkListComboBox.setDataField("eu.open_ecvet.app.model.Unit.QUALIFICATIONFRAMEWORKLIST_ID");
		qualificationFrameworkListComboBox.setTabIndex(47);
		qualificationFrameworkListComboBox.setName("comboBox4");
		qualificationFrameworkListComboBox.setModel(Qualificationframeworklist.VT,"TITLE","ID",true);
		label.setText("UNITLIST_ID");
		unitListComboBox.setDataField("eu.open_ecvet.app.model.Unit.UNITLIST_ID");
		unitListComboBox.setTabIndex(48);
		unitListComboBox.setModel(Unitlist.VT,"TITLE","ID",true);
		cmdNew.setTabIndex(49);
		cmdNew.setText("New");
		cmdReset.setTabIndex(50);
		cmdReset.setText("Reset");
		cmdSave.setTabIndex(51);
		cmdSave.setText("Save");
		cmdSaveAndNew.setTabIndex(52);
		cmdSaveAndNew.setText("Save + New");
		cmdSearch.setTabIndex(53);
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
		formattedTextField2.saveState();
		label5.saveState();
		formattedTextField3.saveState();
		label6.saveState();
		textField.saveState();
		label7.saveState();
		formattedTextField.saveState();
		label8.saveState();
		evaluationsComboBox.saveState();
		label9.saveState();
		learningOutcomeListComboBox.saveState();
		label10.saveState();
		qualificationFrameworkListComboBox.saveState();
		label.saveState();
		unitListComboBox.saveState();
		
		container.setLayout(new GridBagLayout());
		container.add(evaluationShortcut,new GBC(1,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		container.add(learningOutcomeListShortcut,new GBC(2,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		container.add(qualificationFrameworkShortcut,new GBC(3,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
		container.add(unitListShortcut,new GBC(4,1,1,1,0.0,0.0,GBC.WEST,GBC.NONE,new Insets(0,0,0,0),0,0));
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
		formular.add(label3,new GBC(1,2,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		JScrollPane textArea_carrier = new XScrollPane(textArea,XScrollPane.VERTICAL_SCROLLBAR_ALWAYS,XScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		formular.add(textArea_carrier,new GBC(2,2,1,1,1.0,1.0,GBC.BASELINE_LEADING,GBC.BOTH,new Insets(3,3,3,3),0,0));
		formular.add(label4,new GBC(1,3,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(formattedTextField2,new GBC(2,3,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label5,new GBC(1,4,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(formattedTextField3,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label7,new GBC(1,6,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(formattedTextField,new GBC(2,6,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label8,new GBC(1,7,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(evaluationsComboBox,new GBC(2,7,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label9,new GBC(1,8,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(learningOutcomeListComboBox,new GBC(2,8,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label10,new GBC(1,9,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(qualificationFrameworkListComboBox,new GBC(2,9,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,10,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(unitListComboBox,new GBC(2,10,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(container3,new GBC(1,11,2,1,1.0,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
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
		unitListShortcut.addActionListener(e -> unitListShortcut_actionPerformed(e));
		qualificationFrameworkListComboBox.addActionListener(e -> qualificationFrameworkListComboBox_actionPerformed(e));
		cmdNew.addActionListener(e -> cmdNew_actionPerformed(e));
		cmdReset.addActionListener(e -> cmdReset_actionPerformed(e));
		cmdSave.addActionListener(e -> cmdSave_actionPerformed(e));
		cmdSaveAndNew.addActionListener(e -> cmdSaveAndNew_actionPerformed(e));
		cmdSearch.addActionListener(e -> cmdSearch_actionPerformed(e));
		deleteButton.addActionListener(e -> deleteButton_actionPerformed(e));
		this_init();
	}// ${GENERATED-CODE-BLOCK-END:INITIALIZERS}
	
}