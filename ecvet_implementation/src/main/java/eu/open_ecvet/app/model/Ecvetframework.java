
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


public class Ecvetframework extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	COMPETENTINSTITUTIONLIST_ID;
	public final static VirtualTableColumn<String>	COMPETENTINSTITUTIONLIST_TITLE;
	public final static VirtualTableColumn<Integer>	COMPLEMENTARYDOCUMENTS_ID;
	public final static VirtualTableColumn<String>	COMPLEMENTARYDOCUMENTS_TITLE;
	public final static VirtualTableColumn<Integer>	QUALIFICATION_ID;
	public final static VirtualTableColumn<String>	QUALIFICATION_TITLE;
	
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
		
		COMPETENTINSTITUTIONLIST_ID = new VirtualTableColumn<Integer>("COMPETENTINSTITUTIONLIST_ID");
		COMPETENTINSTITUTIONLIST_ID.setType(DataType.INTEGER);
		COMPETENTINSTITUTIONLIST_ID.setDefaultValue(null);
		COMPETENTINSTITUTIONLIST_ID.setVisible(false);
		COMPETENTINSTITUTIONLIST_ID.setPreferredWidth(100);
		COMPETENTINSTITUTIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		COMPETENTINSTITUTIONLIST_TITLE = new VirtualTableColumn<String>(
				"COMPETENTINSTITUTIONLIST_TITLE");
		COMPETENTINSTITUTIONLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		COMPETENTINSTITUTIONLIST_TITLE.setDefaultValue(null);
		COMPETENTINSTITUTIONLIST_TITLE.setCaption("TITLE");
		COMPETENTINSTITUTIONLIST_TITLE.setPreferredWidth(100);
		COMPETENTINSTITUTIONLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		COMPLEMENTARYDOCUMENTS_ID = new VirtualTableColumn<Integer>("COMPLEMENTARYDOCUMENTS_ID");
		COMPLEMENTARYDOCUMENTS_ID.setType(DataType.INTEGER);
		COMPLEMENTARYDOCUMENTS_ID.setDefaultValue(null);
		COMPLEMENTARYDOCUMENTS_ID.setVisible(false);
		COMPLEMENTARYDOCUMENTS_ID.setPreferredWidth(100);
		COMPLEMENTARYDOCUMENTS_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		COMPLEMENTARYDOCUMENTS_TITLE = new VirtualTableColumn<String>(
				"COMPLEMENTARYDOCUMENTS_TITLE");
		COMPLEMENTARYDOCUMENTS_TITLE.setType(DataType.VARCHAR,2147483647);
		COMPLEMENTARYDOCUMENTS_TITLE.setDefaultValue(null);
		COMPLEMENTARYDOCUMENTS_TITLE.setCaption("TITLE");
		COMPLEMENTARYDOCUMENTS_TITLE.setPreferredWidth(100);
		COMPLEMENTARYDOCUMENTS_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		QUALIFICATION_ID = new VirtualTableColumn<Integer>("QUALIFICATION_ID");
		QUALIFICATION_ID.setType(DataType.INTEGER);
		QUALIFICATION_ID.setDefaultValue(null);
		QUALIFICATION_ID.setVisible(false);
		QUALIFICATION_ID.setPreferredWidth(100);
		QUALIFICATION_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		QUALIFICATION_TITLE = new VirtualTableColumn<String>("QUALIFICATION_TITLE");
		QUALIFICATION_TITLE.setType(DataType.VARCHAR,2147483647);
		QUALIFICATION_TITLE.setDefaultValue(null);
		QUALIFICATION_TITLE.setCaption("TITLE");
		QUALIFICATION_TITLE.setPreferredWidth(100);
		QUALIFICATION_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		COMPETENTINSTITUTIONLIST_TITLE.setPersistent(false);
		COMPETENTINSTITUTIONLIST_TITLE.setTableColumnLink(new TableColumnLink(
				Competentinstitutionlist.class.getName(),Competentinstitutionlist.TITLE.getName(),
				new EntityRelationship(Competentinstitutionlist.class.getName(),
						new String[]{Competentinstitutionlist.ID.getName()},Cardinality.ONE,
						Ecvetframework.class.getName(),
						new String[]{Ecvetframework.COMPETENTINSTITUTIONLIST_ID.getName()},
						Cardinality.MANY)));
		
		COMPLEMENTARYDOCUMENTS_TITLE.setPersistent(false);
		COMPLEMENTARYDOCUMENTS_TITLE.setTableColumnLink(new TableColumnLink(
				Complementarydocuments.class.getName(),Complementarydocuments.TITLE.getName(),
				new EntityRelationship(Complementarydocuments.class.getName(),
						new String[]{Complementarydocuments.ID.getName()},Cardinality.ONE,
						Ecvetframework.class.getName(),
						new String[]{Ecvetframework.COMPLEMENTARYDOCUMENTS_ID.getName()},
						Cardinality.MANY)));
		
		QUALIFICATION_TITLE.setPersistent(false);
		QUALIFICATION_TITLE.setTableColumnLink(new TableColumnLink(Qualification.class.getName(),
				Qualification.TITLE.getName(),new EntityRelationship(Qualification.class.getName(),
						new String[]{Qualification.ID.getName()},Cardinality.ONE,
						Ecvetframework.class.getName(),new String[]{Ecvetframework.QUALIFICATION_ID
								.getName()},Cardinality.MANY)));
	}
	
	
	public Ecvetframework()
	{
		super(Ecvetframework.class.getName(),"PUBLIC","ECVETFRAMEWORK",ID,DESCRIPTION,TITLE,URI,
				COMPETENTINSTITUTIONLIST_ID,COMPETENTINSTITUTIONLIST_TITLE,
				COMPLEMENTARYDOCUMENTS_ID,COMPLEMENTARYDOCUMENTS_TITLE,QUALIFICATION_ID,
				QUALIFICATION_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(ID);
		
		addIndex(new Index("FK_ECVETFRAMEWORK_QUALIFICATION_ID_INDEX_F",IndexType.NORMAL,
				"QUALIFICATION_ID"));
		addIndex(new Index("FK_ECVETFRAMEWORK_COMPLEMENTARYDOCUMENTS_ID_INDEX_F",IndexType.NORMAL,
				"COMPLEMENTARYDOCUMENTS_ID"));
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_ECVETFRAMEWORK_COMPETENTINSTITUTIONLIST_ID_INDEX_F",
				IndexType.NORMAL,"COMPETENTINSTITUTIONLIST_ID"));
	}
	
	public final static Ecvetframework	VT	= new Ecvetframework();
	
	
	public static Ecvetframework getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}