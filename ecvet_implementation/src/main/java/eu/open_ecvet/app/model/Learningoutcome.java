
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


public class Learningoutcome extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<Integer>	CREDIT;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMETERMLIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMETERMLIST_TITLE;
	
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
		
		CREDIT = new VirtualTableColumn<Integer>("CREDIT");
		CREDIT.setType(DataType.INTEGER);
		CREDIT.setDefaultValue(null);
		CREDIT.setPreferredWidth(100);
		CREDIT.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		
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
		
		LEARNINGOUTCOMETERMLIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMETERMLIST_ID");
		LEARNINGOUTCOMETERMLIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMETERMLIST_ID.setDefaultValue(null);
		LEARNINGOUTCOMETERMLIST_ID.setVisible(false);
		LEARNINGOUTCOMETERMLIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMETERMLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		LEARNINGOUTCOMETERMLIST_TITLE = new VirtualTableColumn<String>(
				"LEARNINGOUTCOMETERMLIST_TITLE");
		LEARNINGOUTCOMETERMLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGOUTCOMETERMLIST_TITLE.setDefaultValue(null);
		LEARNINGOUTCOMETERMLIST_TITLE.setCaption("TITLE");
		LEARNINGOUTCOMETERMLIST_TITLE.setPreferredWidth(100);
		LEARNINGOUTCOMETERMLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGOUTCOMETERMLIST_TITLE.setPersistent(false);
		LEARNINGOUTCOMETERMLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Learningoutcometermlist.class.getName(),Learningoutcometermlist.TITLE.getName(),
				new EntityRelationship(Learningoutcometermlist.class.getName(),
						new String[]{Learningoutcometermlist.ID.getName()},Cardinality.ONE,
						Learningoutcome.class.getName(),
						new String[]{Learningoutcome.LEARNINGOUTCOMETERMLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Learningoutcome()
	{
		super(Learningoutcome.class.getName(),"PUBLIC","LEARNINGOUTCOME",ID,CREDIT,DESCRIPTION,
				TITLE,URI,LEARNINGOUTCOMETERMLIST_ID,LEARNINGOUTCOMETERMLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_LEARNINGOUTCOME_LEARNINGOUTCOMETERMLIST_ID_INDEX_7",
				IndexType.NORMAL,"LEARNINGOUTCOMETERMLIST_ID"));
	}
	
	public final static Learningoutcome	VT	= new Learningoutcome();
	
	
	public static Learningoutcome getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}