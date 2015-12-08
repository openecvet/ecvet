
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


public class Unit extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<Integer>	CREDIT;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<Integer>	RELATIVEWEIGHT;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	WEIGHTSUM;
	public final static VirtualTableColumn<Integer>	EVALUATIONS_ID;
	public final static VirtualTableColumn<String>	EVALUATIONS_TITLE;
	public final static VirtualTableColumn<Integer>	LEARNINGOUTCOMELIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGOUTCOMELIST_TITLE;
	public final static VirtualTableColumn<Integer>	REFERENCELEVELLIST_ID;
	public final static VirtualTableColumn<String>	REFERENCELEVELLIST_TITLE;
	public final static VirtualTableColumn<Integer>	UNITLIST_ID;
	public final static VirtualTableColumn<String>	UNITLIST_TITLE;
	
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
		
		CREDIT = new VirtualTableColumn<Integer>("CREDIT");
		CREDIT.setType(DataType.INTEGER);
		CREDIT.setDefaultValue(null);
		CREDIT.setPreferredWidth(100);
		CREDIT.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,false));
		
		DESCRIPTION = new VirtualTableColumn<String>("DESCRIPTION");
		DESCRIPTION.setType(DataType.VARCHAR,2147483647);
		DESCRIPTION.setDefaultValue(null);
		DESCRIPTION.setPreferredWidth(100);
		DESCRIPTION.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		WEIGHTSUM = new VirtualTableColumn<Integer>("WEIGHTSUM");
		WEIGHTSUM.setType(DataType.INTEGER);
		WEIGHTSUM.setDefaultValue(null);
		WEIGHTSUM.setPreferredWidth(100);
		WEIGHTSUM.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
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
		
		LEARNINGOUTCOMELIST_ID = new VirtualTableColumn<Integer>("LEARNINGOUTCOMELIST_ID");
		LEARNINGOUTCOMELIST_ID.setType(DataType.INTEGER);
		LEARNINGOUTCOMELIST_ID.setDefaultValue(null);
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
		
		UNITLIST_ID = new VirtualTableColumn<Integer>("UNITLIST_ID");
		UNITLIST_ID.setType(DataType.INTEGER);
		UNITLIST_ID.setDefaultValue(null);
		UNITLIST_ID.setVisible(false);
		UNITLIST_ID.setPreferredWidth(100);
		UNITLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		UNITLIST_TITLE = new VirtualTableColumn<String>("UNITLIST_TITLE");
		UNITLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		UNITLIST_TITLE.setDefaultValue(null);
		UNITLIST_TITLE.setCaption("TITLE");
		UNITLIST_TITLE.setPreferredWidth(100);
		UNITLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		EVALUATIONS_TITLE.setPersistent(false);
		EVALUATIONS_TITLE.setTableColumnLink(new TableColumnLink(Evaluations.class.getName(),
				Evaluations.TITLE.getName(),new EntityRelationship(Evaluations.class.getName(),
						new String[]{Evaluations.ID.getName()},Cardinality.ONE,
						Unit.class.getName(),new String[]{Unit.EVALUATIONS_ID.getName()},
						Cardinality.MANY)));
		
		LEARNINGOUTCOMELIST_TITLE.setPersistent(false);
		LEARNINGOUTCOMELIST_TITLE.setTableColumnLink(new TableColumnLink(Learningoutcomelist.class
				.getName(),Learningoutcomelist.TITLE.getName(),new EntityRelationship(
				Learningoutcomelist.class.getName(),new String[]{Learningoutcomelist.ID.getName()},
				Cardinality.ONE,Unit.class.getName(),new String[]{Unit.LEARNINGOUTCOMELIST_ID
						.getName()},Cardinality.MANY)));
		
		REFERENCELEVELLIST_TITLE.setPersistent(false);
		REFERENCELEVELLIST_TITLE.setTableColumnLink(new TableColumnLink(Referencelevellist.class
				.getName(),Referencelevellist.TITLE.getName(),new EntityRelationship(
				Referencelevellist.class.getName(),new String[]{Referencelevellist.ID.getName()},
				Cardinality.ONE,Unit.class.getName(),new String[]{Unit.REFERENCELEVELLIST_ID
						.getName()},Cardinality.MANY)));
		
		UNITLIST_TITLE.setPersistent(false);
		UNITLIST_TITLE.setTableColumnLink(new TableColumnLink(Unitlist.class.getName(),
				Unitlist.TITLE.getName(),new EntityRelationship(Unitlist.class.getName(),
						new String[]{Unitlist.ID.getName()},Cardinality.ONE,Unit.class.getName(),
						new String[]{Unit.UNITLIST_ID.getName()},Cardinality.MANY)));
	}
	
	
	public Unit()
	{
		super(Unit.class.getName(),"PUBLIC","UNIT",ID,CREDIT,DESCRIPTION,RELATIVEWEIGHT,TITLE,URI,
				WEIGHTSUM,EVALUATIONS_ID,EVALUATIONS_TITLE,LEARNINGOUTCOMELIST_ID,
				LEARNINGOUTCOMELIST_TITLE,REFERENCELEVELLIST_ID,REFERENCELEVELLIST_TITLE,
				UNITLIST_ID,UNITLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("FK_UNIT_REFERENCELEVELLIST_ID_INDEX_2",IndexType.NORMAL,
				"REFERENCELEVELLIST_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_UNIT_EVALUATIONS_ID_INDEX_2",IndexType.NORMAL,"EVALUATIONS_ID"));
		addIndex(new Index("FK_UNIT_UNITLIST_ID_INDEX_2",IndexType.NORMAL,"UNITLIST_ID"));
		addIndex(new Index("FK_UNIT_LEARNINGOUTCOMELIST_ID_INDEX_2",IndexType.NORMAL,
				"LEARNINGOUTCOMELIST_ID"));
	}
	
	public final static Unit	VT	= new Unit();
	
	
	public static Unit getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}