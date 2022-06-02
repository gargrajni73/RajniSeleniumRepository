package APITesting.APIs;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestWithBodyDataArrayPOJOClasses {

	public static void main(String[] args) {

		AddressDetails[] address=new AddressDetails[2];
		address[0]=new AddressDetails();
		address[0].setFlat_no("5321");
		address[0].setSector("Sector 15");
		address[0].setPincode("543218");
		
		address[1]=new AddressDetails();
		address[1].setFlat_no("7654");
		address[1].setSector("Sector 17");
		address[1].setPincode("342132");

		BasicInformationArray basic=new BasicInformationArray();
		basic.setId("kar4565");
		basic.setFirstname("Karan");
		basic.setLastname("Sood");
		basic.setDesignation("Senior Manager");
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
