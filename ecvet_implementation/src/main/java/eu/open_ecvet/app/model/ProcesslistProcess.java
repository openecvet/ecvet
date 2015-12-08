
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


public class ProcesslistProcess extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	PROCESSLIST_ID;
	public final static VirtualTableColumn<Integer>	PROCESS_ID;
	public final static VirtualTableColumn<String>	PROCESS_TITLE;
	
	static
	{
		PROCESSLIST_ID = new VirtualTableColumn<Integer>("PROCESSLIST_ID");
		PROCESSLIST_ID.setType(DataType.INTEGER);
		PROCESSLIST_ID.setNullable(false);
		PROCESSLIST_ID.setDefaultValue(0);
		PROCESSLIST_ID.setVisible(false);
		PROCESSLIST_ID.setPreferredWidth(100);
		PROCESSLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		PROCESS_ID = new VirtualTableColumn<Integer>("PROCESS_ID");
		PROCESS_ID.setType(DataType.INTEGER);
		PROCESS_ID.setNullable(false);
		PROCESS_ID.setDefaultValue(0);
		PROCESS_ID.setVisible(false);
		PROCESS_ID.setPreferredWidth(100);
		PROCESS_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		PROCESS_TITLE = new VirtualTableColumn<String>("PROCESS_TITLE");
		PROCESS_TITLE.setType(DataType.VARCHAR,2147483647);
		PROCESS_TITLE.setDefaultValue(null);
		PROCESS_TITLE.setCaption("TITLE");
		PROCESS_TITLE.setPreferredWidth(100);
		PROCESS_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PROCESS_TITLE.setPersistent(false);
		PROCESS_TITLE.setTableColumnLink(new TableColumnLink(Process.class.getName(),Process.TITLE
				.getName(),new EntityRelationship(Process.class.getName(),new String[]{Process.ID
				.getName()},Cardinality.ONE,ProcesslistProcess.class.getName(),
				new String[]{ProcesslistProcess.PROCESS_ID.getName()},Cardinality.MANY)));
	}
	
	
	public ProcesslistProcess()
	{
		super(ProcesslistProcess.class.getName(),"PUBLIC","PROCESSLIST_PROCESS",PROCESSLIST_ID,
				PROCESS_ID,PROCESS_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(PROCESSLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"PROCESSLIST_ID","PROCESS_ID"));
	}
	
	public final static ProcesslistProcess	VT	= new ProcesslistProcess();
	
	
	public static ProcesslistProcess getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}