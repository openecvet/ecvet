
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


public class MethodlistMethod extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	METHODLIST_ID;
	public final static VirtualTableColumn<String>	METHODLIST_TITLE;
	public final static VirtualTableColumn<Integer>	METHOD_ID;
	public final static VirtualTableColumn<String>	METHOD_TITLE;
	
	static
	{
		METHODLIST_ID = new VirtualTableColumn<Integer>("METHODLIST_ID");
		METHODLIST_ID.setType(DataType.INTEGER);
		METHODLIST_ID.setNullable(false);
		METHODLIST_ID.setDefaultValue(0);
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
		
		METHOD_ID = new VirtualTableColumn<Integer>("METHOD_ID");
		METHOD_ID.setType(DataType.INTEGER);
		METHOD_ID.setNullable(false);
		METHOD_ID.setDefaultValue(0);
		METHOD_ID.setVisible(false);
		METHOD_ID.setPreferredWidth(100);
		METHOD_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		METHOD_TITLE = new VirtualTableColumn<String>("METHOD_TITLE");
		METHOD_TITLE.setType(DataType.VARCHAR,2147483647);
		METHOD_TITLE.setDefaultValue(null);
		METHOD_TITLE.setCaption("TITLE");
		METHOD_TITLE.setPreferredWidth(100);
		METHOD_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		METHODLIST_TITLE.setPersistent(false);
		METHODLIST_TITLE.setTableColumnLink(new TableColumnLink(Methodlist.class.getName(),
				Methodlist.TITLE.getName(),new EntityRelationship(Methodlist.class.getName(),
						new String[]{Methodlist.ID.getName()},Cardinality.ONE,
						MethodlistMethod.class.getName(),
						new String[]{MethodlistMethod.METHODLIST_ID.getName()},Cardinality.MANY)));
		
		METHOD_TITLE.setPersistent(false);
		METHOD_TITLE.setTableColumnLink(new TableColumnLink(Method.class.getName(),Method.TITLE
				.getName(),new EntityRelationship(Method.class.getName(),new String[]{Method.ID
				.getName()},Cardinality.ONE,MethodlistMethod.class.getName(),
				new String[]{MethodlistMethod.METHOD_ID.getName()},Cardinality.MANY)));
	}
	
	
	public MethodlistMethod()
	{
		super(MethodlistMethod.class.getName(),"PUBLIC","METHODLIST_METHOD",METHODLIST_ID,
				METHODLIST_TITLE,METHOD_ID,METHOD_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(METHODLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"METHOD_ID","METHODLIST_ID"));
	}
	
	public final static MethodlistMethod	VT	= new MethodlistMethod();
	
	
	public static MethodlistMethod getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}