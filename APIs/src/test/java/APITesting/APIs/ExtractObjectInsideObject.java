package APITesting.APIs;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractObjectInsideObject {

	public static void main(String[] args) {

		Response res= given()
				  .contentType(ContentType.JSON)
	              .when()
	              .get("http://localhost:3000/createemployee");
	
	  System.out.println("Response code is"+res.getStatusCode());
	//System.out.println("Response body is:"+res.asString());
	
	JSONArray array=new JSONArray(res.asString());
	
	//Extract a Object inside JSON object
	JSONObject ob=array.getJSONObject(10);
	JSONObject ob1=ob.getJSONObject("address");
	System.out.println("Flat no. is:"+ob1.get("Flat no."));
	
	//Extract a Object which containing JSON object inside
	int length=array.length();
	for(int i=0;i<length;i++)
	{		
		JSONObject ob2=array.getJSONObject(i);
		if(ob2.has("address"))
		{
			try
			{
			JSONObject ob3=ob2.getJSONObject("address");
			System.out.println("Object containing Object"+i);
			}
			catch(Exception e)
			{
			}
			
			try
			{
			JSONArray array2=ob2.getJSONArray("address");
			System.out.println("Object containing array"+i);
			}
			catch(Exception e)
			{
			}
			
		}
	}
		
		//Extract a Object inside Array in Object--Array--Object--Array-Object
		JSONObject ob5=array.getJSONObject(21);
		JSONArray array3=ob5.getJSONArray("address");
		JSONObject ob4=array3.getJSONObject(0);
		System.out.println("Flat no. is:"+ob4.get("flat_no"));
	
	}

}
