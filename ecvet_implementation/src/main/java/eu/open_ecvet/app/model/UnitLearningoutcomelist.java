
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


public class UnitLearningoutcomelist extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	UNITTYPE_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	
	static
	{
		UNITTYPE_ID = new VirtualTableColumn<Integer>("UNITTYPE_ID");
		UNITTYPE_ID.setType(DataType.INTEGER);
		UNITTYPE_ID.setNullable(false);
		UNITTYPE_ID.setDefaultValue(0);
		UNITTYPE_ID.setPreferredWidth(100);
		UNITTYPE_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setNullable(false);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
	}
	
	
	public UnitLearningoutcomelist()
	{
		super(UnitLearningoutcomelist.class.getName(),"PUBLIC","UNIT_LEARNINGOUTCOMELIST",
				UNITTYPE_ID,LEARNINGOUTCOMELIST_ID);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(UNITTYPE_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"UNITTYPE_ID",
				"LEARNINGOUTCOMELIST_ID"));
	}
	
	public final static UnitLearningoutcomelist	VT	= new UnitLearningoutcomelist();
	
	
	public static UnitLearningoutcomelist getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}