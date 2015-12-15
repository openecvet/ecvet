
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
	public final static VirtualTableColumn<Integer>	CREDITTRANSFERLIST_ID;
	public final static VirtualTableColumn<String>	CREDITTRANSFERLIST_TITLE;
	public final static VirtualTableColumn<Integer>	LEARNINGAGREEMENTLIST_ID;
	public final static VirtualTableColumn<String>	LEARNINGAGREEMENTLIST_TITLE;
	public final static VirtualTableColumn<Integer>	MEMORANDUMOFUNDERSTANDING_ID;
	public final static VirtualTableColumn<String>	MEMORANDUMOFUNDERSTANDING_TITLE;
	public final static VirtualTableColumn<Integer>	PROCEDUREANDGUIDELINELIST_ID;
	public final static VirtualTableColumn<String>	PROCEDUREANDGUIDELINELIST_TITLE;
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
		
		CREDITTRANSFERLIST_ID = new VirtualTableColumn<Integer>("CREDITTRANSFERLIST_ID");
		CREDITTRANSFERLIST_ID.setType(DataType.INTEGER);
		CREDITTRANSFERLIST_ID.setDefaultValue(null);
		CREDITTRANSFERLIST_ID.setVisible(false);
		CREDITTRANSFERLIST_ID.setPreferredWidth(100);
		CREDITTRANSFERLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		CREDITTRANSFERLIST_TITLE = new VirtualTableColumn<String>("CREDITTRANSFERLIST_TITLE");
		CREDITTRANSFERLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		CREDITTRANSFERLIST_TITLE.setDefaultValue(null);
		CREDITTRANSFERLIST_TITLE.setCaption("TITLE");
		CREDITTRANSFERLIST_TITLE.setPreferredWidth(100);
		CREDITTRANSFERLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		MEMORANDUMOFUNDERSTANDING_ID = new VirtualTableColumn<Integer>(
				"MEMORANDUMOFUNDERSTANDING_ID");
		MEMORANDUMOFUNDERSTANDING_ID.setType(DataType.INTEGER);
		MEMORANDUMOFUNDERSTANDING_ID.setDefaultValue(null);
		MEMORANDUMOFUNDERSTANDING_ID.setVisible(false);
		MEMORANDUMOFUNDERSTANDING_ID.setPreferredWidth(100);
		MEMORANDUMOFUNDERSTANDING_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		MEMORANDUMOFUNDERSTANDING_TITLE = new VirtualTableColumn<String>(
				"MEMORANDUMOFUNDERSTANDING_TITLE");
		MEMORANDUMOFUNDERSTANDING_TITLE.setType(DataType.VARCHAR,2147483647);
		MEMORANDUMOFUNDERSTANDING_TITLE.setDefaultValue(null);
		MEMORANDUMOFUNDERSTANDING_TITLE.setCaption("TITLE");
		MEMORANDUMOFUNDERSTANDING_TITLE.setPreferredWidth(100);
		MEMORANDUMOFUNDERSTANDING_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PROCEDUREANDGUIDELINELIST_ID = new VirtualTableColumn<Integer>(
				"PROCEDUREANDGUIDELINELIST_ID");
		PROCEDUREANDGUIDELINELIST_ID.setType(DataType.INTEGER);
		PROCEDUREANDGUIDELINELIST_ID.setDefaultValue(null);
		PROCEDUREANDGUIDELINELIST_ID.setVisible(false);
		PROCEDUREANDGUIDELINELIST_ID.setPreferredWidth(100);
		PROCEDUREANDGUIDELINELIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		PROCEDUREANDGUIDELINELIST_TITLE = new VirtualTableColumn<String>(
				"PROCEDUREANDGUIDELINELIST_TITLE");
		PROCEDUREANDGUIDELINELIST_TITLE.setType(DataType.VARCHAR,2147483647);
		PROCEDUREANDGUIDELINELIST_TITLE.setDefaultValue(null);
		PROCEDUREANDGUIDELINELIST_TITLE.setCaption("TITLE");
		PROCEDUREANDGUIDELINELIST_TITLE.setPreferredWidth(100);
		PROCEDUREANDGUIDELINELIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		CREDITTRANSFERLIST_TITLE.setPersistent(false);
		CREDITTRANSFERLIST_TITLE.setTableColumnLink(new TableColumnLink(Credittransferlist.class
				.getName(),Credittransferlist.TITLE.getName(),new EntityRelationship(
				Credittransferlist.class.getName(),new String[]{Credittransferlist.ID.getName()},
				Cardinality.ONE,Complementarydocuments.class.getName(),
				new String[]{Complementarydocuments.CREDITTRANSFERLIST_ID.getName()},
				Cardinality.MANY)));
		
		LEARNINGAGREEMENTLIST_TITLE.setPersistent(false);
		LEARNINGAGREEMENTLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Learningagreementlist.class.getName(),Learningagreementlist.TITLE.getName(),
				new EntityRelationship(Learningagreementlist.class.getName(),
						new String[]{Learningagreementlist.ID.getName()},Cardinality.ONE,
						Complementarydocuments.class.getName(),
						new String[]{Complementarydocuments.LEARNINGAGREEMENTLIST_ID.getName()},
						Cardinality.MANY)));
		
		MEMORANDUMOFUNDERSTANDING_TITLE.setPersistent(false);
		MEMORANDUMOFUNDERSTANDING_TITLE
				.setTableColumnLink(new TableColumnLink(Memorandumofunderstanding.class.getName(),
						Memorandumofunderstanding.TITLE.getName(),new EntityRelationship(
								Memorandumofunderstanding.class.getName(),
								new String[]{Memorandumofunderstanding.ID.getName()},
								Cardinality.ONE,Complementarydocuments.class.getName(),
								new String[]{Complementarydocuments.MEMORANDUMOFUNDERSTANDING_ID
										.getName()},Cardinality.MANY)));
		
		PROCEDUREANDGUIDELINELIST_TITLE.setPersistent(false);
		PROCEDUREANDGUIDELINELIST_TITLE
				.setTableColumnLink(new TableColumnLink(Procedureandguidelinelist.class.getName(),
						Procedureandguidelinelist.TITLE.getName(),new EntityRelationship(
								Procedureandguidelinelist.class.getName(),
								new String[]{Procedureandguidelinelist.ID.getName()},
								Cardinality.ONE,Complementarydocuments.class.getName(),
								new String[]{Complementarydocuments.PROCEDUREANDGUIDELINELIST_ID
										.getName()},Cardinality.MANY)));
		
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
				DESCRIPTION,TITLE,URI,CREDITTRANSFERLIST_ID,CREDITTRANSFERLIST_TITLE,
				LEARNINGAGREEMENTLIST_ID,LEARNINGAGREEMENTLIST_TITLE,MEMORANDUMOFUNDERSTANDING_ID,
				MEMORANDUMOFUNDERSTANDING_TITLE,PROCEDUREANDGUIDELINELIST_ID,
				PROCEDUREANDGUIDELINELIST_TITLE,TRANSCRIPTSOFRECORDLIST_ID,
				TRANSCRIPTSOFRECORDLIST_TITLE,USERGUIDELIST_ID,USERGUIDELIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("FK_COMPLEMENTARYDOCUMENTS_CREDITTRANSFERLIST_ID_INDEX_B",
				IndexType.NORMAL,"CREDITTRANSFERLIST_ID"));
		addIndex(new Index("FK_COMPLEMENTARYDOCUMENTS_USERGUIDELIST_ID_INDEX_B",IndexType.NORMAL,
				"USERGUIDELIST_ID"));
		addIndex(new Index("FK_COMPLEMENTARYDOCUMENTS_LEARNINGAGREEMENTLIST_ID_INDEX_B",
				IndexType.NORMAL,"LEARNINGAGREEMENTLIST_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("COMPLEMENTARYDOCUMENTSPROCEDUREANDGUIDELINELIST_ID_INDEX_B",
				IndexType.NORMAL,"PROCEDUREANDGUIDELINELIST_ID"));
		addIndex(new Index("COMPLEMENTARYDOCUMENTSMEMORANDUMOFUNDERSTANDING_ID_INDEX_B",
				IndexType.NORMAL,"MEMORANDUMOFUNDERSTANDING_ID"));
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