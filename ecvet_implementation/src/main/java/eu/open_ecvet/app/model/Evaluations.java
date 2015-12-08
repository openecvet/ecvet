
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


public class Evaluations extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	ASSESSMENTLIST_ID;
	public final static VirtualTableColumn<String>	ASSESSMENTLIST_TITLE;
	public final static VirtualTableColumn<Integer>	RECOGNITIONLIST_ID;
	public final static VirtualTableColumn<String>	RECOGNITIONLIST_TITLE;
	public final static VirtualTableColumn<Integer>	VALIDATIONLIST_ID;
	public final static VirtualTableColumn<String>	VALIDATIONLIST_TITLE;
	
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
		
		ASSESSMENTLIST_ID = new VirtualTableColumn<Integer>("ASSESSMENTLIST_ID");
		ASSESSMENTLIST_ID.setType(DataType.INTEGER);
		ASSESSMENTLIST_ID.setDefaultValue(null);
		ASSESSMENTLIST_ID.setVisible(false);
		ASSESSMENTLIST_ID.setPreferredWidth(100);
		ASSESSMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		ASSESSMENTLIST_TITLE = new VirtualTableColumn<String>("ASSESSMENTLIST_TITLE");
		ASSESSMENTLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		ASSESSMENTLIST_TITLE.setDefaultValue(null);
		ASSESSMENTLIST_TITLE.setCaption("TITLE");
		ASSESSMENTLIST_TITLE.setPreferredWidth(100);
		ASSESSMENTLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		RECOGNITIONLIST_ID = new VirtualTableColumn<Integer>("RECOGNITIONLIST_ID");
		RECOGNITIONLIST_ID.setType(DataType.INTEGER);
		RECOGNITIONLIST_ID.setDefaultValue(null);
		RECOGNITIONLIST_ID.setVisible(false);
		RECOGNITIONLIST_ID.setPreferredWidth(100);
		RECOGNITIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		RECOGNITIONLIST_TITLE = new VirtualTableColumn<String>("RECOGNITIONLIST_TITLE");
		RECOGNITIONLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		RECOGNITIONLIST_TITLE.setDefaultValue(null);
		RECOGNITIONLIST_TITLE.setCaption("TITLE");
		RECOGNITIONLIST_TITLE.setPreferredWidth(100);
		RECOGNITIONLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		VALIDATIONLIST_ID = new VirtualTableColumn<Integer>("VALIDATIONLIST_ID");
		VALIDATIONLIST_ID.setType(DataType.INTEGER);
		VALIDATIONLIST_ID.setDefaultValue(null);
		VALIDATIONLIST_ID.setVisible(false);
		VALIDATIONLIST_ID.setPreferredWidth(100);
		VALIDATIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		VALIDATIONLIST_TITLE = new VirtualTableColumn<String>("VALIDATIONLIST_TITLE");
		VALIDATIONLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		VALIDATIONLIST_TITLE.setDefaultValue(null);
		VALIDATIONLIST_TITLE.setCaption("TITLE");
		VALIDATIONLIST_TITLE.setPreferredWidth(100);
		VALIDATIONLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		ASSESSMENTLIST_TITLE.setPersistent(false);
		ASSESSMENTLIST_TITLE.setTableColumnLink(new TableColumnLink(Assessmentlist.class.getName(),
				Assessmentlist.TITLE.getName(),new EntityRelationship(Assessmentlist.class
						.getName(),new String[]{Assessmentlist.ID.getName()},Cardinality.ONE,
						Evaluations.class.getName(),new String[]{Evaluations.ASSESSMENTLIST_ID
								.getName()},Cardinality.MANY)));
		
		RECOGNITIONLIST_TITLE.setPersistent(false);
		RECOGNITIONLIST_TITLE.setTableColumnLink(new TableColumnLink(Recognitionlist.class
				.getName(),Recognitionlist.TITLE.getName(),new EntityRelationship(
				Recognitionlist.class.getName(),new String[]{Recognitionlist.ID.getName()},
				Cardinality.ONE,Evaluations.class.getName(),
				new String[]{Evaluations.RECOGNITIONLIST_ID.getName()},Cardinality.MANY)));
		
		VALIDATIONLIST_TITLE.setPersistent(false);
		VALIDATIONLIST_TITLE.setTableColumnLink(new TableColumnLink(Validationlist.class.getName(),
				Validationlist.TITLE.getName(),new EntityRelationship(Validationlist.class
						.getName(),new String[]{Validationlist.ID.getName()},Cardinality.ONE,
						Evaluations.class.getName(),new String[]{Evaluations.VALIDATIONLIST_ID
								.getName()},Cardinality.MANY)));
	}
	
	
	public Evaluations()
	{
		super(Evaluations.class.getName(),"PUBLIC","EVALUATIONS",ID,DESCRIPTION,TITLE,URI,
				ASSESSMENTLIST_ID,ASSESSMENTLIST_TITLE,RECOGNITIONLIST_ID,RECOGNITIONLIST_TITLE,
				VALIDATIONLIST_ID,VALIDATIONLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_EVALUATIONS_RECOGNITIONLIST_ID_INDEX_B",IndexType.NORMAL,
				"RECOGNITIONLIST_ID"));
		addIndex(new Index("FK_EVALUATIONS_VALIDATIONLIST_ID_INDEX_B",IndexType.NORMAL,
				"VALIDATIONLIST_ID"));
		addIndex(new Index("FK_EVALUATIONS_ASSESSMENTLIST_ID_INDEX_B",IndexType.NORMAL,
				"ASSESSMENTLIST_ID"));
	}
	
	public final static Evaluations	VT	= new Evaluations();
	
	
	public static Evaluations getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}