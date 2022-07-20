package APITesting.APIs;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingDataSingleKey {

	public static void main(String[] args) {
				
		Response res= given()
					  .contentType(ContentType.JSON)
		              .when()
		              .get("http://localhost:3000/createemployee");
		
		System.out.println("Response code is"+res.getStatusCode());
		System.out.println("Response body is:"+res.asString());
		
		JSONArray array=new JSONArray(res.asString());
		
		//Extract a single key value
		JSONObject ob=array.getJSONObject(0);
		System.out.println("Id is:"+ob.get("id"));
		
		//Extract multiple occurence of that key
		int length=array.length();
		for(int i=0;i<length;i++)
		{
			JSONObject ob1=array.getJSONObject(i);
			System.out.println("Id is:"+ob1.get("id"));
		}
		
		//Extract multiple occurence of that key and key is not present in any of the object
		
		for(int i=0;i<length;i++)
		{
			JSONObject ob1=array.getJSONObject(i);
			try
			{
			System.out.println("lastname is:"+ob1.get("lastname"));
			}
			catch(Exception e)
			{
				System.out.println("Value not present");
			}
		}
		

		
	}

}
