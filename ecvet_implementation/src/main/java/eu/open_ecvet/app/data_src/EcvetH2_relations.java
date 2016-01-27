
package eu.open_ecvet.app.data_src;


import xdev.lang.StaticInstanceSupport;
import xdev.vt.Cardinality;
import xdev.vt.EntityRelationshipModel;

import eu.open_ecvet.app.model.*;
import eu.open_ecvet.app.model.Attachment;
import eu.open_ecvet.app.model.Method;
import eu.open_ecvet.app.model.Process;
import eu.open_ecvet.app.model.Unit;
import eu.open_ecvet.app.model.Validation;


public class EcvetH2_relations extends EntityRelationshipModel implements StaticInstanceSupport // ${GENERATED-CODE-LINE:ER_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:ER_MODEL}
	private static EcvetH2_relations	instance	= null;
	
	
	public static EcvetH2_relations getInstance()
	{
		if(instance == null)
		{
			instance = new EcvetH2_relations();
		}
		return instance;
	}
	
	{
		add(Recognitionlist.class.getName(),new String[]{Recognitionlist.ID.getName()},
				Cardinality.ONE,Evaluations.class.getName(),
				new String[]{Evaluations.RECOGNITIONLIST_ID.getName()},Cardinality.MANY);
		add(Validationlist.class.getName(),new String[]{Validationlist.ID.getName()},
				Cardinality.ONE,Evaluations.class.getName(),
				new String[]{Evaluations.VALIDATIONLIST_ID.getName()},Cardinality.MANY);
		add(Memorandumofunderstanding.class.getName(),
				new String[]{Memorandumofunderstanding.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.MEMORANDUMOFUNDERSTANDING_ID.getName()},
				Cardinality.MANY);
		add(Transcriptsofrecord.class.getName(),new String[]{Transcriptsofrecord.ID.getName()},
				Cardinality.ONE,TranscriptsofrecordAttachment.class.getName(),
				new String[]{TranscriptsofrecordAttachment.ATTACHMENTS_ID.getName()},
				Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				UserguideAttachment.class.getName(),
				new String[]{UserguideAttachment.ATTACHMENT_ID.getName()},Cardinality.MANY);
		add(Legislation.class.getName(),new String[]{Legislation.ID.getName()},Cardinality.ONE,
				LegislationlistLegislation.class.getName(),
				new String[]{LegislationlistLegislation.LEGISLATION_ID.getName()},Cardinality.MANY);
		add(Partnerlist.class.getName(),new String[]{Partnerlist.ID.getName()},Cardinality.ONE,
				Competentinstitution.class.getName(),
				new String[]{Competentinstitution.PARTNERLIST_ID.getName()},Cardinality.MANY);
		add(Requirementlist.class.getName(),new String[]{Requirementlist.ID.getName()},
				Cardinality.ONE,RequirementlistRequirement.class.getName(),
				new String[]{RequirementlistRequirement.REQUIREMENTLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningagreementlist.class.getName(),new String[]{Learningagreementlist.ID.getName()},
				Cardinality.ONE,LearningagreementlistLearningagreement.class.getName(),
				new String[]{LearningagreementlistLearningagreement.LEARNINGAGREEMENTLIST_ID
						.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				CertificatetemplateAttachment.class.getName(),
				new String[]{CertificatetemplateAttachment.ATTACHMENT_ID.getName()},
				Cardinality.MANY);
		add(Partner.class.getName(),new String[]{Partner.ID.getName()},Cardinality.ONE,
				PartnerlistPartner.class.getName(),
				new String[]{PartnerlistPartner.PARTNER_ID.getName()},Cardinality.MANY);
		add(Procedureandguidelinelist.class.getName(),
				new String[]{Procedureandguidelinelist.ID.getName()},
				Cardinality.ONE,
				ProcedureandguidelinelistProcedureandguideline.class.getName(),
				new String[]{ProcedureandguidelinelistProcedureandguideline.PROCEDUREANDGUIDELINELIST_ID
						.getName()},Cardinality.MANY);
		add(Credittransfer.class.getName(),new String[]{Credittransfer.ID.getName()},
				Cardinality.ONE,CredittransferAttachment.class.getName(),
				new String[]{CredittransferAttachment.ATTACHMENTS_ID.getName()},Cardinality.MANY);
		add(Qualificationframeworklist.class.getName(),
				new String[]{Qualificationframeworklist.ID.getName()},Cardinality.ONE,
				Learningoutcomelist.class.getName(),
				new String[]{Learningoutcomelist.QUALIFICATIONFRAMEWORKLIST_ID.getName()},
				Cardinality.MANY);
		add(Assessmentlist.class.getName(),new String[]{Assessmentlist.ID.getName()},
				Cardinality.ONE,Evaluations.class.getName(),
				new String[]{Evaluations.ASSESSMENTLIST_ID.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				LearningagreementAttachment.class.getName(),
				new String[]{LearningagreementAttachment.ATTACHMENT_ID.getName()},Cardinality.MANY);
		add(Userguide.class.getName(),new String[]{Userguide.ID.getName()},Cardinality.ONE,
				UserguidelistUserguide.class.getName(),
				new String[]{UserguidelistUserguide.USERGUIDE_ID.getName()},Cardinality.MANY);
		add(Qualificationframeworklist.class.getName(),
				new String[]{Qualificationframeworklist.ID.getName()},
				Cardinality.ONE,
				QualificationframeworklistQualificationframework.class.getName(),
				new String[]{QualificationframeworklistQualificationframework.QUALIFICATIONFRAMEWORKLIST_ID
						.getName()},Cardinality.MANY);
		add(Evaluations.class.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
				Unit.class.getName(),new String[]{Unit.EVALUATIONS_ID.getName()},Cardinality.MANY);
		add(Transcriptsofrecordlist.class.getName(),
				new String[]{Transcriptsofrecordlist.ID.getName()},Cardinality.ONE,
				TranscriptsofrecordlistTranscriptsofrecord.class.getName(),
				new String[]{TranscriptsofrecordlistTranscriptsofrecord.TRANSCRIPTSOFRECORDLIST_ID
						.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				MemorandumofunderstandingAttachment.class.getName(),
				new String[]{MemorandumofunderstandingAttachment.ATTACHMENT_ID.getName()},
				Cardinality.MANY);
		add(Competentinstitutionlist.class.getName(),
				new String[]{Competentinstitutionlist.ID.getName()},Cardinality.ONE,
				Ecvetframework.class.getName(),
				new String[]{Ecvetframework.COMPETENTINSTITUTIONLIST_ID.getName()},Cardinality.MANY);
		add(Competentinstitutionlist.class.getName(),
				new String[]{Competentinstitutionlist.ID.getName()},
				Cardinality.ONE,
				CompetentinstitutionlistCompetentinstitution.class.getName(),
				new String[]{CompetentinstitutionlistCompetentinstitution.COMPETENTINSTITUTIONLIST_ID
						.getName()},Cardinality.MANY);
		add(Unit.class.getName(),new String[]{Unit.ID.getName()},Cardinality.ONE,
				UnitlistUnit.class.getName(),new String[]{UnitlistUnit.UNIT_ID.getName()},
				Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				Qualification.class.getName(),new String[]{Qualification.UNITLIST_ID.getName()},
				Cardinality.MANY);
		add(Qualificationframeworklist.class.getName(),
				new String[]{Qualificationframeworklist.ID.getName()},Cardinality.ONE,
				Unitlist.class.getName(),
				new String[]{Unitlist.QUALIFICATIONFRAMEWORKLIST_ID.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				CredittransferAttachment.class.getName(),
				new String[]{CredittransferAttachment.ATTACHMENT_ID.getName()},Cardinality.MANY);
		add(Transcriptsofrecordlist.class.getName(),
				new String[]{Transcriptsofrecordlist.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.TRANSCRIPTSOFRECORDLIST_ID.getName()},
				Cardinality.MANY);
		add(Credittransferlist.class.getName(),new String[]{Credittransferlist.ID.getName()},
				Cardinality.ONE,CredittransferlistCredittransfer.class.getName(),
				new String[]{CredittransferlistCredittransfer.CREDITTRANSFERLIST_ID.getName()},
				Cardinality.MANY);
		add(Recognition.class.getName(),new String[]{Recognition.ID.getName()},Cardinality.ONE,
				RecognitionlistRecognition.class.getName(),
				new String[]{RecognitionlistRecognition.RECOGNITION_ID.getName()},Cardinality.MANY);
		add(Methodlist.class.getName(),new String[]{Methodlist.ID.getName()},Cardinality.ONE,
				Assessment.class.getName(),new String[]{Assessment.METHODLIST_ID.getName()},
				Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				TranscriptsofrecordAttachment.class.getName(),
				new String[]{TranscriptsofrecordAttachment.ATTACHMENT_ID.getName()},
				Cardinality.MANY);
		add(Methodlist.class.getName(),new String[]{Methodlist.ID.getName()},Cardinality.ONE,
				MethodlistMethod.class.getName(),
				new String[]{MethodlistMethod.METHODLIST_ID.getName()},Cardinality.MANY);
		add(Learningoutcome.class.getName(),new String[]{Learningoutcome.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcome.class.getName(),
				new String[]{LearningoutcomelistLearningoutcome.LEARNINGOUTCOMELIST_ID.getName()},
				Cardinality.MANY);
		add(Requirementlist.class.getName(),new String[]{Requirementlist.ID.getName()},
				Cardinality.ONE,Validation.class.getName(),
				new String[]{Validation.REQUIREMENTLIST_ID.getName()},Cardinality.MANY);
		add(Validation.class.getName(),new String[]{Validation.ID.getName()},Cardinality.ONE,
				ValidationlistValidation.class.getName(),
				new String[]{ValidationlistValidation.VALIDATION_ID.getName()},Cardinality.MANY);
		add(Process.class.getName(),new String[]{Process.ID.getName()},Cardinality.ONE,
				ProcesslistProcess.class.getName(),
				new String[]{ProcesslistProcess.PROCESS_ID.getName()},Cardinality.MANY);
		add(Assessmentlist.class.getName(),new String[]{Assessmentlist.ID.getName()},
				Cardinality.ONE,AssessmentlistAssessment.class.getName(),
				new String[]{AssessmentlistAssessment.ASSESSMENTLIST_ID.getName()},Cardinality.MANY);
		add(Credittransfer.class.getName(),new String[]{Credittransfer.ID.getName()},
				Cardinality.ONE,CredittransferlistCredittransfer.class.getName(),
				new String[]{CredittransferlistCredittransfer.CREDITTRANSFER_ID.getName()},
				Cardinality.MANY);
		add(Learningagreementlist.class.getName(),new String[]{Learningagreementlist.ID.getName()},
				Cardinality.ONE,Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.LEARNINGAGREEMENTLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,Unit.class.getName(),
				new String[]{Unit.LEARNINGOUTCOMELIST_ID.getName()},Cardinality.MANY);
		add(Procedureandguideline.class.getName(),
				new String[]{Procedureandguideline.ID.getName()},
				Cardinality.ONE,
				ProcedureandguidelinelistProcedureandguideline.class.getName(),
				new String[]{ProcedureandguidelinelistProcedureandguideline.PROCEDUREANDGUIDELINE_ID
						.getName()},Cardinality.MANY);
		add(Userguidelist.class.getName(),new String[]{Userguidelist.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.USERGUIDELIST_ID.getName()},Cardinality.MANY);
		add(Qualificationframeworklist.class.getName(),
				new String[]{Qualificationframeworklist.ID.getName()},Cardinality.ONE,
				Learningoutcome.class.getName(),
				new String[]{Learningoutcome.QUALIFICATIONFRAMEWORKLIST_ID.getName()},
				Cardinality.MANY);
		add(Userguide.class.getName(),new String[]{Userguide.ID.getName()},Cardinality.ONE,
				UserguideAttachment.class.getName(),
				new String[]{UserguideAttachment.ATTACHMENTS_ID.getName()},Cardinality.MANY);
		add(Recognitionlist.class.getName(),new String[]{Recognitionlist.ID.getName()},
				Cardinality.ONE,RecognitionlistRecognition.class.getName(),
				new String[]{RecognitionlistRecognition.RECOGNITIONLIST_ID.getName()},
				Cardinality.MANY);
		add(Credittransferlist.class.getName(),new String[]{Credittransferlist.ID.getName()},
				Cardinality.ONE,Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.CREDITTRANSFERLIST_ID.getName()},
				Cardinality.MANY);
		add(Evaluations.class.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
				Learningoutcomelist.class.getName(),
				new String[]{Learningoutcomelist.EVALUATIONS_ID.getName()},Cardinality.MANY);
		add(Learningagreement.class.getName(),new String[]{Learningagreement.ID.getName()},
				Cardinality.ONE,LearningagreementAttachment.class.getName(),
				new String[]{LearningagreementAttachment.ATTACHMENTS_ID.getName()},Cardinality.MANY);
		add(Requirement.class.getName(),new String[]{Requirement.ID.getName()},Cardinality.ONE,
				RequirementlistRequirement.class.getName(),
				new String[]{RequirementlistRequirement.REQUIREMENT_ID.getName()},Cardinality.MANY);
		add(Certificatetemplate.class.getName(),new String[]{Certificatetemplate.ID.getName()},
				Cardinality.ONE,CertificatetemplateAttachment.class.getName(),
				new String[]{CertificatetemplateAttachment.ATTACHMENTS_ID.getName()},
				Cardinality.MANY);
		add(Qualificationframeworklist.class.getName(),
				new String[]{Qualificationframeworklist.ID.getName()},Cardinality.ONE,
				Unit.class.getName(),new String[]{Unit.QUALIFICATIONFRAMEWORKLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcome.class.getName(),
				new String[]{LearningoutcomelistLearningoutcome.LEARNINGOUTCOME_ID.getName()},
				Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				UnitlistUnit.class.getName(),new String[]{UnitlistUnit.UNITLIST_ID.getName()},
				Cardinality.MANY);
		add(Competentinstitution.class.getName(),new String[]{Competentinstitution.ID.getName()},
				Cardinality.ONE,CompetentinstitutionlistCompetentinstitution.class.getName(),
				new String[]{CompetentinstitutionlistCompetentinstitution.COMPETENTINSTITUTION_ID
						.getName()},Cardinality.MANY);
		add(Learningagreement.class.getName(),
				new String[]{Learningagreement.ID.getName()},
				Cardinality.ONE,
				LearningagreementlistLearningagreement.class.getName(),
				new String[]{LearningagreementlistLearningagreement.LEARNINGAGREEMENT_ID.getName()},
				Cardinality.MANY);
		add(Transcriptsofrecord.class.getName(),new String[]{Transcriptsofrecord.ID.getName()},
				Cardinality.ONE,TranscriptsofrecordlistTranscriptsofrecord.class.getName(),
				new String[]{TranscriptsofrecordlistTranscriptsofrecord.TRANSCRIPTSOFRECORD_ID
						.getName()},Cardinality.MANY);
		add(Assessment.class.getName(),new String[]{Assessment.ID.getName()},Cardinality.ONE,
				AssessmentlistAssessment.class.getName(),
				new String[]{AssessmentlistAssessment.ASSESSMENT_ID.getName()},Cardinality.MANY);
		add(Evaluations.class.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
				Unitlist.class.getName(),new String[]{Unitlist.EVALUATIONS_ID.getName()},
				Cardinality.MANY);
		add(Legislationlist.class.getName(),new String[]{Legislationlist.ID.getName()},
				Cardinality.ONE,LegislationlistLegislation.class.getName(),
				new String[]{LegislationlistLegislation.LEGISLATIONLIST_ID.getName()},
				Cardinality.MANY);
		add(Method.class.getName(),new String[]{Method.ID.getName()},Cardinality.ONE,
				MethodlistMethod.class.getName(),
				new String[]{MethodlistMethod.METHOD_ID.getName()},Cardinality.MANY);
		add(Userguidelist.class.getName(),new String[]{Userguidelist.ID.getName()},Cardinality.ONE,
				UserguidelistUserguide.class.getName(),
				new String[]{UserguidelistUserguide.USERGUIDELIST_ID.getName()},Cardinality.MANY);
		add(Qualification.class.getName(),new String[]{Qualification.ID.getName()},Cardinality.ONE,
				Ecvetframework.class.getName(),
				new String[]{Ecvetframework.QUALIFICATION_ID.getName()},Cardinality.MANY);
		add(Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.ID.getName()},Cardinality.ONE,
				Ecvetframework.class.getName(),
				new String[]{Ecvetframework.COMPLEMENTARYDOCUMENTS_ID.getName()},Cardinality.MANY);
		add(Evaluations.class.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
				Learningoutcome.class.getName(),
				new String[]{Learningoutcome.EVALUATIONS_ID.getName()},Cardinality.MANY);
		add(Procedureandguidelinelist.class.getName(),
				new String[]{Procedureandguidelinelist.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.PROCEDUREANDGUIDELINELIST_ID.getName()},
				Cardinality.MANY);
		add(Certificatetemplate.class.getName(),new String[]{Certificatetemplate.ID.getName()},
				Cardinality.ONE,Recognition.class.getName(),
				new String[]{Recognition.CERTIFICATETEMPLATE_ID.getName()},Cardinality.MANY);
		add(Processlist.class.getName(),new String[]{Processlist.ID.getName()},Cardinality.ONE,
				ProcesslistProcess.class.getName(),
				new String[]{ProcesslistProcess.PROCESSLIST_ID.getName()},Cardinality.MANY);
		add(Validationlist.class.getName(),new String[]{Validationlist.ID.getName()},
				Cardinality.ONE,ValidationlistValidation.class.getName(),
				new String[]{ValidationlistValidation.VALIDATIONLIST_ID.getName()},Cardinality.MANY);
		add(Legislationlist.class.getName(),new String[]{Legislationlist.ID.getName()},
				Cardinality.ONE,Competentinstitution.class.getName(),
				new String[]{Competentinstitution.LEGISLATIONLIST_ID.getName()},Cardinality.MANY);
		add(Processlist.class.getName(),new String[]{Processlist.ID.getName()},Cardinality.ONE,
				Assessment.class.getName(),new String[]{Assessment.PROCESSLIST_ID.getName()},
				Cardinality.MANY);
		add(Qualificationframework.class.getName(),
				new String[]{Qualificationframework.ID.getName()},
				Cardinality.ONE,
				QualificationframeworklistQualificationframework.class.getName(),
				new String[]{QualificationframeworklistQualificationframework.QUALIFICATIONFRAMEWORK_ID
						.getName()},Cardinality.MANY);
		add(Memorandumofunderstanding.class.getName(),
				new String[]{Memorandumofunderstanding.ID.getName()},Cardinality.ONE,
				MemorandumofunderstandingAttachment.class.getName(),
				new String[]{MemorandumofunderstandingAttachment.ATTACHMENTS_ID.getName()},
				Cardinality.MANY);
		add(Partnerlist.class.getName(),new String[]{Partnerlist.ID.getName()},Cardinality.ONE,
				PartnerlistPartner.class.getName(),
				new String[]{PartnerlistPartner.PARTNERLIST_ID.getName()},Cardinality.MANY);
		add(LearningoutcomelistLearningoutcomelist.class.getName(),
				new String[]{LearningoutcomelistLearningoutcomelist.LEARNINGOUTCOMELISTPARENT_ID
						.getName()},Cardinality.MANY,Learningoutcomelist.class.getName(),
				new String[]{Learningoutcomelist.ID.getName()},Cardinality.ONE);
		add(LearningoutcomelistChild.class.getName(),
				new String[]{LearningoutcomelistChild.ID.getName()},Cardinality.ONE,
				LearningoutcomelistLearningoutcomelist.class.getName(),
				new String[]{LearningoutcomelistLearningoutcomelist.LEARNINGOUTCOMELIST_ID
						.getName()},Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				UnitlistUnitlist.class.getName(),
				new String[]{UnitlistUnitlist.UNITLISTPARENT_ID.getName()},Cardinality.MANY);
		add(UnitlistChild.class.getName(),new String[]{UnitlistChild.ID.getName()},Cardinality.ONE,
				UnitlistUnitlist.class.getName(),
				new String[]{UnitlistUnitlist.UNITLIST_ID.getName()},Cardinality.MANY);
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:ER_MODEL}
	
}