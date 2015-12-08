
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
		add(Transcriptionofrecord.class.getName(),
				new String[]{Transcriptionofrecord.ID.getName()},
				Cardinality.ONE,
				TranscriptionofrecordlistTranscriptionofrecord.class.getName(),
				new String[]{TranscriptionofrecordlistTranscriptionofrecord.TRANSCRIPTIONOFRECORD_ID
						.getName()},Cardinality.MANY);
		add(Referencelevellist.class.getName(),new String[]{Referencelevellist.ID.getName()},
				Cardinality.ONE,Unit.class.getName(),
				new String[]{Unit.REFERENCELEVELLIST_ID.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				UserguideAttachment.class.getName(),
				new String[]{UserguideAttachment.ATTACHMENT_ID.getName()},Cardinality.MANY);
		add(Partnerlist.class.getName(),new String[]{Partnerlist.ID.getName()},Cardinality.ONE,
				Competentinstitution.class.getName(),
				new String[]{Competentinstitution.PARTNERLIST_ID.getName()},Cardinality.MANY);
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
		add(Assessmentlist.class.getName(),new String[]{Assessmentlist.ID.getName()},
				Cardinality.ONE,Evaluations.class.getName(),
				new String[]{Evaluations.ASSESSMENTLIST_ID.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				LearningagreementAttachment.class.getName(),
				new String[]{LearningagreementAttachment.ATTACHMENT_ID.getName()},Cardinality.MANY);
		add(Transcriptionofrecordlist.class.getName(),
				new String[]{Transcriptionofrecordlist.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.TRANSCRIPTIONOFRECORDLIST_ID.getName()},
				Cardinality.MANY);
		add(Userguide.class.getName(),new String[]{Userguide.ID.getName()},Cardinality.ONE,
				UserguidelistUserguide.class.getName(),
				new String[]{UserguidelistUserguide.USERGUIDE_ID.getName()},Cardinality.MANY);
		add(Evaluations.class.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
				Unit.class.getName(),new String[]{Unit.EVALUATIONS_ID.getName()},Cardinality.MANY);
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
		add(Confirmingrequirementlist.class.getName(),
				new String[]{Confirmingrequirementlist.ID.getName()},
				Cardinality.ONE,
				ConfirmingrequirementlistConfirmingrequirement.class.getName(),
				new String[]{ConfirmingrequirementlistConfirmingrequirement.CONFIRMINGREQUIREMENTLIST_ID
						.getName()},Cardinality.MANY);
		add(Unit.class.getName(),new String[]{Unit.ID.getName()},Cardinality.ONE,
				UnitlistUnit.class.getName(),new String[]{UnitlistUnit.UNIT_ID.getName()},
				Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				Qualification.class.getName(),new String[]{Qualification.UNITLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcometerm.class.getName(),new String[]{Learningoutcometerm.ID.getName()},
				Cardinality.ONE,LearningoutcometermlistLearningoutcometerm.class.getName(),
				new String[]{LearningoutcometermlistLearningoutcometerm.LEARNINGOUTCOMETERM_ID
						.getName()},Cardinality.MANY);
		add(Attachment.class.getName(),new String[]{Attachment.ID.getName()},Cardinality.ONE,
				TranscriptionofrecordAttachment.class.getName(),
				new String[]{TranscriptionofrecordAttachment.ATTACHMENT_ID.getName()},
				Cardinality.MANY);
		add(Recognition.class.getName(),new String[]{Recognition.ID.getName()},Cardinality.ONE,
				RecognitionlistRecognition.class.getName(),
				new String[]{RecognitionlistRecognition.RECOGNITION_ID.getName()},Cardinality.MANY);
		add(Transcriptionofrecord.class.getName(),new String[]{Transcriptionofrecord.ID.getName()},
				Cardinality.ONE,TranscriptionofrecordAttachment.class.getName(),
				new String[]{TranscriptionofrecordAttachment.ATTACHMENTS_ID.getName()},
				Cardinality.MANY);
		add(Methodlist.class.getName(),new String[]{Methodlist.ID.getName()},Cardinality.ONE,
				Assessment.class.getName(),new String[]{Assessment.METHODLIST_ID.getName()},
				Cardinality.MANY);
		add(Transcriptionofrecordlist.class.getName(),
				new String[]{Transcriptionofrecordlist.ID.getName()},
				Cardinality.ONE,
				TranscriptionofrecordlistTranscriptionofrecord.class.getName(),
				new String[]{TranscriptionofrecordlistTranscriptionofrecord.TRANSCRIPTIONOFRECORDLIST_ID
						.getName()},Cardinality.MANY);
		add(Methodlist.class.getName(),new String[]{Methodlist.ID.getName()},Cardinality.ONE,
				MethodlistMethod.class.getName(),
				new String[]{MethodlistMethod.METHODLIST_ID.getName()},Cardinality.MANY);
		add(Learningoutcome.class.getName(),new String[]{Learningoutcome.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcome.class.getName(),
				new String[]{LearningoutcomelistLearningoutcome.LEARNINGOUTCOMELIST_ID.getName()},
				Cardinality.MANY);
		add(Validation.class.getName(),new String[]{Validation.ID.getName()},Cardinality.ONE,
				ValidationlistValidation.class.getName(),
				new String[]{ValidationlistValidation.VALIDATION_ID.getName()},Cardinality.MANY);
		add(Process.class.getName(),new String[]{Process.ID.getName()},Cardinality.ONE,
				ProcesslistProcess.class.getName(),
				new String[]{ProcesslistProcess.PROCESS_ID.getName()},Cardinality.MANY);
		add(Assessmentlist.class.getName(),new String[]{Assessmentlist.ID.getName()},
				Cardinality.ONE,AssessmentlistAssessment.class.getName(),
				new String[]{AssessmentlistAssessment.ASSESSMENTLIST_ID.getName()},Cardinality.MANY);
		add(Referencelevellist.class.getName(),new String[]{Referencelevellist.ID.getName()},
				Cardinality.ONE,ReferencelevellistReferencelevel.class.getName(),
				new String[]{ReferencelevellistReferencelevel.REFERENCELEVELLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningagreementlist.class.getName(),new String[]{Learningagreementlist.ID.getName()},
				Cardinality.ONE,Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.LEARNINGAGREEMENTLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,Unit.class.getName(),
				new String[]{Unit.LEARNINGOUTCOMELIST_ID.getName()},Cardinality.MANY);
		add(Learningoutcometermlist.class.getName(),
				new String[]{Learningoutcometermlist.ID.getName()},Cardinality.ONE,
				LearningoutcometermlistLearningoutcometerm.class.getName(),
				new String[]{LearningoutcometermlistLearningoutcometerm.LEARNINGOUTCOMETERMLIST_ID
						.getName()},Cardinality.MANY);
		add(Userguidelist.class.getName(),new String[]{Userguidelist.ID.getName()},Cardinality.ONE,
				Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.USERGUIDELIST_ID.getName()},Cardinality.MANY);
		add(Userguide.class.getName(),new String[]{Userguide.ID.getName()},Cardinality.ONE,
				UserguideAttachment.class.getName(),
				new String[]{UserguideAttachment.ATTACHMENTS_ID.getName()},Cardinality.MANY);
		add(Recognitionlist.class.getName(),new String[]{Recognitionlist.ID.getName()},
				Cardinality.ONE,RecognitionlistRecognition.class.getName(),
				new String[]{RecognitionlistRecognition.RECOGNITIONLIST_ID.getName()},
				Cardinality.MANY);
		add(Confirmingrequirement.class.getName(),
				new String[]{Confirmingrequirement.ID.getName()},
				Cardinality.ONE,
				ConfirmingrequirementlistConfirmingrequirement.class.getName(),
				new String[]{ConfirmingrequirementlistConfirmingrequirement.CONFIRMINGREQUIREMENT_ID
						.getName()},Cardinality.MANY);
		add(Learningagreement.class.getName(),new String[]{Learningagreement.ID.getName()},
				Cardinality.ONE,LearningagreementAttachment.class.getName(),
				new String[]{LearningagreementAttachment.ATTACHMENTS_ID.getName()},Cardinality.MANY);
		add(Certificatetemplate.class.getName(),new String[]{Certificatetemplate.ID.getName()},
				Cardinality.ONE,CertificatetemplateAttachment.class.getName(),
				new String[]{CertificatetemplateAttachment.ATTACHMENTS_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcome.class.getName(),
				new String[]{LearningoutcomelistLearningoutcome.LEARNINGOUTCOME_ID.getName()},
				Cardinality.MANY);
		add(Confirmingrequirementlist.class.getName(),
				new String[]{Confirmingrequirementlist.ID.getName()},Cardinality.ONE,
				Validation.class.getName(),
				new String[]{Validation.CONFIRMINGREQUIREMENTLIST_ID.getName()},Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				UnitlistUnit.class.getName(),new String[]{UnitlistUnit.UNITLIST_ID.getName()},
				Cardinality.MANY);
		add(Competentinstitution.class.getName(),new String[]{Competentinstitution.ID.getName()},
				Cardinality.ONE,CompetentinstitutionlistCompetentinstitution.class.getName(),
				new String[]{CompetentinstitutionlistCompetentinstitution.COMPETENTINSTITUTION_ID
						.getName()},Cardinality.MANY);
		add(Legislation.class.getName(),new String[]{Legislation.ID.getName()},Cardinality.ONE,
				Competentinstitution.class.getName(),
				new String[]{Competentinstitution.LEGISLATION_ID.getName()},Cardinality.MANY);
		add(Learningagreement.class.getName(),
				new String[]{Learningagreement.ID.getName()},
				Cardinality.ONE,
				LearningagreementlistLearningagreement.class.getName(),
				new String[]{LearningagreementlistLearningagreement.LEARNINGAGREEMENT_ID.getName()},
				Cardinality.MANY);
		add(Referencelevellist.class.getName(),new String[]{Referencelevellist.ID.getName()},
				Cardinality.ONE,Learningoutcometerm.class.getName(),
				new String[]{Learningoutcometerm.REFERENCELEVELLIST_ID.getName()},Cardinality.MANY);
		add(Assessment.class.getName(),new String[]{Assessment.ID.getName()},Cardinality.ONE,
				AssessmentlistAssessment.class.getName(),
				new String[]{AssessmentlistAssessment.ASSESSMENT_ID.getName()},Cardinality.MANY);
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
				Learningoutcometerm.class.getName(),
				new String[]{Learningoutcometerm.EVALUATIONS_ID.getName()},Cardinality.MANY);
		add(Certificatetemplate.class.getName(),new String[]{Certificatetemplate.ID.getName()},
				Cardinality.ONE,Recognition.class.getName(),
				new String[]{Recognition.CERTIFICATETEMPLATE_ID.getName()},Cardinality.MANY);
		add(Unitlist.class.getName(),new String[]{Unitlist.ID.getName()},Cardinality.ONE,
				Unit.class.getName(),new String[]{Unit.UNITLIST_ID.getName()},Cardinality.MANY);
		add(Processlist.class.getName(),new String[]{Processlist.ID.getName()},Cardinality.ONE,
				ProcesslistProcess.class.getName(),
				new String[]{ProcesslistProcess.PROCESSLIST_ID.getName()},Cardinality.MANY);
		add(Validationlist.class.getName(),new String[]{Validationlist.ID.getName()},
				Cardinality.ONE,ValidationlistValidation.class.getName(),
				new String[]{ValidationlistValidation.VALIDATIONLIST_ID.getName()},Cardinality.MANY);
		add(Referencelevel.class.getName(),new String[]{Referencelevel.ID.getName()},
				Cardinality.ONE,ReferencelevellistReferencelevel.class.getName(),
				new String[]{ReferencelevellistReferencelevel.REFERENCELEVEL_ID.getName()},
				Cardinality.MANY);
		add(Processlist.class.getName(),new String[]{Processlist.ID.getName()},Cardinality.ONE,
				Assessment.class.getName(),new String[]{Assessment.PROCESSLIST_ID.getName()},
				Cardinality.MANY);
		add(Learningoutcometermlist.class.getName(),
				new String[]{Learningoutcometermlist.ID.getName()},Cardinality.ONE,
				Learningoutcome.class.getName(),
				new String[]{Learningoutcome.LEARNINGOUTCOMETERMLIST_ID.getName()},Cardinality.MANY);
		add(Partnerlist.class.getName(),new String[]{Partnerlist.ID.getName()},Cardinality.ONE,
				PartnerlistPartner.class.getName(),
				new String[]{PartnerlistPartner.PARTNERLIST_ID.getName()},Cardinality.MANY);
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:ER_MODEL}
	
}