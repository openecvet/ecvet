
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


public class LearningoutcomelistLearningoutcomelist extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELISTPARENT_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMELIST_TITLE;
	
	static
	{
		LEARNINGOUTCOMELISTPARENT_ID = new VirtualTableColumn<Integer>(
				"LEARNINGOUTCOMELISTPARENT_ID");
		LEARNINGOUTCOMELISTPARENT_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELISTPARENT_ID.setNullable(false);
		LEARNINGOUTCOMELISTPARENT_ID.setDefaultValue(0);
		LEARNINGOUTCOMELISTPARENT_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELISTPARENT_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setAutoIncrement(true);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELIST_ID.setVisible(false);
		LEARNINGOUTCOMELIST_ID.setEditable(false);
		LEARNINGOUTCOMELIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		LEARNINGOUTCOMELIST_TITLE = new VirtualTableColumn<String>("LEARNINGOUTCOMELIST_TITLE");
		LEARNINGOUTCOMELIST_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGOUTCOMELIST_TITLE.setDefaultValue(null);
		LEARNINGOUTCOMELIST_TITLE.setCaption("TITLE");
		LEARNINGOUTCOMELIST_TITLE.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGOUTCOMELIST_ID.setPersistent(false);
		LEARNINGOUTCOMELIST_ID.setTableColumnLink(new TableColumnLink(Learningoutcomelist.class
				.getName(),Learningoutcomelist.ID.getName(),new EntityRelationship(
				Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcomelist.class.getName(),
				new String[]{LearningoutcomelistLearningoutcomelist.LEARNINGOUTCOMELIST_ID
						.getName()},Cardinality.MANY)));
		
		LEARNINGOUTCOMELIST_TITLE.setPersistent(false);
		LEARNINGOUTCOMELIST_TITLE.setTableColumnLink(new TableColumnLink(Learningoutcomelist.class
				.getName(),Learningoutcomelist.TITLE.getName(),new EntityRelationship(
				Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,LearningoutcomelistLearningoutcomelist.class.getName(),
				new String[]{LearningoutcomelistLearningoutcomelist.LEARNINGOUTCOMELIST_ID
						.getName()},Cardinality.MANY)));
	}
	
	
	public LearningoutcomelistLearningoutcomelist()
	{
		super(LearningoutcomelistLearningoutcomelist.class.getName(),"PUBLIC",
				"LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST",LEARNINGOUTCOMELISTPARENT_ID,
				LEARNINGOUTCOMELIST_ID,LEARNINGOUTCOMELIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGOUTCOMELISTPARENT_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEARNINGOUTCOMELISTPARENT_ID",
				"LEARNINGOUTCOMELIST_ID"));
	}
	
	public final static LearningoutcomelistLearningoutcomelist	VT	= new LearningoutcomelistLearningoutcomelist();
	
	
	public static LearningoutcomelistLearningoutcomelist getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}