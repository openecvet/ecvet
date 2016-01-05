
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
	public final static VirtualTableColumn<String>	UNITLIST_TITLE;
	
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
		
		UNITLIST_TITLE = new VirtualTableColumn<String>("UNITLIST_TITLE");
		UNITLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		UNITLIST_TITLE.setDefaultValue(null);
		UNITLIST_TITLE.setCaption("TITLE");
		UNITLIST_TITLE.setPreferredWidth(100);
		UNITLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		UNITLIST_TITLE.setPersistent(false);
		UNITLIST_TITLE.setTableColumnLink(new TableColumnLink(Unitlist.class.getName(),
				Unitlist.TITLE.getName(),new EntityRelationship(Unitlist.class.getName(),
						new String[]{Unitlist.ID.getName()},Cardinality.ONE,UnitlistUnitlist.class
								.getName(),new String[]{UnitlistUnitlist.UNITLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public UnitlistUnitlist()
	{
		super(UnitlistUnitlist.class.getName(),"PUBLIC","UNITLIST_UNITLIST",UNITLISTPARENT_ID,
				UNITLIST_ID,UNITLIST_TITLE);
		
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