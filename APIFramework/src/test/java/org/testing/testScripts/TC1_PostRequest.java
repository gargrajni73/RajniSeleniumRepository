package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.VariableReplacement;

public class TC1_PostRequest {
	
	public static void main(String[] args) throws IOException 
	{
		
		Properties prop=LoadFile.loadProperties("../APIFramework/URI.properties");
	 String jsonBody=LoadJsonFile.jsonData("../APIFramework/src/test/java/org/testing/resources/requestpayload.json");
	 Random ran=new Random();
	 Integer idvalue=ran.nextInt();
	 jsonBody= VariableReplacement.variableReplacement(jsonBody, "id", idvalue.toString());
	 System.out.println("Enter firstname");
	 Scanner scan=new Scanner(System.in);
	 String firstname=scan.next();
	 jsonBody= VariableReplacement.variableReplacement(jsonBody, "firstname", firstname);	
		HTTPMethods http=new HTTPMethods(prop);
		http.postRequest(jsonBody, "CreateURI");
	
		
	}

}
