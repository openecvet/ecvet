
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


public class UnitlistUnitlist extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	UNITLISTPARENT_ID;
	public final static VirtualTableColumn<Integer>	UNITLIST_ID;
	public final static VirtualTableColumn<String>	UNITLISTCHILD_TITLE;
	
	static
	{
		UNITLISTPARENT_ID = new VirtualTableColumn<Integer>("UNITLISTPARENT_ID");
		UNITLISTPARENT_ID.setType(DataType.INTEGER);
		UNITLISTPARENT_ID.setNullable(false);
		UNITLISTPARENT_ID.setDefaultValue(0);
		UNITLISTPARENT_ID.setVisible(false);
		UNITLISTPARENT_ID.setPreferredWidth(100);
		UNITLISTPARENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		UNITLIST_ID = new VirtualTableColumn<Integer>("UNITLIST_ID");
		UNITLIST_ID.setType(DataType.INTEGER);
		UNITLIST_ID.setNullable(false);
		UNITLIST_ID.setDefaultValue(0);
		UNITLIST_ID.setVisible(false);
		UNITLIST_ID.setPreferredWidth(100);
		UNITLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		UNITLISTCHILD_TITLE = new VirtualTableColumn<String>("UNITLISTCHILD_TITLE");
		UNITLISTCHILD_TITLE.setType(DataType.VARCHAR,2147483647);
		UNITLISTCHILD_TITLE.setDefaultValue(null);
		UNITLISTCHILD_TITLE.setCaption("TITLE");
		UNITLISTCHILD_TITLE.setPreferredWidth(100);
		UNITLISTCHILD_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		UNITLISTCHILD_TITLE.setPersistent(false);
		UNITLISTCHILD_TITLE.setTableColumnLink(new TableColumnLink(UnitlistChild.class.getName(),
				UnitlistChild.TITLE.getName(),new EntityRelationship(UnitlistUnitlist.class
						.getName(),new String[]{UnitlistUnitlist.UNITLIST_ID.getName()},
						Cardinality.MANY,UnitlistChild.class.getName(),
						new String[]{UnitlistChild.ID.getName()},Cardinality.ONE)));
	}
	
	
	public UnitlistUnitlist()
	{
		super(UnitlistUnitlist.class.getName(),"PUBLIC","UNITLIST_UNITLIST",UNITLISTPARENT_ID,
				UNITLIST_ID,UNITLISTCHILD_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(UNITLISTPARENT_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"UNITLISTPARENT_ID","UNITLIST_ID"));
	}
	
	public final static UnitlistUnitlist	VT	= new UnitlistUnitlist();
	
	
	public static UnitlistUnitlist getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}