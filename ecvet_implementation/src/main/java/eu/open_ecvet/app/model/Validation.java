
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
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	CONFIRMINGREQUIREMENTLIST_ID;
	public final static VirtualTableColumn<String>	CONFIRMINGREQUIREMENTLIST_TITLE;
	
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
		
		CONFIRMINGREQUIREMENTLIST_ID = new VirtualTableColumn<Integer>(
				"CONFIRMINGREQUIREMENTLIST_ID");
		CONFIRMINGREQUIREMENTLIST_ID.setType(DataType.INTEGER);
		CONFIRMINGREQUIREMENTLIST_ID.setDefaultValue(null);
		CONFIRMINGREQUIREMENTLIST_ID.setVisible(false);
		CONFIRMINGREQUIREMENTLIST_ID.setPreferredWidth(100);
		CONFIRMINGREQUIREMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		CONFIRMINGREQUIREMENTLIST_TITLE = new VirtualTableColumn<String>(
				"CONFIRMINGREQUIREMENTLIST_TITLE");
		CONFIRMINGREQUIREMENTLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		CONFIRMINGREQUIREMENTLIST_TITLE.setDefaultValue(null);
		CONFIRMINGREQUIREMENTLIST_TITLE.setCaption("TITLE");
		CONFIRMINGREQUIREMENTLIST_TITLE.setPreferredWidth(100);
		CONFIRMINGREQUIREMENTLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		CONFIRMINGREQUIREMENTLIST_TITLE.setPersistent(false);
		CONFIRMINGREQUIREMENTLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Confirmingrequirementlist.class.getName(),
				Confirmingrequirementlist.TITLE.getName(),new EntityRelationship(
						Confirmingrequirementlist.class.getName(),
						new String[]{Confirmingrequirementlist.ID.getName()},Cardinality.ONE,
						Validation.class.getName(),
						new String[]{Validation.CONFIRMINGREQUIREMENTLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Validation()
	{
		super(Validation.class.getName(),"PUBLIC","VALIDATION",ID,DESCRIPTION,TITLE,URI,
				CONFIRMINGREQUIREMENTLIST_ID,CONFIRMINGREQUIREMENTLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_VALIDATION_CONFIRMINGREQUIREMENTLIST_ID_INDEX_1",IndexType.NORMAL,
				"CONFIRMINGREQUIREMENTLIST_ID"));
	}
	
	public final static Validation	VT	= new Validation();
	
	
	public static Validation getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}