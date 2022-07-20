package APITesting.APIs;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractCompleteJSONObject {

	public static void main(String[] args) {

		Response res= given()
				  .contentType(ContentType.JSON)
	              .when()
	              .get("http://localhost:3000/createemployee");
	
	  System.out.println("Response code is"+res.getStatusCode());
	//System.out.println("Response body is:"+res.asString());
	
	JSONArray array=new JSONArray(res.asString());
	
	//Extract a complete json object
	JSONObject ob=array.getJSONObject(2);
	Set<String> allkeys=ob.keySet(); //fetch all the keys
	for(String i:allkeys)
	{
		System.out.println("Key name is:"+i);
		System.out.println("Value is:"+ob.get(i));
	}
	}

}
