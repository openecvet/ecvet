
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


public class TranscriptsofrecordlistTranscriptsofrecord extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	TRANSCRIPTSOFRECORDLIST_ID;
	public final static VirtualTableColumn<Integer>	TRANSCRIPTSOFRECORD_ID;
	public final static VirtualTableColumn<String>	TRANSCRIPTSOFRECORD_TITLE;
	
	static
	{
		TRANSCRIPTSOFRECORDLIST_ID = new VirtualTableColumn<Integer>("TRANSCRIPTSOFRECORDLIST_ID");
		TRANSCRIPTSOFRECORDLIST_ID.setType(DataType.INTEGER);
		TRANSCRIPTSOFRECORDLIST_ID.setNullable(false);
		TRANSCRIPTSOFRECORDLIST_ID.setDefaultValue(0);
		TRANSCRIPTSOFRECORDLIST_ID.setVisible(false);
		TRANSCRIPTSOFRECORDLIST_ID.setPreferredWidth(100);
		TRANSCRIPTSOFRECORDLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		TRANSCRIPTSOFRECORD_ID = new VirtualTableColumn<Integer>("TRANSCRIPTSOFRECORD_ID");
		TRANSCRIPTSOFRECORD_ID.setType(DataType.INTEGER);
		TRANSCRIPTSOFRECORD_ID.setNullable(false);
		TRANSCRIPTSOFRECORD_ID.setDefaultValue(0);
		TRANSCRIPTSOFRECORD_ID.setVisible(false);
		TRANSCRIPTSOFRECORD_ID.setPreferredWidth(100);
		TRANSCRIPTSOFRECORD_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,
				0,0,false,false));
		
		TRANSCRIPTSOFRECORD_TITLE = new VirtualTableColumn<String>("TRANSCRIPTSOFRECORD_TITLE");
		TRANSCRIPTSOFRECORD_TITLE.setType(DataType.VARCHAR,2147483647);
		TRANSCRIPTSOFRECORD_TITLE.setDefaultValue(null);
		TRANSCRIPTSOFRECORD_TITLE.setCaption("TITLE");
		TRANSCRIPTSOFRECORD_TITLE.setPreferredWidth(100);
		TRANSCRIPTSOFRECORD_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		TRANSCRIPTSOFRECORD_TITLE.setPersistent(false);
		TRANSCRIPTSOFRECORD_TITLE.setTableColumnLink(new TableColumnLink(Transcriptsofrecord.class
				.getName(),Transcriptsofrecord.TITLE.getName(),new EntityRelationship(
				Transcriptsofrecord.class.getName(),new String[]{Transcriptsofrecord.ID.getName()},
				Cardinality.ONE,TranscriptsofrecordlistTranscriptsofrecord.class.getName(),
				new String[]{TranscriptsofrecordlistTranscriptsofrecord.TRANSCRIPTSOFRECORD_ID
						.getName()},Cardinality.MANY)));
	}
	
	
	public TranscriptsofrecordlistTranscriptsofrecord()
	{
		super(TranscriptsofrecordlistTranscriptsofrecord.class.getName(),"PUBLIC",
				"TRANSCRIPTSOFRECORDLIST_TRANSCRIPTSOFRECORD",TRANSCRIPTSOFRECORDLIST_ID,
				TRANSCRIPTSOFRECORD_ID,TRANSCRIPTSOFRECORD_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TRANSCRIPTSOFRECORDLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"TRANSCRIPTSOFRECORDLIST_ID",
				"TRANSCRIPTSOFRECORD_ID"));
	}
	
	public final static TranscriptsofrecordlistTranscriptsofrecord	VT	= new TranscriptsofrecordlistTranscriptsofrecord();
	
	
	public static TranscriptsofrecordlistTranscriptsofrecord getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}