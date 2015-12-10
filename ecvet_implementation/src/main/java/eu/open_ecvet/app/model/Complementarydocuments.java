
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


public class Complementarydocuments extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	LEARNINGAGREEMENTLIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGAGREEMENTLIST_TITLE;
	public final static VirtualTableColumn<Integer>	TRANSCRIPTSOFRECORDLIST_ID;
	public final static VirtualTableColumn<String>	TRANSCRIPTSOFRECORDLIST_TITLE;
	public final static VirtualTableColumn<Integer>	USERGUIDELIST_ID;
	public final static VirtualTableColumn<String>	USERGUIDELIST_TITLE;
	
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
		
		LEARNINGAGREEMENTLIST_ID = new VirtualTableColumn<Integer>("LEARNINGAGREEMENTLIST_ID");
		LEARNINGAGREEMENTLIST_ID.setType(DataType.INTEGER);
		LEARNINGAGREEMENTLIST_ID.setDefaultValue(null);
		LEARNINGAGREEMENTLIST_ID.setVisible(false);
		LEARNINGAGREEMENTLIST_ID.setPreferredWidth(100);
		LEARNINGAGREEMENTLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		LEARNINGAGREEMENTLIST_TITLE = new VirtualTableColumn<String>("LEARNINGAGREEMENTLIST_TITLE");
		LEARNINGAGREEMENTLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		LEARNINGAGREEMENTLIST_TITLE.setDefaultValue(null);
		LEARNINGAGREEMENTLIST_TITLE.setCaption("TITLE");
		LEARNINGAGREEMENTLIST_TITLE.setPreferredWidth(100);
		LEARNINGAGREEMENTLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		TRANSCRIPTSOFRECORDLIST_ID = new VirtualTableColumn<Integer>("TRANSCRIPTSOFRECORDLIST_ID");
		TRANSCRIPTSOFRECORDLIST_ID.setType(DataType.INTEGER);
		TRANSCRIPTSOFRECORDLIST_ID.setDefaultValue(null);
		TRANSCRIPTSOFRECORDLIST_ID.setVisible(false);
		TRANSCRIPTSOFRECORDLIST_ID.setPreferredWidth(100);
		TRANSCRIPTSOFRECORDLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		TRANSCRIPTSOFRECORDLIST_TITLE = new VirtualTableColumn<String>(
				"TRANSCRIPTSOFRECORDLIST_TITLE");
		TRANSCRIPTSOFRECORDLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		TRANSCRIPTSOFRECORDLIST_TITLE.setDefaultValue(null);
		TRANSCRIPTSOFRECORDLIST_TITLE.setCaption("TITLE");
		TRANSCRIPTSOFRECORDLIST_TITLE.setPreferredWidth(100);
		TRANSCRIPTSOFRECORDLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		USERGUIDELIST_ID = new VirtualTableColumn<Integer>("USERGUIDELIST_ID");
		USERGUIDELIST_ID.setType(DataType.INTEGER);
		USERGUIDELIST_ID.setDefaultValue(null);
		USERGUIDELIST_ID.setVisible(false);
		USERGUIDELIST_ID.setPreferredWidth(100);
		USERGUIDELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		USERGUIDELIST_TITLE = new VirtualTableColumn<String>("USERGUIDELIST_TITLE");
		USERGUIDELIST_TITLE.setType(DataType.VARCHAR,2147483647);
		USERGUIDELIST_TITLE.setDefaultValue(null);
		USERGUIDELIST_TITLE.setCaption("TITLE");
		USERGUIDELIST_TITLE.setPreferredWidth(100);
		USERGUIDELIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		LEARNINGAGREEMENTLIST_TITLE.setPersistent(false);
		LEARNINGAGREEMENTLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Learningagreementlist.class.getName(),Learningagreementlist.TITLE.getName(),
				new EntityRelationship(Learningagreementlist.class.getName(),
						new String[]{Learningagreementlist.ID.getName()},Cardinality.ONE,
						Complementarydocuments.class.getName(),
						new String[]{Complementarydocuments.LEARNINGAGREEMENTLIST_ID.getName()},
						Cardinality.MANY)));
		
		TRANSCRIPTSOFRECORDLIST_TITLE.setPersistent(false);
		TRANSCRIPTSOFRECORDLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Transcriptsofrecordlist.class.getName(),Transcriptsofrecordlist.TITLE.getName(),
				new EntityRelationship(Transcriptsofrecordlist.class.getName(),
						new String[]{Transcriptsofrecordlist.ID.getName()},Cardinality.ONE,
						Complementarydocuments.class.getName(),
						new String[]{Complementarydocuments.TRANSCRIPTSOFRECORDLIST_ID.getName()},
						Cardinality.MANY)));
		
		USERGUIDELIST_TITLE.setPersistent(false);
		USERGUIDELIST_TITLE.setTableColumnLink(new TableColumnLink(Userguidelist.class.getName(),
				Userguidelist.TITLE.getName(),new EntityRelationship(Userguidelist.class.getName(),
						new String[]{Userguidelist.ID.getName()},Cardinality.ONE,
						Complementarydocuments.class.getName(),
						new String[]{Complementarydocuments.USERGUIDELIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Complementarydocuments()
	{
		super(Complementarydocuments.class.getName(),"PUBLIC","COMPLEMENTARYDOCUMENTS",ID,
				DESCRIPTION,TITLE,URI,LEARNINGAGREEMENTLIST_ID,LEARNINGAGREEMENTLIST_TITLE,
				TRANSCRIPTSOFRECORDLIST_ID,TRANSCRIPTSOFRECORDLIST_TITLE,USERGUIDELIST_ID,
				USERGUIDELIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("FK_COMPLEMENTARYDOCUMENTS_USERGUIDELIST_ID_INDEX_B",IndexType.NORMAL,
				"USERGUIDELIST_ID"));
		addIndex(new Index("FK_COMPLEMENTARYDOCUMENTS_LEARNINGAGREEMENTLIST_ID_INDEX_B",
				IndexType.NORMAL,"LEARNINGAGREEMENTLIST_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("COMPLEMENTARYDOCUMENTS_TRANSCRIPTSOFRECORDLIST_ID_INDEX_B",
				IndexType.NORMAL,"TRANSCRIPTSOFRECORDLIST_ID"));
	}
	
	public final static Complementarydocuments	VT	= new Complementarydocuments();
	
	
	public static Complementarydocuments getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}