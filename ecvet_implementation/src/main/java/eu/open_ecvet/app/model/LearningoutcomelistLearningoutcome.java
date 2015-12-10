
package eu.open_ecvet.app.model;


import xdev.db.DataType;
import xdev.db.Index;
import xdev.db.Index.IndexType;
import xdev.lang.StaticInstanceSupport;
import xdev.ui.text.TextFormat;
import xdev.vt.VirtualTable;
import xdev.vt.VirtualTableColumn;

import java.util.Locale;

import eu.open_ecvet.app.data_src.EcvetH2;


public class LearningoutcomelistLearningoutcome extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOME_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	
	static
	{
		LEARNINGOUTCOME_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOME_ID");
		LEARNINGOUTCOME_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOME_ID.setNullable(false);
		LEARNINGOUTCOME_ID.setDefaultValue(0);
		LEARNINGOUTCOME_ID.setPreferredWidth(100);
		LEARNINGOUTCOME_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setNullable(false);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
	}
	
	
	public LearningoutcomelistLearningoutcome()
	{
		super(LearningoutcomelistLearningoutcome.class.getName(),"PUBLIC",
				"LEARNINGOUTCOMELIST_LEARNINGOUTCOME",LEARNINGOUTCOME_ID,LEARNINGOUTCOMELIST_ID);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGOUTCOME_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEARNINGOUTCOMELIST_ID",
				"LEARNINGOUTCOME_ID"));
	}
	
	public final static LearningoutcomelistLearningoutcome	VT	= new LearningoutcomelistLearningoutcome();
	
	
	public static LearningoutcomelistLearningoutcome getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}