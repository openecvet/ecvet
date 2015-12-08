
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


public class AssessmentlistAssessment extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ASSESSMENTLIST_ID;
	public final static VirtualTableColumn<Integer>	ASSESSMENT_ID;
	public final static VirtualTableColumn<String>	ASSESSMENT_TITLE;
	
	static
	{
		ASSESSMENTLIST_ID = new VirtualTableColumn<Integer>("ASSESSMENTLIST_ID");
		ASSESSMENTLIST_ID.setType(DataType.INTEGER);
		ASSESSMENTLIST_ID.setNullable(false);
		ASSESSMENTLIST_ID.setDefaultValue(0);
		ASSESSMENTLIST_ID.setVisible(false);
		ASSESSMENTLIST_ID.setPreferredWidth(100);
		ASSESSMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		ASSESSMENT_ID = new VirtualTableColumn<Integer>("ASSESSMENT_ID");
		ASSESSMENT_ID.setType(DataType.INTEGER);
		ASSESSMENT_ID.setNullable(false);
		ASSESSMENT_ID.setDefaultValue(0);
		ASSESSMENT_ID.setVisible(false);
		ASSESSMENT_ID.setPreferredWidth(100);
		ASSESSMENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		ASSESSMENT_TITLE = new VirtualTableColumn<String>("ASSESSMENT_TITLE");
		ASSESSMENT_TITLE.setType(DataType.VARCHAR,2147483647);
		ASSESSMENT_TITLE.setDefaultValue(null);
		ASSESSMENT_TITLE.setCaption("TITLE");
		ASSESSMENT_TITLE.setPreferredWidth(100);
		ASSESSMENT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		ASSESSMENT_TITLE.setPersistent(false);
		ASSESSMENT_TITLE.setTableColumnLink(new TableColumnLink(Assessment.class.getName(),
				Assessment.TITLE.getName(),new EntityRelationship(Assessment.class.getName(),
						new String[]{Assessment.ID.getName()},Cardinality.ONE,
						AssessmentlistAssessment.class.getName(),
						new String[]{AssessmentlistAssessment.ASSESSMENT_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public AssessmentlistAssessment()
	{
		super(AssessmentlistAssessment.class.getName(),"PUBLIC","ASSESSMENTLIST_ASSESSMENT",
				ASSESSMENTLIST_ID,ASSESSMENT_ID,ASSESSMENT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(ASSESSMENTLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ASSESSMENT_ID","ASSESSMENTLIST_ID"));
	}
	
	public final static AssessmentlistAssessment	VT	= new AssessmentlistAssessment();
	
	
	public static AssessmentlistAssessment getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}