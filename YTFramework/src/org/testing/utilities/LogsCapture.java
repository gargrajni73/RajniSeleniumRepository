package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takeLogs(String classname,String message) 
	{
		DOMConfigurator.configure("../YTFramework/layout.xml"); //Make Connection with layout file
		Logger Log=Logger.getLogger(classname);
		Log.info(message);
	}

}
