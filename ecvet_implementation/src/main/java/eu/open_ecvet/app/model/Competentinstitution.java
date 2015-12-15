
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


public class Competentinstitution extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	LEGISLATIONLIST_ID;
	public final static VirtualTableColumn<String>	LEGISLATIONLIST_TITLE;
	public final static VirtualTableColumn<Integer>	PARTNERLIST_ID;
	public final static VirtualTableColumn<String>	PARTNERLIST_TITLE;
	
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
		
		LEGISLATIONLIST_ID = new VirtualTableColumn<Integer>("LEGISLATIONLIST_ID");
		LEGISLATIONLIST_ID.setType(DataType.INTEGER);
		LEGISLATIONLIST_ID.setDefaultValue(null);
		LEGISLATIONLIST_ID.setVisible(false);
		LEGISLATIONLIST_ID.setPreferredWidth(100);
		LEGISLATIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		LEGISLATIONLIST_TITLE = new VirtualTableColumn<String>("LEGISLATIONLIST_TITLE");
		LEGISLATIONLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		LEGISLATIONLIST_TITLE.setDefaultValue(null);
		LEGISLATIONLIST_TITLE.setCaption("TITLE");
		LEGISLATIONLIST_TITLE.setPreferredWidth(100);
		LEGISLATIONLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PARTNERLIST_ID = new VirtualTableColumn<Integer>("PARTNERLIST_ID");
		PARTNERLIST_ID.setType(DataType.INTEGER);
		PARTNERLIST_ID.setDefaultValue(null);
		PARTNERLIST_ID.setVisible(false);
		PARTNERLIST_ID.setPreferredWidth(100);
		PARTNERLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		PARTNERLIST_TITLE = new VirtualTableColumn<String>("PARTNERLIST_TITLE");
		PARTNERLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		PARTNERLIST_TITLE.setDefaultValue(null);
		PARTNERLIST_TITLE.setCaption("TITLE");
		PARTNERLIST_TITLE.setPreferredWidth(100);
		PARTNERLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEGISLATIONLIST_TITLE.setPersistent(false);
		LEGISLATIONLIST_TITLE.setTableColumnLink(new TableColumnLink(Legislationlist.class
				.getName(),Legislationlist.TITLE.getName(),new EntityRelationship(
				Legislationlist.class.getName(),new String[]{Legislationlist.ID.getName()},
				Cardinality.ONE,Competentinstitution.class.getName(),
				new String[]{Competentinstitution.LEGISLATIONLIST_ID.getName()},Cardinality.MANY)));
		
		PARTNERLIST_TITLE.setPersistent(false);
		PARTNERLIST_TITLE.setTableColumnLink(new TableColumnLink(Partnerlist.class.getName(),
				Partnerlist.TITLE.getName(),new EntityRelationship(Partnerlist.class.getName(),
						new String[]{Partnerlist.ID.getName()},Cardinality.ONE,
						Competentinstitution.class.getName(),
						new String[]{Competentinstitution.PARTNERLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Competentinstitution()
	{
		super(Competentinstitution.class.getName(),"PUBLIC","COMPETENTINSTITUTION",ID,DESCRIPTION,
				TITLE,URI,LEGISLATIONLIST_ID,LEGISLATIONLIST_TITLE,PARTNERLIST_ID,PARTNERLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("FK_COMPETENTINSTITUTION_LEGISLATIONLIST_ID_INDEX_7",IndexType.NORMAL,
				"LEGISLATIONLIST_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_COMPETENTINSTITUTION_PARTNERLIST_ID_INDEX_7",IndexType.NORMAL,
				"PARTNERLIST_ID"));
	}
	
	public final static Competentinstitution	VT	= new Competentinstitution();
	
	
	public static Competentinstitution getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}