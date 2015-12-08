
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


public class Learningoutcometerm extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	WEIGHT;
	public final static VirtualTableColumn<Integer>	EVALUATIONS_ID;
	public final static VirtualTableColumn<String>	EVALUATIONS_TITLE;
	public final static VirtualTableColumn<Integer>	REFERENCELEVELLIST_ID;
	public final static VirtualTableColumn<String>	REFERENCELEVELLIST_TITLE;
	
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
		
		WEIGHT = new VirtualTableColumn<Integer>("WEIGHT");
		WEIGHT.setType(DataType.INTEGER);
		WEIGHT.setDefaultValue(null);
		WEIGHT.setPreferredWidth(100);
		WEIGHT.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		
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
		
		REFERENCELEVELLIST_ID = new VirtualTableColumn<Integer>("REFERENCELEVELLIST_ID");
		REFERENCELEVELLIST_ID.setType(DataType.INTEGER);
		REFERENCELEVELLIST_ID.setDefaultValue(null);
		REFERENCELEVELLIST_ID.setVisible(false);
		REFERENCELEVELLIST_ID.setPreferredWidth(100);
		REFERENCELEVELLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		REFERENCELEVELLIST_TITLE = new VirtualTableColumn<String>("REFERENCELEVELLIST_TITLE");
		REFERENCELEVELLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		REFERENCELEVELLIST_TITLE.setDefaultValue(null);
		REFERENCELEVELLIST_TITLE.setCaption("TITLE");
		REFERENCELEVELLIST_TITLE.setPreferredWidth(100);
		REFERENCELEVELLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		EVALUATIONS_TITLE.setPersistent(false);
		EVALUATIONS_TITLE
				.setTableColumnLink(new TableColumnLink(Evaluations.class.getName(),
						Evaluations.TITLE.getName(),new EntityRelationship(Evaluations.class
								.getName(),new String[]{Evaluations.ID.getName()},Cardinality.ONE,
								Learningoutcometerm.class.getName(),
								new String[]{Learningoutcometerm.EVALUATIONS_ID.getName()},
								Cardinality.MANY)));
		
		REFERENCELEVELLIST_TITLE.setPersistent(false);
		REFERENCELEVELLIST_TITLE
				.setTableColumnLink(new TableColumnLink(Referencelevellist.class.getName(),
						Referencelevellist.TITLE.getName(),new EntityRelationship(
								Referencelevellist.class.getName(),
								new String[]{Referencelevellist.ID.getName()},Cardinality.ONE,
								Learningoutcometerm.class.getName(),
								new String[]{Learningoutcometerm.REFERENCELEVELLIST_ID.getName()},
								Cardinality.MANY)));
	}
	
	
	public Learningoutcometerm()
	{
		super(Learningoutcometerm.class.getName(),"PUBLIC","LEARNINGOUTCOMETERM",ID,DESCRIPTION,
				TITLE,URI,WEIGHT,EVALUATIONS_ID,EVALUATIONS_TITLE,REFERENCELEVELLIST_ID,
				REFERENCELEVELLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_LEARNINGOUTCOMETERM_EVALUATIONS_ID_INDEX_1",IndexType.NORMAL,
				"EVALUATIONS_ID"));
		addIndex(new Index("FK_LEARNINGOUTCOMETERM_REFERENCELEVELLIST_ID_INDEX_1",IndexType.NORMAL,
				"REFERENCELEVELLIST_ID"));
	}
	
	public final static Learningoutcometerm	VT	= new Learningoutcometerm();
	
	
	public static Learningoutcometerm getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}