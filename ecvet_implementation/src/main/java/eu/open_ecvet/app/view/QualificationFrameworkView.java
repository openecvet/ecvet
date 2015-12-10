
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
import eu.open_ecvet.app.model.Qualificationframework;


public class QualificationFrameworkView extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	private MainWindow	mainWindow;
	
	private UpdateView	updateView	= new UpdateView()
									{
										
										@Override
										public String getName()
										{
											
											return QualificationFrameworkView.class.getSimpleName();
										}
										
										
										public void update()
										{
											table.refresh();
											//	comboBox.refresh();
										}
									};
	
	
	public QualificationFrameworkView()
	{
		
	}
	
	
	public QualificationFrameworkView(MainWindow mainWindow)
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
			formular.reset(Qualificationframework.VT);
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
		formular.reset(eu.open_ecvet.app.model.Qualificationframework.VT);
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
				formular.reset(eu.open_ecvet.app.model.Qualificationframework.VT);
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
	XdevContainer			container, container3, container2;
	XdevFormattedTextField	formattedTextField;
	XdevButton				xShortcut, cmdNew, cmdReset, cmdSave, cmdSaveAndNew, cmdSearch,
			deleteButton;
	XdevTextField			textField2, textField3, textField4, textField5, textField;
	XdevFormular			formular;
	XdevTable				table;
	XdevTextArea			textArea;
	XdevLabel				label2, label3, label4, label5, label6, label7, label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		container = new XdevContainer();
		xShortcut = new XdevButton();
		table = new XdevTable();
		formular = new XdevFormular();
		label2 = new XdevLabel();
		textField2 = new XdevTextField();
		label3 = new XdevLabel();
		textArea = new XdevTextArea();
		label4 = new XdevLabel();
		textField3 = new XdevTextField();
		label5 = new XdevLabel();
		formattedTextField = new XdevFormattedTextField();
		label6 = new XdevLabel();
		textField4 = new XdevTextField();
		label7 = new XdevLabel();
		textField5 = new XdevTextField();
		label = new XdevLabel();
		textField = new XdevTextField();
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
		xShortcut.setTabIndex(1);
		xShortcut.setText("Button");
		table.setTabIndex(3);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(Qualificationframework.VT,"TITLE, URI",true);
		label2.setText("TITLE");
		label2.setName("label2");
		textField2.setDataField("eu.open_ecvet.app.model.Qualificationframework.TITLE");
		textField2.setTabIndex(5);
		textField2.setMaxSignCount(Integer.MAX_VALUE);
		textField2.setName("textField2");
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setText("DESCRIPTION");
		label3.setName("label3");
		textArea.setDataField("eu.open_ecvet.app.model.Qualificationframework.DESCRIPTION");
		textArea.setTabIndex(6);
		textArea.setMaxSignCount(Integer.MAX_VALUE);
		label4.setText("FRAMEWORK");
		label4.setName("label4");
		textField3.setDataField("eu.open_ecvet.app.model.Qualificationframework.FRAMEWORK");
		textField3.setTabIndex(7);
		textField3.setMaxSignCount(Integer.MAX_VALUE);
		textField3.setName("textField3");
		textField3.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setText("FRAMEWORKLEVEL");
		label5.setName("label5");
		formattedTextField.setDataField("eu.open_ecvet.app.model.Qualificationframework.FRAMEWORKLEVEL");
		formattedTextField.setTabIndex(8);
		formattedTextField.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		formattedTextField.setHorizontalAlignment(SwingConstants.LEFT);
		label6.setText("FRAMEWORKTERM");
		label6.setName("label6");
		textField4.setDataField("eu.open_ecvet.app.model.Qualificationframework.FRAMEWORKTERM");
		textField4.setTabIndex(9);
		textField4.setMaxSignCount(Integer.MAX_VALUE);
		textField4.setName("textField4");
		textField4.setHorizontalAlignment(SwingConstants.LEFT);
		label7.setText("INDICATOR");
		label7.setName("label7");
		textField5.setDataField("eu.open_ecvet.app.model.Qualificationframework.INDICATOR");
		textField5.setTabIndex(10);
		textField5.setMaxSignCount(Integer.MAX_VALUE);
		textField5.setName("textField5");
		textField5.setHorizontalAlignment(SwingConstants.LEFT);
		label.setText("URI");
		textField.setDataField("eu.open_ecvet.app.model.Qualificationframework.URI");
		textField.setTabIndex(11);
		textField.setMaxSignCount(Integer.MAX_VALUE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		cmdNew.setTabIndex(12);
		cmdNew.setText("New");
		cmdReset.setTabIndex(13);
		cmdReset.setText("Reset");
		cmdSave.setTabIndex(14);
		cmdSave.setText("Save");
		cmdSaveAndNew.setTabIndex(15);
		cmdSaveAndNew.setText("Save + New");
		cmdSearch.setTabIndex(16);
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
		textField3.saveState();
		label5.saveState();
		formattedTextField.saveState();
		label6.saveState();
		textField4.saveState();
		label7.saveState();
		textField5.saveState();
		label.saveState();
		textField.saveState();
		
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
		formular.add(label3,new GBC(1,2,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		JScrollPane textArea_carrier = new XScrollPane(textArea,XScrollPane.VERTICAL_SCROLLBAR_ALWAYS,XScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		formular.add(textArea_carrier,new GBC(2,2,1,1,1.0,1.0,GBC.BASELINE_LEADING,GBC.BOTH,new Insets(3,3,3,3),0,0));
		formular.add(label4,new GBC(1,3,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField3,new GBC(2,3,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label5,new GBC(1,4,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(formattedTextField,new GBC(2,4,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label6,new GBC(1,5,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField4,new GBC(2,5,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label7,new GBC(1,6,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField5,new GBC(2,6,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(label,new GBC(1,7,1,1,0.0,0.0,GBC.BASELINE_LEADING,GBC.NONE,new Insets(3,3,3,3),0,0));
		formular.add(textField,new GBC(2,7,1,1,1.0,0.0,GBC.BASELINE_LEADING,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
		formular.add(container3,new GBC(1,8,2,1,1.0,0.0,GBC.CENTER,GBC.HORIZONTAL,new Insets(3,3,3,3),0,0));
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