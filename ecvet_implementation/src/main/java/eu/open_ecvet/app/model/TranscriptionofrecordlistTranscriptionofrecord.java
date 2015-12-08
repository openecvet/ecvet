
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


public class TranscriptionofrecordlistTranscriptionofrecord extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	TRANSCRIPTIONOFRECORDLIST_ID;
	public final static VirtualTableColumn<Integer>	TRANSCRIPTIONOFRECORD_ID;
	public final static VirtualTableColumn<String>	TRANSCRIPTIONOFRECORD_TITLE;
	
	static
	{
		TRANSCRIPTIONOFRECORDLIST_ID = new VirtualTableColumn<Integer>(
				"TRANSCRIPTIONOFRECORDLIST_ID");
		TRANSCRIPTIONOFRECORDLIST_ID.setType(DataType.INTEGER);
		TRANSCRIPTIONOFRECORDLIST_ID.setNullable(false);
		TRANSCRIPTIONOFRECORDLIST_ID.setDefaultValue(0);
		TRANSCRIPTIONOFRECORDLIST_ID.setVisible(false);
		TRANSCRIPTIONOFRECORDLIST_ID.setPreferredWidth(100);
		TRANSCRIPTIONOFRECORDLIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		TRANSCRIPTIONOFRECORD_ID = new VirtualTableColumn<Integer>("TRANSCRIPTIONOFRECORD_ID");
		TRANSCRIPTIONOFRECORD_ID.setType(DataType.INTEGER);
		TRANSCRIPTIONOFRECORD_ID.setNullable(false);
		TRANSCRIPTIONOFRECORD_ID.setDefaultValue(0);
		TRANSCRIPTIONOFRECORD_ID.setVisible(false);
		TRANSCRIPTIONOFRECORD_ID.setPreferredWidth(100);
		TRANSCRIPTIONOFRECORD_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		TRANSCRIPTIONOFRECORD_TITLE = new VirtualTableColumn<String>("TRANSCRIPTIONOFRECORD_TITLE");
		TRANSCRIPTIONOFRECORD_TITLE.setType(DataType.VARCHAR,2147483647);
		TRANSCRIPTIONOFRECORD_TITLE.setDefaultValue(null);
		TRANSCRIPTIONOFRECORD_TITLE.setCaption("TITLE");
		TRANSCRIPTIONOFRECORD_TITLE.setPreferredWidth(100);
		TRANSCRIPTIONOFRECORD_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		TRANSCRIPTIONOFRECORD_TITLE.setPersistent(false);
		TRANSCRIPTIONOFRECORD_TITLE
				.setTableColumnLink(new TableColumnLink(
						Transcriptionofrecord.class.getName(),
						Transcriptionofrecord.TITLE.getName(),
						new EntityRelationship(
								Transcriptionofrecord.class.getName(),
								new String[]{Transcriptionofrecord.ID.getName()},
								Cardinality.ONE,
								TranscriptionofrecordlistTranscriptionofrecord.class.getName(),
								new String[]{TranscriptionofrecordlistTranscriptionofrecord.TRANSCRIPTIONOFRECORD_ID
										.getName()},Cardinality.MANY)));
	}
	
	
	public TranscriptionofrecordlistTranscriptionofrecord()
	{
		super(TranscriptionofrecordlistTranscriptionofrecord.class.getName(),"PUBLIC",
				"TRANSCRIPTIONOFRECORDLIST_TRANSCRIPTIONOFRECORD",TRANSCRIPTIONOFRECORDLIST_ID,
				TRANSCRIPTIONOFRECORD_ID,TRANSCRIPTIONOFRECORD_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TRANSCRIPTIONOFRECORDLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"TRANSCRIPTIONOFRECORD_ID",
				"TRANSCRIPTIONOFRECORDLIST_ID"));
	}
	
	public final static TranscriptionofrecordlistTranscriptionofrecord	VT	= new TranscriptionofrecordlistTranscriptionofrecord();
	
	
	public static TranscriptionofrecordlistTranscriptionofrecord getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}