package APITesting.APIs;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithBodyDataSimplePOJOClasses {

	public static void main(String[] args) {

		BasicInformation basic=new BasicInformation();
		basic.setId("Ojas1234");
		basic.setFirstname("Ojas");
		basic.setLastname("Singla");
		basic.setDesignation("STL");
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post("http://localhost:3000/createemployee");
		
		
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("Response body is");
		System.out.println(res.asString());
	}

}
