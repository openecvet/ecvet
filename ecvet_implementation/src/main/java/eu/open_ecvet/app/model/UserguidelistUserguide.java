
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


public class UserguidelistUserguide extends VirtualTable implements StaticInstanceSupport // ${GENERATED-CODE-LINE:VT_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:VIRTUAL_TABLE}
	public final static VirtualTableColumn<Integer>	USERGUIDELIST_ID;
	public final static VirtualTableColumn<Integer>	USERGUIDE_ID;
	public final static VirtualTableColumn<String>	USERGUIDE_TITLE;
	
	static
	{
		USERGUIDELIST_ID = new VirtualTableColumn<Integer>("USERGUIDELIST_ID");
		USERGUIDELIST_ID.setType(DataType.INTEGER);
		USERGUIDELIST_ID.setNullable(false);
		USERGUIDELIST_ID.setDefaultValue(0);
		USERGUIDELIST_ID.setVisible(false);
		USERGUIDELIST_ID.setPreferredWidth(100);
		USERGUIDELIST_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,
				false,false));
		
		USERGUIDE_ID = new VirtualTableColumn<Integer>("USERGUIDE_ID");
		USERGUIDE_ID.setType(DataType.INTEGER);
		USERGUIDE_ID.setNullable(false);
		USERGUIDE_ID.setDefaultValue(0);
		USERGUIDE_ID.setVisible(false);
		USERGUIDE_ID.setPreferredWidth(100);
		USERGUIDE_ID.setTextFormat(TextFormat.getNumberInstance(Locale.getDefault(),null,0,0,false,
				false));
		
		USERGUIDE_TITLE = new VirtualTableColumn<String>("USERGUIDE_TITLE");
		USERGUIDE_TITLE.setType(DataType.VARCHAR,2147483647);
		USERGUIDE_TITLE.setDefaultValue(null);
		USERGUIDE_TITLE.setCaption("TITLE");
		USERGUIDE_TITLE.setPreferredWidth(100);
		USERGUIDE_TITLE.setTextFormat(TextFormat.getPlainInstance());
		
		USERGUIDE_TITLE.setPersistent(false);
		USERGUIDE_TITLE.setTableColumnLink(new TableColumnLink(Userguide.class.getName(),
				Userguide.TITLE.getName(),new EntityRelationship(Userguide.class.getName(),
						new String[]{Userguide.ID.getName()},Cardinality.ONE,
						UserguidelistUserguide.class.getName(),
						new String[]{UserguidelistUserguide.USERGUIDE_ID.getName()},
						Cardinality.MANY)));
	}
	
	
	public UserguidelistUserguide()
	{
		super(UserguidelistUserguide.class.getName(),"PUBLIC","USERGUIDELIST_USERGUIDE",
				USERGUIDELIST_ID,USERGUIDE_ID,USERGUIDE_TITLE);
		
		setDataSource(EcvetH2.DB);
		setPrimaryColumn(USERGUIDELIST_ID);
		
		addIndex(new Index("PRIMARY_KEY",IndexType.PRIMARY_KEY,"USERGUIDELIST_ID","USERGUIDE_ID"));
	}
	
	public final static UserguidelistUserguide	VT	= new UserguidelistUserguide();
	
	
	public static UserguidelistUserguide getInstance()
	{
		return VT;
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:VIRTUAL_TABLE}
	
}