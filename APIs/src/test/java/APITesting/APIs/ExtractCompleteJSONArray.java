package APITesting.APIs;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractCompleteJSONArray {

	public static void main(String[] args) {

		Response res= given()
				  .contentType(ContentType.JSON)
	              .when()
	              .get("http://localhost:3000/createemployee");
	
	  System.out.println("Response code is"+res.getStatusCode());
	//System.out.println("Response body is:"+res.asString());
	
	JSONArray array=new JSONArray(res.asString());
	
	//Extract a complete Json Array
	int length=array.length();
	for(int i=0;i<length;i++)
	{	
	System.out.println("****Object is****"+i);
	JSONObject ob=array.getJSONObject(i);
	Set<String> allkeys=ob.keySet(); //fetch all the keys
	for(String s:allkeys)
	{
		System.out.println("Key name is:"+s);
		System.out.println("Value is:"+ob.get(s));
	}
	}
	}

}
