
	package APITesting.APIs;

	import static io.restassured.RestAssured.*;

	import org.json.JSONObject;

	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class PositionRequestOrgComplexJson {

		public static void main(String[] args) {

			JSONObject InnerObject=new JSONObject();
			
			InnerObject.put("Flat no.", "1102");
			InnerObject.put("Sector", "Sector-21");
			InnerObject.put("Pincode", "148028");
			
			JSONObject OuterObject=new JSONObject();
			OuterObject.put("firstname","Palash");
			OuterObject.put("lastname","Kumar");
			OuterObject.put("designation", "Analyst");
			OuterObject.put("id","pik123");
			OuterObject.put("Address", InnerObject);
			
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
