
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


public class QualificationframeworklistQualificationframework extends VirtualTable implements
		StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	QUALIFICATIONFRAMEWORKLIST_ID;
	public final static VirtualTableColumn<Integer>	QUALIFICATIONFRAMEWORK_ID;
	public final static VirtualTableColumn<String>	QUALIFICATIONFRAMEWORK_TITLE;
	
	static
	{
		QUALIFICATIONFRAMEWORKLIST_ID = new VirtualTableColumn<Integer>(
				"QUALIFICATIONFRAMEWORKLIST_ID");
		QUALIFICATIONFRAMEWORKLIST_ID.setType(DataType.INTEGER);
		QUALIFICATIONFRAMEWORKLIST_ID.setNullable(false);
		QUALIFICATIONFRAMEWORKLIST_ID.setDefaultValue(0);
		QUALIFICATIONFRAMEWORKLIST_ID.setVisible(false);
		QUALIFICATIONFRAMEWORKLIST_ID.setPreferredWidth(100);
		QUALIFICATIONFRAMEWORKLIST_ID.setTextFormat(TextFormat.getNumberInstance(
				Locale.getDefault(),null,0,0,false,false));
		
		QUALIFICATIONFRAMEWORK_ID = new VirtualTableColumn<Integer>("QUALIFICATIONFRAMEWORK_ID");
		QUALIFICATIONFRAMEWORK_ID.setType(DataType.INTEGER);
		QUALIFICATIONFRAMEWORK_ID.setNullable(false);
		QUALIFICATIONFRAMEWORK_ID.setDefaultValue(0);
		QUALIFICATIONFRAMEWORK_ID.setVisible(false);
		QUALIFICATIONFRAMEWORK_ID.setPreferredWidth(100);
		QUALIFICATIONFRAMEWORK_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),
				null,0,0,false,false));
		
		QUALIFICATIONFRAMEWORK_TITLE = new VirtualTableColumn<String>(
				"QUALIFICATIONFRAMEWORK_TITLE");
		QUALIFICATIONFRAMEWORK_TITLE.setType(DataType.VARCHAR,2147483647);
		QUALIFICATIONFRAMEWORK_TITLE.setDefaultValue(null);
		QUALIFICATIONFRAMEWORK_TITLE.setCaption("TITLE");
		QUALIFICATIONFRAMEWORK_TITLE.setPreferredWidth(100);
		QUALIFICATIONFRAMEWORK_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		QUALIFICATIONFRAMEWORK_TITLE.setPersistent(false);
		QUALIFICATIONFRAMEWORK_TITLE
				.setTableColumnLink(new TableColumnLink(
						Qualificationframework.class.getName(),
						Qualificationframework.TITLE.getName(),
						new EntityRelationship(
								Qualificationframework.class.getName(),
								new String[]{Qualificationframework.ID.getName()},
								Cardinality.ONE,
								QualificationframeworklistQualificationframework.class.getName(),
								new String[]{QualificationframeworklistQualificationframework.QUALIFICATIONFRAMEWORK_ID
										.getName()},Cardinality.MANY)));
	}
	
	
	public QualificationframeworklistQualificationframework()
	{
		super(QualificationframeworklistQualificationframework.class.getName(),"PUBLIC",
				"QUALIFICATIONFRAMEWORKLIST_QUALIFICATIONFRAMEWORK",QUALIFICATIONFRAMEWORKLIST_ID,
				QUALIFICATIONFRAMEWORK_ID,QUALIFICATIONFRAMEWORK_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(QUALIFICATIONFRAMEWORKLIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"QUALIFICATIONFRAMEWORKLIST_ID",
				"QUALIFICATIONFRAMEWORK_ID"));
	}
	
	public final static QualificationframeworklistQualificationframework	VT	= new QualificationframeworklistQualificationframework();
	
	
	public static QualificationframeworklistQualificationframework getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}