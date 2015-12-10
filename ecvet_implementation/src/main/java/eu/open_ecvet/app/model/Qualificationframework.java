
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


public class Qualificationframework extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	DESCRIPTION;
	public final static VirtualTableColumn<String>	FRAMEWORK;
	public final static VirtualTableColumn<Integer>	FRAMEWORKLEVEL;
	public final static VirtualTableColumn<String>	FRAMEWORKTERM;
	public final static VirtualTableColumn<String>	INDICATOR;
	public final static VirtualTableColumn<String>	TITLE;
	public final static VirtualTableColumn<String>	URI;
	
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
		
		DESCRIPTION = new VirtualTableColumn<String>("DESCRIPTION");
		DESCRIPTION.setType(DataType.VARCHAR,2147483647);
		DESCRIPTION.setDefaultValue(null);
		DESCRIPTION.setPreferredWidth(100);
		DESCRIPTION.setTextFormat(TextFormat.getPlainInstance());
		
		FRAMEWORK = new VirtualTableColumn<String>("FRAMEWORK");
		FRAMEWORK.setType(DataType.VARCHAR,2147483647);
		FRAMEWORK.setDefaultValue(null);
		FRAMEWORK.setPreferredWidth(100);
		FRAMEWORK.setTextFormat(TextFormat.getPlainInstance());
		
		FRAMEWORKLEVEL = new VirtualTableColumn<Integer>("FRAMEWORKLEVEL");
		FRAMEWORKLEVEL.setType(DataType.INTEGER);
		FRAMEWORKLEVEL.setDefaultValue(null);
		FRAMEWORKLEVEL.setPreferredWidth(100);
		FRAMEWORKLEVEL.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		FRAMEWORKTERM = new VirtualTableColumn<String>("FRAMEWORKTERM");
		FRAMEWORKTERM.setType(DataType.VARCHAR,2147483647);
		FRAMEWORKTERM.setDefaultValue(null);
		FRAMEWORKTERM.setPreferredWidth(100);
		FRAMEWORKTERM.setTextFormat(TextFormat.getPlainInstance());
		
		INDICATOR = new VirtualTableColumn<String>("INDICATOR");
		INDICATOR.setType(DataType.VARCHAR,2147483647);
		INDICATOR.setDefaultValue(null);
		INDICATOR.setPreferredWidth(100);
		INDICATOR.setTextFormat(TextFormat.getPlainInstance());
		
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
	}
	
	
	public Qualificationframework()
	{
		super(Qualificationframework.class.getName(),"PUBLIC","QUALIFICATIONFRAMEWORK",ID,
				DESCRIPTION,FRAMEWORK,FRAMEWORKLEVEL,FRAMEWORKTERM,INDICATOR,TITLE,URI);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
	}
	
	public final static Qualificationframework	VT	= new Qualificationframework();
	
	
	public static Qualificationframework getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}