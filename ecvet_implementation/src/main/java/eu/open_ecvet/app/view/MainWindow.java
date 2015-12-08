
package eu.open_ecvet.app.view;


import xdev.lang.EventHandlerDelegate;
import xdev.ui.*;
import xdev.ui.DefaultAction;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

import eu.open_ecvet.app.helper.UpdateView;
import eu.open_ecvet.app.helper.UpdateViewHelper;


public class MainWindow extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	
	@EventHandlerDelegate
	void this_windowClosing(WindowEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		close();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void menuItem2_actionPerformed(ActionEvent arg0) //�${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{//�${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
	
	}//�${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void this_init() // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		frameworkTab.setName(FrameworkView.class.getSimpleName());
		competentInstitutionListTab.setName(CompetentInstitutionListView.class.getSimpleName());
		competentInstitutionTab.setName(CompetentInstitutionView.class.getSimpleName());
		partnerListTab.setName(PartnerListView.class.getSimpleName());
		partnerTab.setName(PartnerView.class.getSimpleName());
		legislationTab.setName(LegislationView.class.getSimpleName());
		complementaryDocumentsTab.setName(ComplementaryDocumentsView.class.getSimpleName());
		learningAgreementListTab.setName(LearningAgreementListView.class.getSimpleName());
		learningAgreementTab.setName(LearningAgreementView.class.getSimpleName());
		transcriptionOfRecordListTab.setName(TranscriptionOfRecordListView.class.getSimpleName());
		transcriptionOfRecordTab.setName(TranscriptionOfRecordView.class.getSimpleName());
		userGuideListTab.setName(UserGuideListView.class.getSimpleName());
		userGuideTab.setName(UserGuideView.class.getSimpleName());
		qualificationTab.setName(QualificationView.class.getSimpleName());
		unitListTab.setName(UnitListView.class.getSimpleName());
		unitTab.setName(UnitView.class.getSimpleName());
		learningOutcomeListTab.setName(LearningOutcomeListView.class.getSimpleName());
		learningOutcomeTab.setName(LearningOutcomeView.class.getSimpleName());
		learningOutcomeTermListTab.setName(LearningOutcomeTermListView.class.getSimpleName());
		learningOutcomeTermTab.setName(LearningOutcomeTermView.class.getSimpleName());
		referenceLevelListTab.setName(ReferenceLevelListView.class.getSimpleName());
		referenceLevelTab.setName(ReferenceLevelView.class.getSimpleName());
		evaluationsTab.setName(EvaluationsView.class.getSimpleName());
		assessmentListTab.setName(AssessmentListView.class.getSimpleName());
		assessmentTab.setName(AssessmentView.class.getSimpleName());
		methodListTab.setName(MethodListView.class.getSimpleName());
		methodTab.setName(MethodView.class.getSimpleName());
		processListTab.setName(ProcessListView.class.getSimpleName());
		processTab.setName(ProcessView.class.getSimpleName());
		validationListTab.setName(ValidationListView.class.getSimpleName());
		validationTab.setName(ValidationView.class.getSimpleName());
		confirmingRequirementListTab.setName(ConfirmingRequirementListView.class.getSimpleName());
		confirmingRequirementTab.setName(ConfirmingRequirementView.class.getSimpleName());
		recognitionListTab.setName(RecognitionListView.class.getSimpleName());
		recognitionTab.setName(RecognitionView.class.getSimpleName());
		certificateTemplateTab.setName(CertificateTemplateView.class.getSimpleName());
		
		attachmentTab.setName(AttachmentView.class.getSimpleName());
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	
	@EventHandlerDelegate
	void tabbedPane_stateChanged(ChangeEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		String tabName = tabbedPane.getSelectedComponent().getName();
		System.out.println(tabName);
		UpdateView updateView = UpdateViewHelper.instance().get(tabName);
		
		if(updateView != null)
		{
			updateView.update();
		}
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}
	
	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevPicture	picture;
	XdevMenuBar	menuBar;
	XdevTab		tab, frameworkTab, competentInstitutionListTab, competentInstitutionTab,
			partnerListTab, partnerTab, legislationTab, complementaryDocumentsTab,
			learningAgreementListTab, learningAgreementTab, transcriptionOfRecordListTab,
			transcriptionOfRecordTab, userGuideListTab, userGuideTab, qualificationTab,
			unitListTab, unitTab, learningOutcomeListTab, learningOutcomeTab,
			learningOutcomeTermListTab, learningOutcomeTermTab, evaluationsTab, assessmentListTab,
			assessmentTab, methodListTab, methodTab, processListTab, processTab, validationListTab,
			validationTab, confirmingRequirementListTab, confirmingRequirementTab,
			recognitionListTab, recognitionTab, certificateTemplateTab, referenceLevelListTab,
			referenceLevelTab, attachmentTab;
	XdevMenuItem	menuItem, menuItem2;
	XdevTabbedPane	tabbedPane;
	XdevWindowContainer	frameworkContainer, competentInstitutionListWindowContainer,
			competentInstitutionWindowContainer, partnerListWindowContainer,
			partnerWindowContainer, legislationWindowContainer,
			complementaryDocumentsWindowContainer, learningAgreementListWindowContainer,
			learningAgreementWindowContainer, transcriptionOfRecordListWindowContainer,
			transcriptionOfRecordWindowContainer, userGuideListWindowContainer,
			userGuideWindowContainer, qualificationContainer, unitsContainer, unitContainer,
			learningOutcomeListWindowContainer, learningOutcomeWindowContainer,
			learningOutcomeTermListWindowContainer, learningOutcomeTermWindowContainer,
			evaluationsWindowContainer, assessmentListWindowContainer, asssessmentWindowContainer,
			methodListWindowContainer, methodWindowContainer, processListWindowContainer,
			processWindowContainer, validationListWindowContainer, validationWindowContainer,
			confirmingRequirementListWindowContainer, confirmingRequirementWindowContainer,
			recognitionListWindowContainer, recognitionWindowContainer,
			certificateTemplateWindowContainer, referenceLevelListWindowContainer,
			referenceLevelWindowContainer, attachmentWindowContainer;
	XdevLabel			label, label2;
	XdevMenu			menu;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}
	
	MainWindow			self	= this;
	
	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		menuBar = new XdevMenuBar();
		menu = new XdevMenu();
		menuItem = new XdevMenuItem(new DefaultAction("Save",null,null,null,true));
		menuItem2 = new XdevMenuItem(new DefaultAction("About",null,null,null,true));
		tabbedPane = new XdevTabbedPane();
		tab = new XdevTab();
		label = new XdevLabel();
		picture = new XdevPicture();
		label2 = new XdevLabel();
		frameworkTab = new XdevTab();
		frameworkContainer = new XdevWindowContainer();
		competentInstitutionListTab = new XdevTab();
		competentInstitutionListWindowContainer = new XdevWindowContainer();
		competentInstitutionTab = new XdevTab();
		competentInstitutionWindowContainer = new XdevWindowContainer();
		partnerListTab = new XdevTab();
		partnerListWindowContainer = new XdevWindowContainer();
		partnerTab = new XdevTab();
		partnerWindowContainer = new XdevWindowContainer();
		legislationTab = new XdevTab();
		legislationWindowContainer = new XdevWindowContainer();
		complementaryDocumentsTab = new XdevTab();
		complementaryDocumentsWindowContainer = new XdevWindowContainer();
		learningAgreementListTab = new XdevTab();
		learningAgreementListWindowContainer = new XdevWindowContainer();
		learningAgreementTab = new XdevTab();
		learningAgreementWindowContainer = new XdevWindowContainer();
		transcriptionOfRecordListTab = new XdevTab();
		transcriptionOfRecordListWindowContainer = new XdevWindowContainer();
		transcriptionOfRecordTab = new XdevTab();
		transcriptionOfRecordWindowContainer = new XdevWindowContainer();
		userGuideListTab = new XdevTab();
		userGuideListWindowContainer = new XdevWindowContainer();
		userGuideTab = new XdevTab();
		userGuideWindowContainer = new XdevWindowContainer();
		qualificationTab = new XdevTab();
		qualificationContainer = new XdevWindowContainer();
		unitListTab = new XdevTab();
		unitsContainer = new XdevWindowContainer();
		unitTab = new XdevTab();
		unitContainer = new XdevWindowContainer();
		learningOutcomeListTab = new XdevTab();
		learningOutcomeListWindowContainer = new XdevWindowContainer();
		learningOutcomeTab = new XdevTab();
		learningOutcomeWindowContainer = new XdevWindowContainer();
		learningOutcomeTermListTab = new XdevTab();
		learningOutcomeTermListWindowContainer = new XdevWindowContainer();
		learningOutcomeTermTab = new XdevTab();
		learningOutcomeTermWindowContainer = new XdevWindowContainer();
		evaluationsTab = new XdevTab();
		evaluationsWindowContainer = new XdevWindowContainer();
		assessmentListTab = new XdevTab();
		assessmentListWindowContainer = new XdevWindowContainer();
		assessmentTab = new XdevTab();
		asssessmentWindowContainer = new XdevWindowContainer();
		methodListTab = new XdevTab();
		methodListWindowContainer = new XdevWindowContainer();
		methodTab = new XdevTab();
		methodWindowContainer = new XdevWindowContainer();
		processListTab = new XdevTab();
		processListWindowContainer = new XdevWindowContainer();
		processTab = new XdevTab();
		processWindowContainer = new XdevWindowContainer();
		validationListTab = new XdevTab();
		validationListWindowContainer = new XdevWindowContainer();
		validationTab = new XdevTab();
		validationWindowContainer = new XdevWindowContainer();
		confirmingRequirementListTab = new XdevTab();
		confirmingRequirementListWindowContainer = new XdevWindowContainer();
		confirmingRequirementTab = new XdevTab();
		confirmingRequirementWindowContainer = new XdevWindowContainer();
		recognitionListTab = new XdevTab();
		recognitionListWindowContainer = new XdevWindowContainer();
		recognitionTab = new XdevTab();
		recognitionWindowContainer = new XdevWindowContainer();
		certificateTemplateTab = new XdevTab();
		certificateTemplateWindowContainer = new XdevWindowContainer();
		referenceLevelListTab = new XdevTab();
		referenceLevelListWindowContainer = new XdevWindowContainer();
		referenceLevelTab = new XdevTab();
		referenceLevelWindowContainer = new XdevWindowContainer();
		attachmentTab = new XdevTab();
		attachmentWindowContainer = new XdevWindowContainer();
		
		this.setIcon(UIUtils.loadIcon("./res/cube.png"));
		this.setTitle("open-ecvet - the open ecvet implementation");
		this.setFont(new Font("Arial",Font.PLAIN,11));
		this.setPreferredSize(new Dimension(800,600));
		menu.setText("File");
		tabbedPane.setTabPlacement(XdevTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tab.setTitle("Welcome");
		tab.setIndex(0);
		label.setText("Welcome to the open-ecvet implementation");
		label.setFont(new Font("Arial Black",Font.PLAIN,19));
		picture.setImagePath("res/impact_logo.png");
		label2.setText("see: http://open-ecvet.eu");
		frameworkTab.setTitle("Framework");
		frameworkTab.setIndex(1);
		frameworkContainer.setXdevWindow(new FrameworkView(self));
		competentInstitutionListTab.setTitle("Competent Institution List");
		competentInstitutionListTab.setIndex(2);
		competentInstitutionListWindowContainer.setXdevWindow(new CompetentInstitutionListView(self));
		competentInstitutionTab.setTitle("Competent Institution");
		competentInstitutionTab.setIndex(3);
		competentInstitutionWindowContainer.setXdevWindow(new CompetentInstitutionView(self));
		partnerListTab.setTitle("Partner List");
		partnerListTab.setIndex(4);
		partnerListWindowContainer.setXdevWindow(new PartnerListView(self));
		partnerTab.setTitle("Partner");
		partnerTab.setIndex(5);
		partnerWindowContainer.setXdevWindow(new PartnerView(self));
		legislationTab.setTitle("Legislation");
		legislationTab.setIndex(6);
		legislationWindowContainer.setXdevWindow(new LegislationView(self));
		complementaryDocumentsTab.setTitle("Complementary Documents");
		complementaryDocumentsTab.setIndex(7);
		complementaryDocumentsWindowContainer.setXdevWindow(new ComplementaryDocumentsView(self));
		learningAgreementListTab.setTitle("Learning Agreement List");
		learningAgreementListTab.setIndex(8);
		learningAgreementListWindowContainer.setXdevWindow(new LearningAgreementListView(self));
		learningAgreementTab.setTitle("Learning Agreement");
		learningAgreementTab.setIndex(9);
		learningAgreementWindowContainer.setXdevWindow(new LearningAgreementView(self));
		transcriptionOfRecordListTab.setTitle("Transcription of Record List");
		transcriptionOfRecordListTab.setIndex(10);
		transcriptionOfRecordListWindowContainer.setXdevWindow(new TranscriptionOfRecordListView(self));
		transcriptionOfRecordTab.setTitle("Transcription of Record");
		transcriptionOfRecordTab.setIndex(11);
		transcriptionOfRecordWindowContainer.setXdevWindow(new TranscriptionOfRecordView(self));
		userGuideListTab.setTitle("User Guide List");
		userGuideListTab.setIndex(12);
		userGuideListWindowContainer.setXdevWindow(new UserGuideListView(self));
		userGuideTab.setTitle("User Guide");
		userGuideTab.setIndex(13);
		userGuideWindowContainer.setXdevWindow(new UserGuideView(self));
		qualificationTab.setTitle("Qualification");
		qualificationTab.setIndex(14);
		qualificationContainer.setXdevWindow(new QualificationView(self));
		unitListTab.setTitle("Unit List");
		unitListTab.setIndex(15);
		unitsContainer.setXdevWindow(new UnitListView(self));
		unitTab.setTitle("Unit");
		unitTab.setIndex(16);
		unitContainer.setXdevWindow(new UnitView(self));
		learningOutcomeListTab.setTitle("Learning Outcome List");
		learningOutcomeListTab.setIndex(17);
		learningOutcomeListWindowContainer.setXdevWindow(new LearningOutcomeListView(self));
		learningOutcomeTab.setTitle("Learning Outcome");
		learningOutcomeTab.setIndex(18);
		learningOutcomeWindowContainer.setXdevWindow(new LearningOutcomeView(self));
		learningOutcomeTermListTab.setTitle("Learning Outcome Term List");
		learningOutcomeTermListTab.setIndex(19);
		learningOutcomeTermListWindowContainer.setXdevWindow(new LearningOutcomeTermListView(self));
		learningOutcomeTermTab.setTitle("Learning Outcome Term");
		learningOutcomeTermTab.setIndex(20);
		learningOutcomeTermWindowContainer.setXdevWindow(new LearningOutcomeTermView(self));
		evaluationsTab.setTitle("Evaluations");
		evaluationsTab.setIndex(21);
		evaluationsWindowContainer.setXdevWindow(new EvaluationsView(self));
		assessmentListTab.setTitle("Assessment List");
		assessmentListTab.setIndex(22);
		assessmentListWindowContainer.setXdevWindow(new AssessmentListView(self));
		assessmentTab.setTitle("Assessment");
		assessmentTab.setIndex(23);
		asssessmentWindowContainer.setXdevWindow(new AssessmentView(self));
		methodListTab.setTitle("Method List");
		methodListTab.setIndex(24);
		methodListWindowContainer.setXdevWindow(new MethodListView(self));
		methodTab.setTitle("Method");
		methodTab.setIndex(25);
		methodWindowContainer.setXdevWindow(new MethodView(self));
		processListTab.setTitle("Process List");
		processListTab.setIndex(26);
		processListWindowContainer.setXdevWindow(new ProcessListView(self));
		processTab.setTitle("Process");
		processTab.setIndex(27);
		processWindowContainer.setXdevWindow(new ProcessView(self));
		validationListTab.setTitle("Validation List");
		validationListTab.setIndex(28);
		validationListWindowContainer.setXdevWindow(new ValidationListView(self));
		validationTab.setTitle("Validation");
		validationTab.setIndex(29);
		validationWindowContainer.setXdevWindow(new ValidationView(self));
		confirmingRequirementListTab.setTitle("Confirming Requirement List");
		confirmingRequirementListTab.setIndex(30);
		confirmingRequirementListWindowContainer.setXdevWindow(new ConfirmingRequirementListView(self));
		confirmingRequirementTab.setTitle("Confirming Requirement");
		confirmingRequirementTab.setIndex(31);
		confirmingRequirementWindowContainer.setXdevWindow(new ConfirmingRequirementView(self));
		recognitionListTab.setTitle("Recognition List");
		recognitionListTab.setIndex(32);
		recognitionListWindowContainer.setXdevWindow(new RecognitionListView(self));
		recognitionTab.setTitle("Recognition");
		recognitionTab.setIndex(33);
		recognitionWindowContainer.setXdevWindow(new RecognitionView(self));
		certificateTemplateTab.setTitle("Certificate Template");
		certificateTemplateTab.setIndex(34);
		certificateTemplateWindowContainer.setXdevWindow(new CertificateTemplateView(self));
		referenceLevelListTab.setTitle("Reference Level List");
		referenceLevelListTab.setIndex(35);
		referenceLevelListWindowContainer.setXdevWindow(new ReferenceLevelListView(self));
		referenceLevelTab.setTitle("Reference Level");
		referenceLevelTab.setIndex(36);
		referenceLevelWindowContainer.setXdevWindow(new ReferenceLevelView(self));
		attachmentTab.setTitle("Attachment");
		attachmentTab.setIndex(37);
		attachmentWindowContainer.setXdevWindow(new AttachmentView(self));
		
		label.saveState();
		picture.saveState();
		label2.saveState();
		
		menu.add(menuItem);
		menu.add(menuItem2);
		menuBar.add(menu);
		tab.setLayout(new GridBagLayout());
		tab.add(label,new GBC(2,1,1,1,0.0,0.0,GBC.SOUTH,GBC.NONE,new Insets(3,3,3,3),0,0));
		picture.setPreferredSize(new Dimension(300,104));
		tab.add(picture,new GBC(2,2,1,1,0.1,0.0,GBC.CENTER,GBC.NONE,new Insets(3,3,3,3),0,0));
		tab.add(label2,new GBC(2,3,1,1,0.0,0.0,GBC.CENTER,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(tab,true,true);
		frameworkTab.setLayout(new GridBagLayout());
		frameworkContainer.setPreferredSize(new Dimension(200,200));
		frameworkTab.add(frameworkContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(frameworkTab,true,true);
		competentInstitutionListTab.setLayout(new GridBagLayout());
		competentInstitutionListWindowContainer.setPreferredSize(new Dimension(200,200));
		competentInstitutionListTab.add(competentInstitutionListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(competentInstitutionListTab,true,true);
		competentInstitutionTab.setLayout(new GridBagLayout());
		competentInstitutionWindowContainer.setPreferredSize(new Dimension(200,200));
		competentInstitutionTab.add(competentInstitutionWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(competentInstitutionTab,true,true);
		partnerListTab.setLayout(new GridBagLayout());
		partnerListWindowContainer.setPreferredSize(new Dimension(200,200));
		partnerListTab.add(partnerListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(partnerListTab,true,true);
		partnerTab.setLayout(new GridBagLayout());
		partnerWindowContainer.setPreferredSize(new Dimension(200,200));
		partnerTab.add(partnerWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(partnerTab,true,true);
		legislationTab.setLayout(new GridBagLayout());
		legislationWindowContainer.setPreferredSize(new Dimension(200,200));
		legislationTab.add(legislationWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(legislationTab,true,true);
		complementaryDocumentsTab.setLayout(new GridBagLayout());
		complementaryDocumentsWindowContainer.setPreferredSize(new Dimension(200,200));
		complementaryDocumentsTab.add(complementaryDocumentsWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(complementaryDocumentsTab,true,true);
		learningAgreementListTab.setLayout(new GridBagLayout());
		learningAgreementListWindowContainer.setPreferredSize(new Dimension(200,200));
		learningAgreementListTab.add(learningAgreementListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningAgreementListTab,true,true);
		learningAgreementTab.setLayout(new GridBagLayout());
		learningAgreementWindowContainer.setPreferredSize(new Dimension(200,200));
		learningAgreementTab.add(learningAgreementWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningAgreementTab,true,true);
		transcriptionOfRecordListTab.setLayout(new GridBagLayout());
		transcriptionOfRecordListWindowContainer.setPreferredSize(new Dimension(200,200));
		transcriptionOfRecordListTab.add(transcriptionOfRecordListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(transcriptionOfRecordListTab,true,true);
		transcriptionOfRecordTab.setLayout(new GridBagLayout());
		transcriptionOfRecordWindowContainer.setPreferredSize(new Dimension(200,200));
		transcriptionOfRecordTab.add(transcriptionOfRecordWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(transcriptionOfRecordTab,true,true);
		userGuideListTab.setLayout(new GridBagLayout());
		userGuideListWindowContainer.setPreferredSize(new Dimension(200,200));
		userGuideListTab.add(userGuideListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(userGuideListTab,true,true);
		userGuideTab.setLayout(new GridBagLayout());
		userGuideWindowContainer.setPreferredSize(new Dimension(200,200));
		userGuideTab.add(userGuideWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(userGuideTab,true,true);
		qualificationTab.setLayout(new GridBagLayout());
		qualificationContainer.setPreferredSize(new Dimension(200,200));
		qualificationTab.add(qualificationContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(qualificationTab,true,true);
		unitListTab.setLayout(new GridBagLayout());
		unitsContainer.setPreferredSize(new Dimension(200,200));
		unitListTab.add(unitsContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(unitListTab,true,true);
		unitTab.setLayout(new GridBagLayout());
		unitContainer.setPreferredSize(new Dimension(200,200));
		unitTab.add(unitContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(unitTab,true,true);
		learningOutcomeListTab.setLayout(new GridBagLayout());
		learningOutcomeListWindowContainer.setPreferredSize(new Dimension(200,200));
		learningOutcomeListTab.add(learningOutcomeListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningOutcomeListTab,true,true);
		learningOutcomeTab.setLayout(new GridBagLayout());
		learningOutcomeWindowContainer.setPreferredSize(new Dimension(200,200));
		learningOutcomeTab.add(learningOutcomeWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningOutcomeTab,true,true);
		learningOutcomeTermListTab.setLayout(new GridBagLayout());
		learningOutcomeTermListWindowContainer.setPreferredSize(new Dimension(200,200));
		learningOutcomeTermListTab.add(learningOutcomeTermListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningOutcomeTermListTab,true,true);
		learningOutcomeTermTab.setLayout(new GridBagLayout());
		learningOutcomeTermWindowContainer.setPreferredSize(new Dimension(200,200));
		learningOutcomeTermTab.add(learningOutcomeTermWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(learningOutcomeTermTab,true,true);
		evaluationsTab.setLayout(new GridBagLayout());
		evaluationsWindowContainer.setPreferredSize(new Dimension(200,200));
		evaluationsTab.add(evaluationsWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(evaluationsTab,true,true);
		assessmentListTab.setLayout(new GridBagLayout());
		assessmentListWindowContainer.setPreferredSize(new Dimension(200,200));
		assessmentListTab.add(assessmentListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(assessmentListTab,true,true);
		assessmentTab.setLayout(new GridBagLayout());
		asssessmentWindowContainer.setPreferredSize(new Dimension(200,200));
		assessmentTab.add(asssessmentWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(assessmentTab,true,true);
		methodListTab.setLayout(new GridBagLayout());
		methodListWindowContainer.setPreferredSize(new Dimension(200,200));
		methodListTab.add(methodListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(methodListTab,true,true);
		methodTab.setLayout(new GridBagLayout());
		methodWindowContainer.setPreferredSize(new Dimension(200,200));
		methodTab.add(methodWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(methodTab,true,true);
		processListTab.setLayout(new GridBagLayout());
		processListWindowContainer.setPreferredSize(new Dimension(200,200));
		processListTab.add(processListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(processListTab,true,true);
		processTab.setLayout(new GridBagLayout());
		processWindowContainer.setPreferredSize(new Dimension(200,200));
		processTab.add(processWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(processTab,true,true);
		validationListTab.setLayout(new GridBagLayout());
		validationListWindowContainer.setPreferredSize(new Dimension(200,200));
		validationListTab.add(validationListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(validationListTab,true,true);
		validationTab.setLayout(new GridBagLayout());
		validationWindowContainer.setPreferredSize(new Dimension(200,200));
		validationTab.add(validationWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(validationTab,true,true);
		confirmingRequirementListTab.setLayout(new GridBagLayout());
		confirmingRequirementListWindowContainer.setPreferredSize(new Dimension(200,200));
		confirmingRequirementListTab.add(confirmingRequirementListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(confirmingRequirementListTab,true,true);
		confirmingRequirementTab.setLayout(new GridBagLayout());
		confirmingRequirementWindowContainer.setPreferredSize(new Dimension(200,200));
		confirmingRequirementTab.add(confirmingRequirementWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(confirmingRequirementTab,true,true);
		recognitionListTab.setLayout(new GridBagLayout());
		recognitionListWindowContainer.setPreferredSize(new Dimension(200,200));
		recognitionListTab.add(recognitionListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(recognitionListTab,true,true);
		recognitionTab.setLayout(new GridBagLayout());
		recognitionWindowContainer.setPreferredSize(new Dimension(200,200));
		recognitionTab.add(recognitionWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(recognitionTab,true,true);
		certificateTemplateTab.setLayout(new GridBagLayout());
		certificateTemplateWindowContainer.setPreferredSize(new Dimension(200,200));
		certificateTemplateTab.add(certificateTemplateWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(certificateTemplateTab,true,true);
		referenceLevelListTab.setLayout(new GridBagLayout());
		referenceLevelListWindowContainer.setPreferredSize(new Dimension(200,200));
		referenceLevelListTab.add(referenceLevelListWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(referenceLevelListTab,true,true);
		referenceLevelTab.setLayout(new GridBagLayout());
		referenceLevelWindowContainer.setPreferredSize(new Dimension(200,200));
		referenceLevelTab.add(referenceLevelWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(referenceLevelTab,true,true);
		attachmentTab.setLayout(new GridBagLayout());
		attachmentWindowContainer.setPreferredSize(new Dimension(200,200));
		attachmentTab.add(attachmentWindowContainer,new GBC(1,1,1,1,1.0,1.0,GBC.WEST,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(attachmentTab,true,true);
		tabbedPane.addTab(tab);
		tabbedPane.addTab(frameworkTab);
		tabbedPane.addTab(competentInstitutionListTab);
		tabbedPane.addTab(competentInstitutionTab);
		tabbedPane.addTab(partnerListTab);
		tabbedPane.addTab(partnerTab);
		tabbedPane.addTab(legislationTab);
		tabbedPane.addTab(complementaryDocumentsTab);
		tabbedPane.addTab(learningAgreementListTab);
		tabbedPane.addTab(learningAgreementTab);
		tabbedPane.addTab(transcriptionOfRecordListTab);
		tabbedPane.addTab(transcriptionOfRecordTab);
		tabbedPane.addTab(userGuideListTab);
		tabbedPane.addTab(userGuideTab);
		tabbedPane.addTab(qualificationTab);
		tabbedPane.addTab(unitListTab);
		tabbedPane.addTab(unitTab);
		tabbedPane.addTab(learningOutcomeListTab);
		tabbedPane.addTab(learningOutcomeTab);
		tabbedPane.addTab(learningOutcomeTermListTab);
		tabbedPane.addTab(learningOutcomeTermTab);
		tabbedPane.addTab(evaluationsTab);
		tabbedPane.addTab(assessmentListTab);
		tabbedPane.addTab(assessmentTab);
		tabbedPane.addTab(methodListTab);
		tabbedPane.addTab(methodTab);
		tabbedPane.addTab(processListTab);
		tabbedPane.addTab(processTab);
		tabbedPane.addTab(validationListTab);
		tabbedPane.addTab(validationTab);
		tabbedPane.addTab(confirmingRequirementListTab);
		tabbedPane.addTab(confirmingRequirementTab);
		tabbedPane.addTab(recognitionListTab);
		tabbedPane.addTab(recognitionTab);
		tabbedPane.addTab(certificateTemplateTab);
		tabbedPane.addTab(referenceLevelListTab);
		tabbedPane.addTab(referenceLevelTab);
		tabbedPane.addTab(attachmentTab);
		tabbedPane.setSelectedIndex(0);
		this.setLayout(new GridBagLayout());
		this.setJMenuBar(menuBar);
		tabbedPane.setPreferredSize(new Dimension(300,104));
		this.add(tabbedPane,new GBC(1,1,1,1,1.0,1.0,GBC.CENTER,GBC.BOTH,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(this,true,true);
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				this_windowClosing(e);
			}
		});
		menuItem2.addActionListener(e -> menuItem2_actionPerformed(e));
		tabbedPane.addChangeListener(e -> tabbedPane_stateChanged(e));
		this_init();
	}// ${GENERATED-CODE-BLOCK-END:INITIALIZERS}
	
}