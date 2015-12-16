
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


public class LearningoutcomelistlistLearningoutcomelist extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELISTLIST_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMELIST_TITLE;
	
	static
	{
		LEARNINGOUTCOMELISTLIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELISTLIST_ID");
		LEARNINGOUTCOMELISTLIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELISTLIST_ID.setNullable(false);
		LEARNINGOUTCOMELISTLIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELISTLIST_ID.setVisible(false);
		LEARNINGOUTCOMELISTLIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELISTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setNullable(false);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELIST_ID.setVisible(false);
		LEARNINGOUTCOMELIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		LEARNINGOUTCOMELIST_TITLE = new VirtualTableColumn<String>("LEARNINGOUTCOMELIST_TITLE");
		LEARNINGOUTCOMELIST_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGOUTCOMELIST_TITLE.setDefaultValue(null);
		LEARNINGOUTCOMELIST_TITLE.setCaption("TITLE");
		LEARNINGOUTCOMELIST_TITLE.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGOUTCOMELIST_TITLE.setPersistent(false);
		LEARNINGOUTCOMELIST_TITLE.setTableColumnLink(new TableColumnLink(Learningoutcomelist.class
				.getName(),Learningoutcomelist.TITLE.getName(),new EntityRelationship(
				Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,LearningoutcomelistlistLearningoutcomelist.class.getName(),
				new String[]{LearningoutcomelistlistLearningoutcomelist.LEARNINGOUTCOMELIST_ID
						.getName()},Cardinality.MANY)));
	}
	
	
	public LearningoutcomelistlistLearningoutcomelist()
	{
		super(LearningoutcomelistlistLearningoutcomelist.class.getName(),"PUBLIC",
				"LEARNINGOUTCOMELISTLIST_LEARNINGOUTCOMELIST",LEARNINGOUTCOMELISTLIST_ID,
				LEARNINGOUTCOMELIST_ID,LEARNINGOUTCOMELIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGOUTCOMELISTLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEARNINGOUTCOMELISTLIST_ID",
				"LEARNINGOUTCOMELIST_ID"));
	}
	
	public final static LearningoutcomelistlistLearningoutcomelist	VT	= new LearningoutcomelistlistLearningoutcomelist();
	
	
	public static LearningoutcomelistlistLearningoutcomelist getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}