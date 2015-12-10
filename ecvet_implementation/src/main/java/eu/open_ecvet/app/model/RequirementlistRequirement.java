
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


public class RequirementlistRequirement extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	REQUIREMENTLIST_ID;
	public final static VirtualTableColumn<Integer>	REQUIREMENT_ID;
	public final static VirtualTableColumn<String>	REQUIREMENT_TITLE;
	
	static
	{
		REQUIREMENTLIST_ID = new VirtualTableColumn<Integer>("REQUIREMENTLIST_ID");
		REQUIREMENTLIST_ID.setType(DataType.INTEGER);
		REQUIREMENTLIST_ID.setNullable(false);
		REQUIREMENTLIST_ID.setDefaultValue(0);
		REQUIREMENTLIST_ID.setVisible(false);
		REQUIREMENTLIST_ID.setPreferredWidth(100);
		REQUIREMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		REQUIREMENT_ID = new VirtualTableColumn<Integer>("REQUIREMENT_ID");
		REQUIREMENT_ID.setType(DataType.INTEGER);
		REQUIREMENT_ID.setNullable(false);
		REQUIREMENT_ID.setDefaultValue(0);
		REQUIREMENT_ID.setVisible(false);
		REQUIREMENT_ID.setPreferredWidth(100);
		REQUIREMENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		REQUIREMENT_TITLE = new VirtualTableColumn<String>("REQUIREMENT_TITLE");
		REQUIREMENT_TITLE.setType(DataType.VARCHAR,2147483647);
		REQUIREMENT_TITLE.setDefaultValue(null);
		REQUIREMENT_TITLE.setCaption("TITLE");
		REQUIREMENT_TITLE.setPreferredWidth(100);
		REQUIREMENT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		REQUIREMENT_TITLE.setPersistent(false);
		REQUIREMENT_TITLE.setTableColumnLink(new TableColumnLink(Requirement.class.getName(),
				Requirement.TITLE.getName(),new EntityRelationship(Requirement.class.getName(),
						new String[]{Requirement.ID.getName()},Cardinality.ONE,
						RequirementlistRequirement.class.getName(),
						new String[]{RequirementlistRequirement.REQUIREMENT_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public RequirementlistRequirement()
	{
		super(RequirementlistRequirement.class.getName(),"PUBLIC","REQUIREMENTLIST_REQUIREMENT",
				REQUIREMENTLIST_ID,REQUIREMENT_ID,REQUIREMENT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(REQUIREMENTLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"REQUIREMENT_ID",
				"REQUIREMENTLIST_ID"));
	}
	
	public final static RequirementlistRequirement	VT	= new RequirementlistRequirement();
	
	
	public static RequirementlistRequirement getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}