
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
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<Integer>	ECVETPOINTS;
	public final static VirtualTableColumn<Integer>	RELATIVEWEIGHT;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	EVALUATIONS_ID;
	public final static VirtualTableColumn<String>	EVALUATIONS_TITLE;
	public final static VirtualTableColumn<Integer>	QUALIFICATIONFRAMEWORKLIST_ID;
	public final static VirtualTableColumn<String>	QUALIFICATIONFRAMEWORKLIST_TITLE;
	
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
		
		ECVETPOINTS = new VirtualTableColumn<Integer>("ECVETPOINTS");
		ECVETPOINTS.setType(DataType.INTEGER);
		ECVETPOINTS.setDefaultValue(null);
		ECVETPOINTS.setPreferredWidth(100);
		ECVETPOINTS.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		RELATIVEWEIGHT = new VirtualTableColumn<Integer>("RELATIVEWEIGHT");
		RELATIVEWEIGHT.setType(DataType.INTEGER);
		RELATIVEWEIGHT.setDefaultValue(null);
		RELATIVEWEIGHT.setPreferredWidth(100);
		RELATIVEWEIGHT.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
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
		
		EVALUATIONS_ID = new VirtualTableColumn<Integer>("EVALUATIONS_ID");
		EVALUATIONS_ID.setType(DataType.INTEGER);
		EVALUATIONS_ID.setDefaultValue(null);
		EVALUATIONS_ID.setVisible(false);
		EVALUATIONS_ID.setPreferredWidth(100);
		EVALUATIONS_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		EVALUATIONS_TITLE = new VirtualTableColumn<String>("EVALUATIONS_TITLE");
		EVALUATIONS_TITLE.setType(DataType.VARCHAR,2147483647);
		EVALUATIONS_TITLE.setDefaultValue(null);
		EVALUATIONS_TITLE.setCaption("TITLE");
		EVALUATIONS_TITLE.setPreferredWidth(100);
		EVALUATIONS_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		QUALIFICATIONFRAMEWORKLIST_ID = new VirtualTableColumn<Integer>(
				"QUALIFICATIONFRAMEWORKLIST_ID");
		QUALIFICATIONFRAMEWORKLIST_ID.setType(DataType.INTEGER);
		QUALIFICATIONFRAMEWORKLIST_ID.setDefaultValue(null);
		QUALIFICATIONFRAMEWORKLIST_ID.setVisible(false);
		QUALIFICATIONFRAMEWORKLIST_ID.setPreferredWidth(100);
		QUALIFICATIONFRAMEWORKLIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		QUALIFICATIONFRAMEWORKLIST_TITLE = new VirtualTableColumn<String>(
				"QUALIFICATIONFRAMEWORKLIST_TITLE");
		QUALIFICATIONFRAMEWORKLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		QUALIFICATIONFRAMEWORKLIST_TITLE.setDefaultValue(null);
		QUALIFICATIONFRAMEWORKLIST_TITLE.setCaption("TITLE");
		QUALIFICATIONFRAMEWORKLIST_TITLE.setPreferredWidth(100);
		QUALIFICATIONFRAMEWORKLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		EVALUATIONS_TITLE.setPersistent(false);
		EVALUATIONS_TITLE.setTableColumnLink(new TableColumnLink(Evaluations.class.getName(),
				Evaluations.TITLE.getName(),new EntityRelationship(Evaluations.class.getName(),
						new String[]{Evaluations.ID.getName()},Cardinality.ONE,
						Learningoutcome.class.getName(),new String[]{Learningoutcome.EVALUATIONS_ID
								.getName()},Cardinality.MANY)));
		
		QUALIFICATIONFRAMEWORKLIST_TITLE.setPersistent(false);
		QUALIFICATIONFRAMEWORKLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Qualificationframeworklist.class.getName(),Qualificationframeworklist.TITLE
						.getName(),new EntityRelationship(Qualificationframeworklist.class
						.getName(),new String[]{Qualificationframeworklist.ID.getName()},
						Cardinality.ONE,Learningoutcome.class.getName(),
						new String[]{Learningoutcome.QUALIFICATIONFRAMEWORKLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Learningoutcome()
	{
		super(Learningoutcome.class.getName(),"PUBLIC","LEARNINGOUTCOME",ID,DESCRIPTION,
				ECVETPOINTS,RELATIVEWEIGHT,TITLE,URI,EVALUATIONS_ID,EVALUATIONS_TITLE,
				QUALIFICATIONFRAMEWORKLIST_ID,QUALIFICATIONFRAMEWORKLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("FK_LEARNINGOUTCOME_QUALIFICATIONFRAMEWORKLIST_ID_INDEX_7",
				IndexType.NORMAL,"QUALIFICATIONFRAMEWORKLIST_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_LEARNINGOUTCOME_EVALUATIONS_ID_INDEX_7",IndexType.NORMAL,
				"EVALUATIONS_ID"));
	}
	
	public final static Learningoutcome	VT	= new Learningoutcome();
	
	
	public static Learningoutcome getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}