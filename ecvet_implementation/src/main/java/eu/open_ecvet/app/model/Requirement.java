
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


public class Requirement extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	ID;
	public final static VirtualTableColumn<String>	ACHIEVEMENTCRITERION;
	public final static VirtualTableColumn<String>	DESCRIPTION;
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
		
		ACHIEVEMENTCRITERION = new VirtualTableColumn<String>("ACHIEVEMENTCRITERION");
		ACHIEVEMENTCRITERION.setType(DataType.VARCHAR,2147483647);
		ACHIEVEMENTCRITERION.setDefaultValue(null);
		ACHIEVEMENTCRITERION.setPreferredWidth(100);
		ACHIEVEMENTCRITERION.setTextFormat(TextFormat.getPlainInstance());
		
		DESCRIPTION = new VirtualTableColumn<String>("DESCRIPTION");
		DESCRIPTION.setType(DataType.VARCHAR,2147483647);
		DESCRIPTION.setDefaultValue(null);
		DESCRIPTION.setPreferredWidth(100);
		DESCRIPTION.setTextFormat(TextFormat.getPlainInstance());
		
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
	
	
	public Requirement()
	{
		super(Requirement.class.getName(),"PUBLIC","REQUIREMENT",ID,ACHIEVEMENTCRITERION,
				DESCRIPTION,TITLE,URI);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(TITLE);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"ID"));
	}
	
	public final static Requirement	VT	= new Requirement();
	
	
	public static Requirement getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}