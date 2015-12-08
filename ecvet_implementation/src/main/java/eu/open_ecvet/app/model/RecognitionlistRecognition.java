
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


public class RecognitionlistRecognition extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	RECOGNITIONLIST_ID;
	public final static VirtualTableColumn<Integer>	RECOGNITION_ID;
	public final static VirtualTableColumn<String>	RECOGNITION_TITLE;
	
	static
	{
		RECOGNITIONLIST_ID = new VirtualTableColumn<Integer>("RECOGNITIONLIST_ID");
		RECOGNITIONLIST_ID.setType(DataType.INTEGER);
		RECOGNITIONLIST_ID.setNullable(false);
		RECOGNITIONLIST_ID.setDefaultValue(0);
		RECOGNITIONLIST_ID.setVisible(false);
		RECOGNITIONLIST_ID.setPreferredWidth(100);
		RECOGNITIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		RECOGNITION_ID = new VirtualTableColumn<Integer>("RECOGNITION_ID");
		RECOGNITION_ID.setType(DataType.INTEGER);
		RECOGNITION_ID.setNullable(false);
		RECOGNITION_ID.setDefaultValue(0);
		RECOGNITION_ID.setVisible(false);
		RECOGNITION_ID.setPreferredWidth(100);
		RECOGNITION_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		RECOGNITION_TITLE = new VirtualTableColumn<String>("RECOGNITION_TITLE");
		RECOGNITION_TITLE.setType(DataType.VARCHAR,2147483647);
		RECOGNITION_TITLE.setDefaultValue(null);
		RECOGNITION_TITLE.setCaption("TITLE");
		RECOGNITION_TITLE.setPreferredWidth(100);
		RECOGNITION_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		RECOGNITION_TITLE.setPersistent(false);
		RECOGNITION_TITLE.setTableColumnLink(new TableColumnLink(Recognition.class.getName(),
				Recognition.TITLE.getName(),new EntityRelationship(Recognition.class.getName(),
						new String[]{Recognition.ID.getName()},Cardinality.ONE,
						RecognitionlistRecognition.class.getName(),
						new String[]{RecognitionlistRecognition.RECOGNITION_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public RecognitionlistRecognition()
	{
		super(RecognitionlistRecognition.class.getName(),"PUBLIC","RECOGNITIONLIST_RECOGNITION",
				RECOGNITIONLIST_ID,RECOGNITION_ID,RECOGNITION_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(RECOGNITIONLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"RECOGNITIONLIST_ID",
				"RECOGNITION_ID"));
	}
	
	public final static RecognitionlistRecognition	VT	= new RecognitionlistRecognition();
	
	
	public static RecognitionlistRecognition getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}