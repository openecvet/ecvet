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

public class LearningoutcomelistLearningoutcomelist extends VirtualTable implements StaticInstanceSupport //  ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{

	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMELISTCHILD_TITLE;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELISTPARENT_ID;
	
	static
	{
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setNullable(false);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMELIST_ID.setVisible(false);
		LEARNINGOUTCOMELIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		LEARNINGOUTCOMELISTCHILD_TITLE = new VirtualTableColumn<String>(
				"LEARNINGOUTCOMELISTCHILD_TITLE");
		LEARNINGOUTCOMELISTCHILD_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGOUTCOMELISTCHILD_TITLE.setDefaultValue(null);
		LEARNINGOUTCOMELISTCHILD_TITLE.setCaption("TITLE");
		LEARNINGOUTCOMELISTCHILD_TITLE.setPreferredWidth(100);
		LEARNINGOUTCOMELISTCHILD_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGOUTCOMELISTPARENT_ID = new VirtualTableColumn<Integer>(
				"LEARNINGOUTCOMELISTPARENT_ID");
		LEARNINGOUTCOMELISTPARENT_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELISTPARENT_ID.setNullable(false);
		LEARNINGOUTCOMELISTPARENT_ID.setDefaultValue(0);
		LEARNINGOUTCOMELISTPARENT_ID.setVisible(false);
		LEARNINGOUTCOMELISTPARENT_ID.setPreferredWidth(100);
		LEARNINGOUTCOMELISTPARENT_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		LEARNINGOUTCOMELISTCHILD_TITLE.setPersistent(false);
		LEARNINGOUTCOMELISTCHILD_TITLE.setTableColumnLink(new TableColumnLink(
				LearningoutcomelistChild.class.getName(),LearningoutcomelistChild.TITLE.getName(),
				new EntityRelationship(LearningoutcomelistChild.class.getName(),
						new String[]{LearningoutcomelistChild.ID.getName()},Cardinality.ONE,
						LearningoutcomelistLearningoutcomelist.class.getName(),
						new String[]{LearningoutcomelistLearningoutcomelist.LEARNINGOUTCOMELIST_ID
								.getName()},Cardinality.MANY)));
	}
	
	
	public LearningoutcomelistLearningoutcomelist()
	{
		super(LearningoutcomelistLearningoutcomelist.class.getName(),"PUBLIC",
				"LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST",LEARNINGOUTCOMELIST_ID,
				LEARNINGOUTCOMELISTCHILD_TITLE,LEARNINGOUTCOMELISTPARENT_ID);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGOUTCOMELIST_ID);
		
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