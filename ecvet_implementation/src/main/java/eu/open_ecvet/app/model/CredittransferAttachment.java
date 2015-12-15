
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


public class CredittransferAttachment extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ATTACHMENTS_ID;
	public final static VirtualTableColumn<Integer>	ATTACHMENT_ID;
	public final static VirtualTableColumn<String>	ATTACHMENT_TITLE;
	
	static
	{
		ATTACHMENTS_ID = new VirtualTableColumn<Integer>("ATTACHMENTS_ID");
		ATTACHMENTS_ID.setType(DataType.INTEGER);
		ATTACHMENTS_ID.setNullable(false);
		ATTACHMENTS_ID.setDefaultValue(0);
		ATTACHMENTS_ID.setVisible(false);
		ATTACHMENTS_ID.setPreferredWidth(100);
		ATTACHMENTS_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		ATTACHMENT_ID = new VirtualTableColumn<Integer>("ATTACHMENT_ID");
		ATTACHMENT_ID.setType(DataType.INTEGER);
		ATTACHMENT_ID.setNullable(false);
		ATTACHMENT_ID.setDefaultValue(0);
		ATTACHMENT_ID.setVisible(false);
		ATTACHMENT_ID.setPreferredWidth(100);
		ATTACHMENT_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		ATTACHMENT_TITLE = new VirtualTableColumn<String>("ATTACHMENT_TITLE");
		ATTACHMENT_TITLE.setType(DataType.VARCHAR,2147483647);
		ATTACHMENT_TITLE.setDefaultValue(null);
		ATTACHMENT_TITLE.setCaption("TITLE");
		ATTACHMENT_TITLE.setPreferredWidth(100);
		ATTACHMENT_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		ATTACHMENT_TITLE.setPersistent(false);
		ATTACHMENT_TITLE.setTableColumnLink(new TableColumnLink(Attachment.class.getName(),
				Attachment.TITLE.getName(),new EntityRelationship(Attachment.class.getName(),
						new String[]{Attachment.ID.getName()},Cardinality.ONE,
						CredittransferAttachment.class.getName(),
						new String[]{CredittransferAttachment.ATTACHMENT_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public CredittransferAttachment()
	{
		super(CredittransferAttachment.class.getName(),"PUBLIC","CREDITTRANSFER_ATTACHMENT",
				ATTACHMENTS_ID,ATTACHMENT_ID,ATTACHMENT_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(ATTACHMENTS_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ATTACHMENTS_ID","ATTACHMENT_ID"));
	}
	
	public final static CredittransferAttachment	VT	= new CredittransferAttachment();
	
	
	public static CredittransferAttachment getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}