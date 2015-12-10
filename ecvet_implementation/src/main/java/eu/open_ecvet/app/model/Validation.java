
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


public class Validation extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	ASSESSMENTURI;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	REQUIREMENTLIST_ID;
	public final static VirtualTableColumn<String>	REQUIREMENTLIST_TITLE;
	
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
		
		ASSESSMENTURI = new VirtualTableColumn<String>("ASSESSMENTURI");
		ASSESSMENTURI.setType(DataType.VARCHAR,2147483647);
		ASSESSMENTURI.setDefaultValue(null);
		ASSESSMENTURI.setPreferredWidth(100);
		ASSESSMENTURI.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		REQUIREMENTLIST_ID = new VirtualTableColumn<Integer>("REQUIREMENTLIST_ID");
		REQUIREMENTLIST_ID.setType(DataType.INTEGER);
		REQUIREMENTLIST_ID.setDefaultValue(null);
		REQUIREMENTLIST_ID.setVisible(false);
		REQUIREMENTLIST_ID.setPreferredWidth(100);
		REQUIREMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		REQUIREMENTLIST_TITLE = new VirtualTableColumn<String>("REQUIREMENTLIST_TITLE");
		REQUIREMENTLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		REQUIREMENTLIST_TITLE.setDefaultValue(null);
		REQUIREMENTLIST_TITLE.setCaption("TITLE");
		REQUIREMENTLIST_TITLE.setPreferredWidth(100);
		REQUIREMENTLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		REQUIREMENTLIST_TITLE.setPersistent(false);
		REQUIREMENTLIST_TITLE.setTableColumnLink(new TableColumnLink(Requirementlist.class
				.getName(),Requirementlist.TITLE.getName(),new EntityRelationship(
				Requirementlist.class.getName(),new String[]{Requirementlist.ID.getName()},
				Cardinality.ONE,Validation.class.getName(),
				new String[]{Validation.REQUIREMENTLIST_ID.getName()},Cardinality.MANY)));
	}
	
	
	public Validation()
	{
		super(Validation.class.getName(),"PUBLIC","VALIDATION",ID,ASSESSMENTURI,DESCRIPTION,TITLE,
				URI,REQUIREMENTLIST_ID,REQUIREMENTLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_VALIDATION_REQUIREMENTLIST_ID_INDEX_1",IndexType.NORMAL,
				"REQUIREMENTLIST_ID"));
	}
	
	public final static Validation	VT	= new Validation();
	
	
	public static Validation getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}