
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


public class LegislationlistLegislation extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEGISLATIONLIST_ID;
	public final static VirtualTableColumn<Integer>	LEGISLATION_ID;
	public final static VirtualTableColumn<String>	LEGISLATION_TITLE;
	
	static
	{
		LEGISLATIONLIST_ID = new VirtualTableColumn<Integer>("LEGISLATIONLIST_ID");
		LEGISLATIONLIST_ID.setType(DataType.INTEGER);
		LEGISLATIONLIST_ID.setNullable(false);
		LEGISLATIONLIST_ID.setDefaultValue(0);
		LEGISLATIONLIST_ID.setVisible(false);
		LEGISLATIONLIST_ID.setPreferredWidth(100);
		LEGISLATIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		LEGISLATION_ID = new VirtualTableColumn<Integer>("LEGISLATION_ID");
		LEGISLATION_ID.setType(DataType.INTEGER);
		LEGISLATION_ID.setNullable(false);
		LEGISLATION_ID.setDefaultValue(0);
		LEGISLATION_ID.setVisible(false);
		LEGISLATION_ID.setPreferredWidth(100);
		LEGISLATION_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		LEGISLATION_TITLE = new VirtualTableColumn<String>("LEGISLATION_TITLE");
		LEGISLATION_TITLE.setType(DataType.VARCHAR,2147483647);
		LEGISLATION_TITLE.setDefaultValue(null);
		LEGISLATION_TITLE.setCaption("TITLE");
		LEGISLATION_TITLE.setPreferredWidth(100);
		LEGISLATION_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEGISLATION_TITLE.setPersistent(false);
		LEGISLATION_TITLE.setTableColumnLink(new TableColumnLink(Legislation.class.getName(),
				Legislation.TITLE.getName(),new EntityRelationship(Legislation.class.getName(),
						new String[]{Legislation.ID.getName()},Cardinality.ONE,
						LegislationlistLegislation.class.getName(),
						new String[]{LegislationlistLegislation.LEGISLATION_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public LegislationlistLegislation()
	{
		super(LegislationlistLegislation.class.getName(),"PUBLIC","LEGISLATIONLIST_LEGISLATION",
				LEGISLATIONLIST_ID,LEGISLATION_ID,LEGISLATION_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEGISLATIONLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEGISLATION_ID",
				"LEGISLATIONLIST_ID"));
	}
	
	public final static LegislationlistLegislation	VT	= new LegislationlistLegislation();
	
	
	public static LegislationlistLegislation getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}