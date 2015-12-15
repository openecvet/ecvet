
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


public class CredittransferlistCredittransfer extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	CREDITTRANSFERLIST_ID;
	public final static VirtualTableColumn<Integer>	CREDITTRANSFER_ID;
	public final static VirtualTableColumn<String>	CREDITTRANSFER_TITLE;
	
	static
	{
		CREDITTRANSFERLIST_ID = new VirtualTableColumn<Integer>("CREDITTRANSFERLIST_ID");
		CREDITTRANSFERLIST_ID.setType(DataType.INTEGER);
		CREDITTRANSFERLIST_ID.setNullable(false);
		CREDITTRANSFERLIST_ID.setDefaultValue(0);
		CREDITTRANSFERLIST_ID.setVisible(false);
		CREDITTRANSFERLIST_ID.setPreferredWidth(100);
		CREDITTRANSFERLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		CREDITTRANSFER_ID = new VirtualTableColumn<Integer>("CREDITTRANSFER_ID");
		CREDITTRANSFER_ID.setType(DataType.INTEGER);
		CREDITTRANSFER_ID.setNullable(false);
		CREDITTRANSFER_ID.setDefaultValue(0);
		CREDITTRANSFER_ID.setVisible(false);
		CREDITTRANSFER_ID.setPreferredWidth(100);
		CREDITTRANSFER_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		CREDITTRANSFER_TITLE = new VirtualTableColumn<String>("CREDITTRANSFER_TITLE");
		CREDITTRANSFER_TITLE.setType(DataType.VARCHAR,2147483647);
		CREDITTRANSFER_TITLE.setDefaultValue(null);
		CREDITTRANSFER_TITLE.setCaption("TITLE");
		CREDITTRANSFER_TITLE.setPreferredWidth(100);
		CREDITTRANSFER_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		CREDITTRANSFER_TITLE.setPersistent(false);
		CREDITTRANSFER_TITLE.setTableColumnLink(new TableColumnLink(Credittransfer.class.getName(),
				Credittransfer.TITLE.getName(),new EntityRelationship(Credittransfer.class
						.getName(),new String[]{Credittransfer.ID.getName()},Cardinality.ONE,
						CredittransferlistCredittransfer.class.getName(),
						new String[]{CredittransferlistCredittransfer.CREDITTRANSFER_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public CredittransferlistCredittransfer()
	{
		super(CredittransferlistCredittransfer.class.getName(),"PUBLIC",
				"CREDITTRANSFERLIST_CREDITTRANSFER",CREDITTRANSFERLIST_ID,CREDITTRANSFER_ID,
				CREDITTRANSFER_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(CREDITTRANSFERLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"CREDITTRANSFERLIST_ID",
				"CREDITTRANSFER_ID"));
	}
	
	public final static CredittransferlistCredittransfer	VT	= new CredittransferlistCredittransfer();
	
	
	public static CredittransferlistCredittransfer getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}