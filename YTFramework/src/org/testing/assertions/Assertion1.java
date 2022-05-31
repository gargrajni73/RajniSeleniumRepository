package org.testing.assertions;

import org.testing.utilities.LogsCapture;

public class Assertion1 
{

	public static void assert1(String actual,String expected,String className,String message)
	{
		if(expected.equals(actual))
		{
			LogsCapture.takeLogs(className, message);
		}
		else
		{
			LogsCapture.takeLogs(className, "Login Failed");
		}
	}
	
}
