
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


public class ValidationlistValidation extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	VALIDATIONLIST_ID;
	public final static VirtualTableColumn<Integer>	VALIDATION_ID;
	public final static VirtualTableColumn<String>	VALIDATION_TITLE;
	
	static
	{
		VALIDATIONLIST_ID = new VirtualTableColumn<Integer>("VALIDATIONLIST_ID");
		VALIDATIONLIST_ID.setType(DataType.INTEGER);
		VALIDATIONLIST_ID.setNullable(false);
		VALIDATIONLIST_ID.setDefaultValue(0);
		VALIDATIONLIST_ID.setVisible(false);
		VALIDATIONLIST_ID.setPreferredWidth(100);
		VALIDATIONLIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		VALIDATION_ID = new VirtualTableColumn<Integer>("VALIDATION_ID");
		VALIDATION_ID.setType(DataType.INTEGER);
		VALIDATION_ID.setNullable(false);
		VALIDATION_ID.setDefaultValue(0);
		VALIDATION_ID.setVisible(false);
		VALIDATION_ID.setPreferredWidth(100);
		VALIDATION_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		VALIDATION_TITLE = new VirtualTableColumn<String>("VALIDATION_TITLE");
		VALIDATION_TITLE.setType(DataType.VARCHAR,2147483647);
		VALIDATION_TITLE.setDefaultValue(null);
		VALIDATION_TITLE.setCaption("TITLE");
		VALIDATION_TITLE.setPreferredWidth(100);
		VALIDATION_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		VALIDATION_TITLE.setPersistent(false);
		VALIDATION_TITLE.setTableColumnLink(new TableColumnLink(Validation.class.getName(),
				Validation.TITLE.getName(),new EntityRelationship(Validation.class.getName(),
						new String[]{Validation.ID.getName()},Cardinality.ONE,
						ValidationlistValidation.class.getName(),
						new String[]{ValidationlistValidation.VALIDATION_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public ValidationlistValidation()
	{
		super(ValidationlistValidation.class.getName(),"PUBLIC","VALIDATIONLIST_VALIDATION",
				VALIDATIONLIST_ID,VALIDATION_ID,VALIDATION_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(VALIDATIONLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"VALIDATION_ID","VALIDATIONLIST_ID"));
	}
	
	public final static ValidationlistValidation	VT	= new ValidationlistValidation();
	
	
	public static ValidationlistValidation getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}