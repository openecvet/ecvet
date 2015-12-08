
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


public class PartnerlistPartner extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	PARTNERLIST_ID;
	public final static VirtualTableColumn<Integer>	PARTNER_ID;
	public final static VirtualTableColumn<String>	PARTNER_TITLE;
	
	static
	{
		PARTNERLIST_ID = new VirtualTableColumn<Integer>("PARTNERLIST_ID");
		PARTNERLIST_ID.setType(DataType.INTEGER);
		PARTNERLIST_ID.setNullable(false);
		PARTNERLIST_ID.setDefaultValue(0);
		PARTNERLIST_ID.setVisible(false);
		PARTNERLIST_ID.setPreferredWidth(100);
		PARTNERLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		PARTNER_ID = new VirtualTableColumn<Integer>("PARTNER_ID");
		PARTNER_ID.setType(DataType.INTEGER);
		PARTNER_ID.setNullable(false);
		PARTNER_ID.setDefaultValue(0);
		PARTNER_ID.setVisible(false);
		PARTNER_ID.setPreferredWidth(100);
		PARTNER_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		PARTNER_TITLE = new VirtualTableColumn<String>("PARTNER_TITLE");
		PARTNER_TITLE.setType(DataType.VARCHAR,2147483647);
		PARTNER_TITLE.setDefaultValue(null);
		PARTNER_TITLE.setCaption("TITLE");
		PARTNER_TITLE.setPreferredWidth(100);
		PARTNER_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PARTNER_TITLE.setPersistent(false);
		PARTNER_TITLE.setTableColumnLink(new TableColumnLink(Partner.class.getName(),Partner.TITLE
				.getName(),new EntityRelationship(Partner.class.getName(),new String[]{Partner.ID
				.getName()},Cardinality.ONE,PartnerlistPartner.class.getName(),
				new String[]{PartnerlistPartner.PARTNER_ID.getName()},Cardinality.MANY)));
	}
	
	
	public PartnerlistPartner()
	{
		super(PartnerlistPartner.class.getName(),"PUBLIC","PARTNERLIST_PARTNER",PARTNERLIST_ID,
				PARTNER_ID,PARTNER_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(PARTNERLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"PARTNERLIST_ID","PARTNER_ID"));
	}
	
	public final static PartnerlistPartner	VT	= new PartnerlistPartner();
	
	
	public static PartnerlistPartner getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}