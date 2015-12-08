
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


public class LearningoutcometermlistLearningoutcometerm extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMETERMLIST_ID;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMETERM_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMETERM_TITLE;
	
	static
	{
		LEARNINGOUTCOMETERMLIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMETERMLIST_ID");
		LEARNINGOUTCOMETERMLIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMETERMLIST_ID.setNullable(false);
		LEARNINGOUTCOMETERMLIST_ID.setDefaultValue(0);
		LEARNINGOUTCOMETERMLIST_ID.setVisible(false);
		LEARNINGOUTCOMETERMLIST_ID.setPreferredWidth(100);
		LEARNINGOUTCOMETERMLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		LEARNINGOUTCOMETERM_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMETERM_ID");
		LEARNINGOUTCOMETERM_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMETERM_ID.setNullable(false);
		LEARNINGOUTCOMETERM_ID.setDefaultValue(0);
		LEARNINGOUTCOMETERM_ID.setVisible(false);
		LEARNINGOUTCOMETERM_ID.setPreferredWidth(100);
		LEARNINGOUTCOMETERM_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		LEARNINGOUTCOMETERM_TITLE = new VirtualTableColumn<String>("LEARNINGOUTCOMETERM_TITLE");
		LEARNINGOUTCOMETERM_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGOUTCOMETERM_TITLE.setDefaultValue(null);
		LEARNINGOUTCOMETERM_TITLE.setCaption("TITLE");
		LEARNINGOUTCOMETERM_TITLE.setPreferredWidth(100);
		LEARNINGOUTCOMETERM_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGOUTCOMETERM_TITLE.setPersistent(false);
		LEARNINGOUTCOMETERM_TITLE.setTableColumnLink(new TableColumnLink(Learningoutcometerm.class
				.getName(),Learningoutcometerm.TITLE.getName(),new EntityRelationship(
				Learningoutcometerm.class.getName(),new String[]{Learningoutcometerm.ID.getName()},
				Cardinality.ONE,LearningoutcometermlistLearningoutcometerm.class.getName(),
				new String[]{LearningoutcometermlistLearningoutcometerm.LEARNINGOUTCOMETERM_ID
						.getName()},Cardinality.MANY)));
	}
	
	
	public LearningoutcometermlistLearningoutcometerm()
	{
		super(LearningoutcometermlistLearningoutcometerm.class.getName(),"PUBLIC",
				"LEARNINGOUTCOMETERMLIST_LEARNINGOUTCOMETERM",LEARNINGOUTCOMETERMLIST_ID,
				LEARNINGOUTCOMETERM_ID,LEARNINGOUTCOMETERM_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(LEARNINGOUTCOMETERMLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"LEARNINGOUTCOMETERM_ID",
				"LEARNINGOUTCOMETERMLIST_ID"));
	}
	
	public final static LearningoutcometermlistLearningoutcometerm	VT	= new LearningoutcometermlistLearningoutcometerm();
	
	
	public static LearningoutcometermlistLearningoutcometerm getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}