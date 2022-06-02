package APITesting.APIs;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithBodyDataComplexPOJOClasses {

	public static void main(String[] args) {
		
		AddressDetails address=new AddressDetails();
		address.setFlat_no("5321");
		address.setSector("Sector 15");
		address.setPincode("543218");

		BasicInformation basic=new BasicInformation();
		basic.setId("Dev1234");
		basic.setFirstname("Devishi");
		basic.setLastname("Jindal");
		basic.setDesignation("Manager");
		basic.setAddress(address);
		
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
