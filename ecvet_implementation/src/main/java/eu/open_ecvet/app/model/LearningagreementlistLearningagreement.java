
package eu.open_ecvet.app.model;


import xdev.db.DataType;
import xdev.db.Index;
import xdev.db.Index.IndexType;
import xdev.lang.StaticInstanceSupport;
import xdev.ui.text.TextFormat;
import xdev.vt.Cardinality;
import xdev.vt.EntityRelationship;
import xdev.vt.TableColumnLink;
import xdev.vt.VirtualTable;
import xdev.vt.VirtualTableColumn;

import java.util.Locale;

import eu.open_ecvet.app.data_src.EcvetH2;


public class LearningagreementlistLearningagreement extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGAGREEMENTLIST_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGAGREEMENT_ID;
	public final static VirtualTableColumn<String>	LEARNINGAGREEMENT_TITLE;
	
	static
	{
		LEARNINGAGREEMENTLIST_ID = new VirtualTableColumn<Integer>("LEARNINGAGREEMENTLIST_ID");
		LEARNINGAGREEMENTLIST_ID.setType(DataType.INTEGER);
		LEARNINGAGREEMENTLIST_ID.setNullable(false);
		LEARNINGAGREEMENTLIST_ID.setDefaultValue(0);
		LEARNINGAGREEMENTLIST_ID.setVisible(false);
		LEARNINGAGREEMENTLIST_ID.setPreferredWidth(100);
		LEARNINGAGREEMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		LEARNINGAGREEMENT_ID = new VirtualTableColumn<Integer>("LEARNINGAGREEMENT_ID");
		LEARNINGAGREEMENT_ID.setType(DataType.INTEGER);
		LEARNINGAGREEMENT_ID.setNullable(false);
		LEARNINGAGREEMENT_ID.setDefaultValue(0);
		LEARNINGAGREEMENT_ID.setVisible(false);
		LEARNINGAGREEMENT_ID.setPreferredWidth(100);
		LEARNINGAGREEMENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,
				0,false,false));
		
		LEARNINGAGREEMENT_TITLE = new VirtualTableColumn<String>("LEARNINGAGREEMENT_TITLE");
		LEARNINGAGREEMENT_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGAGREEMENT_TITLE.setDefaultValue(null);
		LEARNINGAGREEMENT_TITLE.setCaption("TITLE");
		LEARNINGAGREEMENT_TITLE.setPreferredWidth(100);
		LEARNINGAGREEMENT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGAGREEMENT_TITLE.setPersistent(false);
		LEARNINGAGREEMENT_TITLE.setTableColumnLink(new TableColumnLink(Learningagreement.class
				.getName(),Learningagreement.TITLE.getName(),
				new EntityRelationship(Learningagreement.class.getName(),
						new String[]{Learningagreement.ID.getName()},Cardinality.ONE,
						LearningagreementlistLearningagreement.class.getName(),
						new String[]{LearningagreementlistLearningagreement.LEARNINGAGREEMENT_ID
								.getName()},Cardinality.MANY)));
	}
	
	
	public LearningagreementlistLearningagreement()
	{
		super(LearningagreementlistLearningagreement.class.getName(),"PUBLIC",
				"LEARNINGAGREEMENTLIST_LEARNINGAGREEMENT",LEARNINGAGREEMENTLIST_ID,
				LEARNINGAGREEMENT_ID,LEARNINGAGREEMENT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGAGREEMENTLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEARNINGAGREEMENTLIST_ID",
				"LEARNINGAGREEMENT_ID"));
	}
	
	public final static LearningagreementlistLearningagreement	VT	= new LearningagreementlistLearningagreement();
	
	
	public static LearningagreementlistLearningagreement getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}