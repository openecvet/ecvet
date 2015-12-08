
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


public class ReferencelevellistReferencelevel extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	REFERENCELEVELLIST_ID;
	public final static VirtualTableColumn<Integer>	REFERENCELEVEL_ID;
	public final static VirtualTableColumn<String>	REFERENCELEVEL_TITLE;
	
	static
	{
		REFERENCELEVELLIST_ID = new VirtualTableColumn<Integer>("REFERENCELEVELLIST_ID");
		REFERENCELEVELLIST_ID.setType(DataType.INTEGER);
		REFERENCELEVELLIST_ID.setNullable(false);
		REFERENCELEVELLIST_ID.setDefaultValue(0);
		REFERENCELEVELLIST_ID.setVisible(false);
		REFERENCELEVELLIST_ID.setPreferredWidth(100);
		REFERENCELEVELLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		REFERENCELEVEL_ID = new VirtualTableColumn<Integer>("REFERENCELEVEL_ID");
		REFERENCELEVEL_ID.setType(DataType.INTEGER);
		REFERENCELEVEL_ID.setNullable(false);
		REFERENCELEVEL_ID.setDefaultValue(0);
		REFERENCELEVEL_ID.setVisible(false);
		REFERENCELEVEL_ID.setPreferredWidth(100);
		REFERENCELEVEL_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		REFERENCELEVEL_TITLE = new VirtualTableColumn<String>("REFERENCELEVEL_TITLE");
		REFERENCELEVEL_TITLE.setType(DataType.VARCHAR,2147483647);
		REFERENCELEVEL_TITLE.setDefaultValue(null);
		REFERENCELEVEL_TITLE.setCaption("TITLE");
		REFERENCELEVEL_TITLE.setPreferredWidth(100);
		REFERENCELEVEL_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		REFERENCELEVEL_TITLE.setPersistent(false);
		REFERENCELEVEL_TITLE.setTableColumnLink(new TableColumnLink(Referencelevel.class.getName(),
				Referencelevel.TITLE.getName(),new EntityRelationship(Referencelevel.class
						.getName(),new String[]{Referencelevel.ID.getName()},Cardinality.ONE,
						ReferencelevellistReferencelevel.class.getName(),
						new String[]{ReferencelevellistReferencelevel.REFERENCELEVEL_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public ReferencelevellistReferencelevel()
	{
		super(ReferencelevellistReferencelevel.class.getName(),"PUBLIC",
				"REFERENCELEVELLIST_REFERENCELEVEL",REFERENCELEVELLIST_ID,REFERENCELEVEL_ID,
				REFERENCELEVEL_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(REFERENCELEVELLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"REFERENCELEVELLIST_ID",
				"REFERENCELEVEL_ID"));
	}
	
	public final static ReferencelevellistReferencelevel	VT	= new ReferencelevellistReferencelevel();
	
	
	public static ReferencelevellistReferencelevel getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}