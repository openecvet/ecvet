
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


public class UnitlistUnit extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	UNITLIST_ID;
	public final static VirtualTableColumn<Integer>	UNIT_ID;
	public final static VirtualTableColumn<String>	UNIT_TITLE;
	
	static
	{
		UNITLIST_ID = new VirtualTableColumn<Integer>("UNITLIST_ID");
		UNITLIST_ID.setType(DataType.INTEGER);
		UNITLIST_ID.setNullable(false);
		UNITLIST_ID.setDefaultValue(0);
		UNITLIST_ID.setVisible(false);
		UNITLIST_ID.setPreferredWidth(100);
		UNITLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		UNIT_ID = new VirtualTableColumn<Integer>("UNIT_ID");
		UNIT_ID.setType(DataType.INTEGER);
		UNIT_ID.setNullable(false);
		UNIT_ID.setDefaultValue(0);
		UNIT_ID.setVisible(false);
		UNIT_ID.setPreferredWidth(100);
		UNIT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		
		UNIT_TITLE = new VirtualTableColumn<String>("UNIT_TITLE");
		UNIT_TITLE.setType(DataType.VARCHAR,2147483647);
		UNIT_TITLE.setDefaultValue(null);
		UNIT_TITLE.setCaption("TITLE");
		UNIT_TITLE.setPreferredWidth(100);
		UNIT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		UNIT_TITLE.setPersistent(false);
		UNIT_TITLE.setTableColumnLink(new TableColumnLink(Unit.class.getName(),
				Unit.TITLE.getName(),new EntityRelationship(Unit.class.getName(),
						new String[]{Unit.ID.getName()},Cardinality.ONE,UnitlistUnit.class
								.getName(),new String[]{UnitlistUnit.UNIT_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public UnitlistUnit()
	{
		super(UnitlistUnit.class.getName(),"PUBLIC","UNITLIST_UNIT",UNITLIST_ID,UNIT_ID,UNIT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(UNITLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"UNIT_ID","UNITLIST_ID"));
	}
	
	public final static UnitlistUnit	VT	= new UnitlistUnit();
	
	
	public static UnitlistUnit getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}