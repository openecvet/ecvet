
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


public class ConfirmingrequirementlistConfirmingrequirement extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	CONFIRMINGREQUIREMENTLIST_ID;
	public final static VirtualTableColumn<String>	CONFIRMINGREQUIREMENTLIST_TITLE;
	public final static VirtualTableColumn<Integer>	CONFIRMINGREQUIREMENT_ID;
	public final static VirtualTableColumn<String>	CONFIRMINGREQUIREMENT_TITLE;
	
	static
	{
		CONFIRMINGREQUIREMENTLIST_ID = new VirtualTableColumn<Integer>(
				"CONFIRMINGREQUIREMENTLIST_ID");
		CONFIRMINGREQUIREMENTLIST_ID.setType(DataType.INTEGER);
		CONFIRMINGREQUIREMENTLIST_ID.setNullable(false);
		CONFIRMINGREQUIREMENTLIST_ID.setDefaultValue(0);
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
		
		CONFIRMINGREQUIREMENT_ID = new VirtualTableColumn<Integer>("CONFIRMINGREQUIREMENT_ID");
		CONFIRMINGREQUIREMENT_ID.setType(DataType.INTEGER);
		CONFIRMINGREQUIREMENT_ID.setNullable(false);
		CONFIRMINGREQUIREMENT_ID.setDefaultValue(0);
		CONFIRMINGREQUIREMENT_ID.setVisible(false);
		CONFIRMINGREQUIREMENT_ID.setPreferredWidth(100);
		CONFIRMINGREQUIREMENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		CONFIRMINGREQUIREMENT_TITLE = new VirtualTableColumn<String>("CONFIRMINGREQUIREMENT_TITLE");
		CONFIRMINGREQUIREMENT_TITLE.setType(DataType.VARCHAR,2147483647);
		CONFIRMINGREQUIREMENT_TITLE.setDefaultValue(null);
		CONFIRMINGREQUIREMENT_TITLE.setCaption("TITLE");
		CONFIRMINGREQUIREMENT_TITLE.setPreferredWidth(100);
		CONFIRMINGREQUIREMENT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		CONFIRMINGREQUIREMENTLIST_TITLE.setPersistent(false);
		CONFIRMINGREQUIREMENTLIST_TITLE
				.setTableColumnLink(new TableColumnLink(
						Confirmingrequirementlist.class.getName(),
						Confirmingrequirementlist.TITLE.getName(),
						new EntityRelationship(
								Confirmingrequirementlist.class.getName(),
								new String[]{Confirmingrequirementlist.ID.getName()},
								Cardinality.ONE,
								ConfirmingrequirementlistConfirmingrequirement.class.getName(),
								new String[]{ConfirmingrequirementlistConfirmingrequirement.CONFIRMINGREQUIREMENTLIST_ID
										.getName()},Cardinality.MANY)));
		
		CONFIRMINGREQUIREMENT_TITLE.setPersistent(false);
		CONFIRMINGREQUIREMENT_TITLE
				.setTableColumnLink(new TableColumnLink(
						Confirmingrequirement.class.getName(),
						Confirmingrequirement.TITLE.getName(),
						new EntityRelationship(
								Confirmingrequirement.class.getName(),
								new String[]{Confirmingrequirement.ID.getName()},
								Cardinality.ONE,
								ConfirmingrequirementlistConfirmingrequirement.class.getName(),
								new String[]{ConfirmingrequirementlistConfirmingrequirement.CONFIRMINGREQUIREMENT_ID
										.getName()},Cardinality.MANY)));
	}
	
	
	public ConfirmingrequirementlistConfirmingrequirement()
	{
		super(ConfirmingrequirementlistConfirmingrequirement.class.getName(),"PUBLIC",
				"CONFIRMINGREQUIREMENTLIST_CONFIRMINGREQUIREMENT",CONFIRMINGREQUIREMENTLIST_ID,
				CONFIRMINGREQUIREMENTLIST_TITLE,CONFIRMINGREQUIREMENT_ID,
				CONFIRMINGREQUIREMENT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(CONFIRMINGREQUIREMENTLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"CONFIRMINGREQUIREMENT_ID",
				"CONFIRMINGREQUIREMENTLIST_ID"));
	}
	
	public final static ConfirmingrequirementlistConfirmingrequirement	VT	= new ConfirmingrequirementlistConfirmingrequirement();
	
	
	public static ConfirmingrequirementlistConfirmingrequirement getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}