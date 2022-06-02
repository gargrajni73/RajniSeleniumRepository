
	package APITesting.APIs;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;

	import org.json.JSONObject;
	import org.json.JSONTokener;

	import static io.restassured.RestAssured.*;

	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	
	public class PostRequestArrayJson {


		public static void main(String[] args) throws FileNotFoundException {
			
			File f=new File("../APIs/RequestBodyDataArrayJsonFile.json"); //For making connection
			FileReader fr=new FileReader(f); //To read a file character by character
			JSONTokener j=new JSONTokener(fr); //to read Json file specifically
			JSONObject js=new JSONObject(j); //Read object notation in Json file
			
			Response res=
					given()
					.contentType(ContentType.JSON)
					.body(js.toString())
					.when()
					.post("http://localhost:3000/createemployee");
			
			
			System.out.println("Status code is");
			System.out.println(res.statusCode());
			System.out.println("Response body is");
			System.out.println(res.asString());
			
		}

	}


