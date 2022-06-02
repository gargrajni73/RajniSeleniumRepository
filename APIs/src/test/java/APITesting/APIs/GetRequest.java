package APITesting.APIs;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		
		Response res= given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/createemployee?firstname=Ridhi");
		
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("Response body is");
		System.out.println(res.asString());
	}

}
