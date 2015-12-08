
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


public class Recognition extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	COMPETENTINSTITUTIONURI;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	CERTIFICATETEMPLATE_ID;
	public final static VirtualTableColumn<String>	CERTIFICATETEMPLATE_TITLE;
	
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
		
		COMPETENTINSTITUTIONURI = new VirtualTableColumn<String>("COMPETENTINSTITUTIONURI");
		COMPETENTINSTITUTIONURI.setType(DataType.VARCHAR,2147483647);
		COMPETENTINSTITUTIONURI.setDefaultValue(null);
		COMPETENTINSTITUTIONURI.setPreferredWidth(100);
		COMPETENTINSTITUTIONURI.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		CERTIFICATETEMPLATE_ID = new VirtualTableColumn<Integer>("CERTIFICATETEMPLATE_ID");
		CERTIFICATETEMPLATE_ID.setType(DataType.INTEGER);
		CERTIFICATETEMPLATE_ID.setDefaultValue(null);
		CERTIFICATETEMPLATE_ID.setVisible(false);
		CERTIFICATETEMPLATE_ID.setPreferredWidth(100);
		CERTIFICATETEMPLATE_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		CERTIFICATETEMPLATE_TITLE = new VirtualTableColumn<String>("CERTIFICATETEMPLATE_TITLE");
		CERTIFICATETEMPLATE_TITLE.setType(DataType.VARCHAR,2147483647);
		CERTIFICATETEMPLATE_TITLE.setDefaultValue(null);
		CERTIFICATETEMPLATE_TITLE.setCaption("TITLE");
		CERTIFICATETEMPLATE_TITLE.setPreferredWidth(100);
		CERTIFICATETEMPLATE_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		CERTIFICATETEMPLATE_TITLE.setPersistent(false);
		CERTIFICATETEMPLATE_TITLE.setTableColumnLink(new TableColumnLink(Certificatetemplate.class
				.getName(),Certificatetemplate.TITLE.getName(),new EntityRelationship(
				Certificatetemplate.class.getName(),new String[]{Certificatetemplate.ID.getName()},
				Cardinality.ONE,Recognition.class.getName(),
				new String[]{Recognition.CERTIFICATETEMPLATE_ID.getName()},Cardinality.MANY)));
	}
	
	
	public Recognition()
	{
		super(Recognition.class.getName(),"PUBLIC","RECOGNITION",ID,COMPETENTINSTITUTIONURI,
				DESCRIPTION,TITLE,URI,CERTIFICATETEMPLATE_ID,CERTIFICATETEMPLATE_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(COMPETENTINSTITUTIONURI);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_RECOGNITION_CERTIFICATETEMPLATE_ID_INDEX_9",IndexType.NORMAL,
				"CERTIFICATETEMPLATE_ID"));
	}
	
	public final static Recognition	VT	= new Recognition();
	
	
	public static Recognition getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}