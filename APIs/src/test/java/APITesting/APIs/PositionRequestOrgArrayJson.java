	package APITesting.APIs;

	import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class PositionRequestOrgArrayJson {

		public static void main(String[] args) {

			JSONObject InnerObject1=new JSONObject();
			
			InnerObject1.put("type", "Primary Address");
			InnerObject1.put("Sector", "Sector-21");
			InnerObject1.put("Pincode", "148028");
			
			JSONObject InnerObject2=new JSONObject();
			
			InnerObject2.put("type", "Secondary Address");
			InnerObject2.put("Sector", "Sector-14");
			InnerObject2.put("Pincode", "121010");
			
			JSONArray ArrayObject=new JSONArray();
			ArrayObject.put(InnerObject1); //ArrayObject.put(0,InnerObject1);
			ArrayObject.put(InnerObject2); //ArrayObject.put(1,InnerObject2);

			JSONObject OuterObject=new JSONObject();
			OuterObject.put("firstname","Lakshika");
			OuterObject.put("lastname","Kumari");
			OuterObject.put("designation", "Senior Analyst");
			OuterObject.put("id","pihu");
			OuterObject.put("Address", ArrayObject);
			
			System.out.println(OuterObject.toString());
			
			Response res=
					given()
					.contentType(ContentType.JSON)
					.body(OuterObject.toString())
					.when()
					.post("http://localhost:3000/createemployee");
			
			
			System.out.println("Status code is");
			System.out.println(res.statusCode());
			System.out.println("Response body is");
			System.out.println(res.asString());
		}

	}
