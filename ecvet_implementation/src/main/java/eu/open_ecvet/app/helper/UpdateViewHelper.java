
package eu.open_ecvet.app.helper;


import java.util.HashMap;
import java.util.Map;


public class UpdateViewHelper
{
	public static UpdateViewHelper instance()
	{
		if(instance == null)
		{
			instance = new UpdateViewHelper();
		}
		
		return instance;
	}
	
	private static UpdateViewHelper	instance;
	private Map<String, UpdateView>	updateViews	= new HashMap();
	
	
	private UpdateViewHelper()
	{
		
	}
	
	
	public void add(UpdateView updateView)
	{
		updateViews.put(updateView.getName(),updateView);
	}
	
	
	public UpdateView get(String name)
	{
		return updateViews.get(name);
	}
	
}