
package eu.open_ecvet.app.model;


import xdev.db.DataType;
import xdev.db.Index;
import xdev.db.Index.IndexType;
import xdev.lang.StaticInstanceSupport;
import xdev.ui.text.TextFormat;
import xdev.vt.VirtualTable;
import xdev.vt.VirtualTableColumn;

import java.util.Locale;

import eu.open_ecvet.app.data_src.EcvetH2;


public class Procedureandguideline extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	ASSESSMENT;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	RECOGNITION;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	public final static VirtualTableColumn<String>	VALIDATION;
	
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
		
		ASSESSMENT = new VirtualTableColumn<String>("ASSESSMENT");
		ASSESSMENT.setType(DataType.VARCHAR,2147483647);
		ASSESSMENT.setDefaultValue(null);
		ASSESSMENT.setPreferredWidth(100);
		ASSESSMENT.setTextFormat(TextFormat.getPlainInstance());
		
		DESCRIPTION = new VirtualTableColumn<String>("DESCRIPTION");
		DESCRIPTION.setType(DataType.VARCHAR,2147483647);
		DESCRIPTION.setDefaultValue(null);
		DESCRIPTION.setPreferredWidth(100);
		DESCRIPTION.setTextFormat(TextFormat.getPlainInstance());
		
		RECOGNITION = new VirtualTableColumn<String>("RECOGNITION");
		RECOGNITION.setType(DataType.VARCHAR,2147483647);
		RECOGNITION.setDefaultValue(null);
		RECOGNITION.setPreferredWidth(100);
		RECOGNITION.setTextFormat(TextFormat.getPlainInstance());
		
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
		
		VALIDATION = new VirtualTableColumn<String>("VALIDATION");
		VALIDATION.setType(DataType.VARCHAR,2147483647);
		VALIDATION.setDefaultValue(null);
		VALIDATION.setPreferredWidth(100);
		VALIDATION.setTextFormat(TextFormat.getPlainInstance());
	}
	
	
	public Procedureandguideline()
	{
		super(Procedureandguideline.class.getName(),"PUBLIC","PROCEDUREANDGUIDELINE",ID,ASSESSMENT,
				DESCRIPTION,RECOGNITION,TITLE,URI,VALIDATION);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
	}
	
	public final static Procedureandguideline	VT	= new Procedureandguideline();
	
	
	public static Procedureandguideline getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}