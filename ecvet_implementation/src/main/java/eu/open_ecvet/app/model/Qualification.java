
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


public class Qualification extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	WHOLEECVETPOINTS;
	public final static VirtualTableColumn<Integer>	UNITLIST_ID;
	public final static VirtualTableColumn<String>	UNITLIST_TITLE;
	
	static
	{
		ID = new VirtualTableColumn<Integer>("ID");
		ID.setType(DataType.INTEGER);
		ID.setNullable(false);
		ID.setAutoIncrement(true);
		ID.setDefaultValue(0);
		ID.setVisible(false);
		ID.setEditable(false);
		ID.setPreferredWidth(100);
		ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		
		DESCRIPTION = new VirtualTableColumn<String>("DESCRIPTION");
		DESCRIPTION.setType(DataType.VARCHAR,2147483647);
		DESCRIPTION.setDefaultValue(null);
		DESCRIPTION.setPreferredWidth(100);
		DESCRIPTION.setTextFormat(TextFormat.getPlainInstance());
		
		TITLE = new VirtualTableColumn<String>("TITLE");
		TITLE.setType(DataType.VARCHAR,2147483647);
		TITLE.setDefaultValue(null);
		TITLE.setPreferredWidth(100);
		TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		URI = new VirtualTableColumn<String>("URI");
		URI.setType(DataType.VARCHAR,2147483647);
		URI.setDefaultValue(null);
		URI.setPreferredWidth(100);
		URI.setTextFormat(TextFormat.getPlainInstance());
		
		WHOLEECVETPOINTS = new VirtualTableColumn<Integer>("WHOLEECVETPOINTS");
		WHOLEECVETPOINTS.setType(DataType.INTEGER);
		WHOLEECVETPOINTS.setDefaultValue(null);
		WHOLEECVETPOINTS.setPreferredWidth(100);
		WHOLEECVETPOINTS.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		UNITLIST_ID = new VirtualTableColumn<Integer>("UNITLIST_ID");
		UNITLIST_ID.setType(DataType.INTEGER);
		UNITLIST_ID.setDefaultValue(null);
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
						new String[]{Unitlist.ID.getName()},Cardinality.ONE,Qualification.class
								.getName(),new String[]{Qualification.UNITLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Qualification()
	{
		super(Qualification.class.getName(),"PUBLIC","QUALIFICATION",ID,DESCRIPTION,TITLE,URI,
				WHOLEECVETPOINTS,UNITLIST_ID,UNITLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_QUALIFICATION_UNITLIST_ID_INDEX_9",IndexType.NORMAL,"UNITLIST_ID"));
	}
	
	public final static Qualification	VT	= new Qualification();
	
	
	public static Qualification getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}