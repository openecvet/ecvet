
package eu.open_ecvet.app.data_src;

import xdev.db.h2.jdbc.H2JDBCDataSource;
import xdev.lang.PluginUser;
import xdev.lang.StaticInstanceSupport;
import xdev.util.auth.EncryptedPassword;


@PluginUser("h2_jdbc") public class EcvetH2
extends H2JDBCDataSource implements StaticInstanceSupport // ${GENERATED-CODE-LINE:DATASOURCE_SUPERCLASS}
{
	
	// Generated code, do not edit! ${GENERATED-CODE-BLOCK-START:DATA_SOURCe}
	public final static EcvetH2	DB	= new EcvetH2();
	
	
	public static EcvetH2 getInstance()
	{
		return DB;
	}
	
	
	public EcvetH2()
	{
		super();
		setName("eu.open_ecvet.app.data_src.EcvetH2");
		putParameterValue("embedded",Boolean.TRUE);
		putParameterValue("username","SA");
		putParameterValue("password",new EncryptedPassword("wrl4qMdgPV8="));
		putParameterValue("catalog","./res/ecvet_draft");
		putParameterValue("urlExtension","");
	}
	// End generated code ${GENERATED-CODE-BLOCK-END:DATA_SOURCe}

}