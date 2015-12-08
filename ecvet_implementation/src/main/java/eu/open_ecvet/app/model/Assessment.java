
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


public class Assessment extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<Integer>	METHODLIST_ID;
	public final static VirtualTableColumn<String>	METHODLIST_TITLE;
	public final static VirtualTableColumn<Integer>	PROCESSLIST_ID;
	public final static VirtualTableColumn<String>	PROCESSLIST_TITLE;
	
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
		
		METHODLIST_ID = new VirtualTableColumn<Integer>("METHODLIST_ID");
		METHODLIST_ID.setType(DataType.INTEGER);
		METHODLIST_ID.setDefaultValue(null);
		METHODLIST_ID.setVisible(false);
		METHODLIST_ID.setPreferredWidth(100);
		METHODLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		METHODLIST_TITLE = new VirtualTableColumn<String>("METHODLIST_TITLE");
		METHODLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		METHODLIST_TITLE.setDefaultValue(null);
		METHODLIST_TITLE.setCaption("TITLE");
		METHODLIST_TITLE.setPreferredWidth(100);
		METHODLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PROCESSLIST_ID = new VirtualTableColumn<Integer>("PROCESSLIST_ID");
		PROCESSLIST_ID.setType(DataType.INTEGER);
		PROCESSLIST_ID.setDefaultValue(null);
		PROCESSLIST_ID.setVisible(false);
		PROCESSLIST_ID.setPreferredWidth(100);
		PROCESSLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		PROCESSLIST_TITLE = new VirtualTableColumn<String>("PROCESSLIST_TITLE");
		PROCESSLIST_TITLE.setType(DataType.VARCHAR,2147483647);
		PROCESSLIST_TITLE.setDefaultValue(null);
		PROCESSLIST_TITLE.setCaption("TITLE");
		PROCESSLIST_TITLE.setPreferredWidth(100);
		PROCESSLIST_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		METHODLIST_TITLE.setPersistent(false);
		METHODLIST_TITLE.setTableColumnLink(new TableColumnLink(Methodlist.class.getName(),
				Methodlist.TITLE.getName(),new EntityRelationship(Methodlist.class.getName(),
						new String[]{Methodlist.ID.getName()},Cardinality.ONE,Assessment.class
								.getName(),new String[]{Assessment.METHODLIST_ID.getName()},
						Cardinality.MANY)));
		
		PROCESSLIST_TITLE.setPersistent(false);
		PROCESSLIST_TITLE.setTableColumnLink(new TableColumnLink(Processlist.class.getName(),
				Processlist.TITLE.getName(),new EntityRelationship(Processlist.class.getName(),
						new String[]{Processlist.ID.getName()},Cardinality.ONE,Assessment.class
								.getName(),new String[]{Assessment.PROCESSLIST_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public Assessment()
	{
		super(Assessment.class.getName(),"PUBLIC","ASSESSMENT",ID,DESCRIPTION,TITLE,URI,
				METHODLIST_ID,METHODLIST_TITLE,PROCESSLIST_ID,PROCESSLIST_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
		addIndex(new Index("FK_ASSESSMENT_PROCESSLIST_ID_INDEX_9",IndexType.NORMAL,"PROCESSLIST_ID"));
		addIndex(new Index("FK_ASSESSMENT_METHODLIST_ID_INDEX_9",IndexType.NORMAL,"METHODLIST_ID"));
	}
	
	public final static Assessment	VT	= new Assessment();
	
	
	public static Assessment getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}