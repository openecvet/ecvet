
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


public class CompetentinstitutionlistCompetentinstitution extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	COMPETENTINSTITUTIONLIST_ID;
	public final static VirtualTableColumn<Integer>	COMPETENTINSTITUTION_ID;
	public final static VirtualTableColumn<String>	COMPETENTINSTITUTION_TITLE;
	
	static
	{
		COMPETENTINSTITUTIONLIST_ID = new VirtualTableColumn<Integer>("COMPETENTINSTITUTIONLIST_ID");
		COMPETENTINSTITUTIONLIST_ID.setType(DataType.INTEGER);
		COMPETENTINSTITUTIONLIST_ID.setNullable(false);
		COMPETENTINSTITUTIONLIST_ID.setDefaultValue(0);
		COMPETENTINSTITUTIONLIST_ID.setVisible(false);
		COMPETENTINSTITUTIONLIST_ID.setPreferredWidth(100);
		COMPETENTINSTITUTIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		COMPETENTINSTITUTION_ID = new VirtualTableColumn<Integer>("COMPETENTINSTITUTION_ID");
		COMPETENTINSTITUTION_ID.setType(DataType.INTEGER);
		COMPETENTINSTITUTION_ID.setNullable(false);
		COMPETENTINSTITUTION_ID.setDefaultValue(0);
		COMPETENTINSTITUTION_ID.setVisible(false);
		COMPETENTINSTITUTION_ID.setPreferredWidth(100);
		COMPETENTINSTITUTION_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		COMPETENTINSTITUTION_TITLE = new VirtualTableColumn<String>("COMPETENTINSTITUTION_TITLE");
		COMPETENTINSTITUTION_TITLE.setType(DataType.VARCHAR,2147483647);
		COMPETENTINSTITUTION_TITLE.setDefaultValue(null);
		COMPETENTINSTITUTION_TITLE.setCaption("TITLE");
		COMPETENTINSTITUTION_TITLE.setPreferredWidth(100);
		COMPETENTINSTITUTION_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		COMPETENTINSTITUTION_TITLE.setPersistent(false);
		COMPETENTINSTITUTION_TITLE
				.setTableColumnLink(new TableColumnLink(
						Competentinstitution.class.getName(),
						Competentinstitution.TITLE.getName(),
						new EntityRelationship(
								Competentinstitution.class.getName(),
								new String[]{Competentinstitution.ID.getName()},
								Cardinality.ONE,
								CompetentinstitutionlistCompetentinstitution.class.getName(),
								new String[]{CompetentinstitutionlistCompetentinstitution.COMPETENTINSTITUTION_ID
										.getName()},Cardinality.MANY)));
	}
	
	
	public CompetentinstitutionlistCompetentinstitution()
	{
		super(CompetentinstitutionlistCompetentinstitution.class.getName(),"PUBLIC",
				"COMPETENTINSTITUTIONLIST_COMPETENTINSTITUTION",COMPETENTINSTITUTIONLIST_ID,
				COMPETENTINSTITUTION_ID,COMPETENTINSTITUTION_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(COMPETENTINSTITUTIONLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"COMPETENTINSTITUTION_ID",
				"COMPETENTINSTITUTIONLIST_ID"));
	}
	
	public final static CompetentinstitutionlistCompetentinstitution	VT	= new CompetentinstitutionlistCompetentinstitution();
	
	
	public static CompetentinstitutionlistCompetentinstitution getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}