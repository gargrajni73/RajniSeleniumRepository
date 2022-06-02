package APITesting.APIs;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestOrgJson {

	public static void main(String[] args) {

		JSONObject ob=new JSONObject();
		ob.put("firstname","Amita");
		ob.put("lastname","Goyal");
		ob.put("designation", "Project Lead");
		ob.put("id","am123");
		
		System.out.println(ob.toString());
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(ob.toString())
				.when()
				.post("http://localhost:3000/createemployee");
		
		
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("Response body is");
		System.out.println(res.asString());
	}

}
