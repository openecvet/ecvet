
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


public class ProcedureandguidelinelistProcedureandguideline extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	PROCEDUREANDGUIDELINELIST_ID;
	public final static VirtualTableColumn<Integer>	PROCEDUREANDGUIDELINE_ID;
	public final static VirtualTableColumn<String>	PROCEDUREANDGUIDELINE_TITLE;
	
	static
	{
		PROCEDUREANDGUIDELINELIST_ID = new VirtualTableColumn<Integer>(
				"PROCEDUREANDGUIDELINELIST_ID");
		PROCEDUREANDGUIDELINELIST_ID.setType(DataType.INTEGER);
		PROCEDUREANDGUIDELINELIST_ID.setNullable(false);
		PROCEDUREANDGUIDELINELIST_ID.setDefaultValue(0);
		PROCEDUREANDGUIDELINELIST_ID.setVisible(false);
		PROCEDUREANDGUIDELINELIST_ID.setPreferredWidth(100);
		PROCEDUREANDGUIDELINELIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		PROCEDUREANDGUIDELINE_ID = new VirtualTableColumn<Integer>("PROCEDUREANDGUIDELINE_ID");
		PROCEDUREANDGUIDELINE_ID.setType(DataType.INTEGER);
		PROCEDUREANDGUIDELINE_ID.setNullable(false);
		PROCEDUREANDGUIDELINE_ID.setDefaultValue(0);
		PROCEDUREANDGUIDELINE_ID.setVisible(false);
		PROCEDUREANDGUIDELINE_ID.setPreferredWidth(100);
		PROCEDUREANDGUIDELINE_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		PROCEDUREANDGUIDELINE_TITLE = new VirtualTableColumn<String>("PROCEDUREANDGUIDELINE_TITLE");
		PROCEDUREANDGUIDELINE_TITLE.setType(DataType.VARCHAR,2147483647);
		PROCEDUREANDGUIDELINE_TITLE.setDefaultValue(null);
		PROCEDUREANDGUIDELINE_TITLE.setCaption("TITLE");
		PROCEDUREANDGUIDELINE_TITLE.setPreferredWidth(100);
		PROCEDUREANDGUIDELINE_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		PROCEDUREANDGUIDELINE_TITLE.setPersistent(false);
		PROCEDUREANDGUIDELINE_TITLE
				.setTableColumnLink(new TableColumnLink(
						Procedureandguideline.class.getName(),
						Procedureandguideline.TITLE.getName(),
						new EntityRelationship(
								Procedureandguideline.class.getName(),
								new String[]{Procedureandguideline.ID.getName()},
								Cardinality.ONE,
								ProcedureandguidelinelistProcedureandguideline.class.getName(),
								new String[]{ProcedureandguidelinelistProcedureandguideline.PROCEDUREANDGUIDELINE_ID
										.getName()},Cardinality.MANY)));
	}
	
	
	public ProcedureandguidelinelistProcedureandguideline()
	{
		super(ProcedureandguidelinelistProcedureandguideline.class.getName(),"PUBLIC",
				"PROCEDUREANDGUIDELINELIST_PROCEDUREANDGUIDELINE",PROCEDUREANDGUIDELINELIST_ID,
				PROCEDUREANDGUIDELINE_ID,PROCEDUREANDGUIDELINE_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(PROCEDUREANDGUIDELINELIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"PROCEDUREANDGUIDELINELIST_ID",
				"PROCEDUREANDGUIDELINE_ID"));
	}
	
	public final static ProcedureandguidelinelistProcedureandguideline	VT	= new ProcedureandguidelinelistProcedureandguideline();
	
	
	public static ProcedureandguidelinelistProcedureandguideline getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}