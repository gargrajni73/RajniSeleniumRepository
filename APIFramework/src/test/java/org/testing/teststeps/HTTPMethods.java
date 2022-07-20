package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


//How this method will fecth the uri value?
//for fetching the uri value this method requires properties object
public class HTTPMethods 
{
	Properties prop;
	public HTTPMethods(Properties prop)
	{
		this.prop=prop;
	}

	public void postRequest(String jsonRequestBody,String uriKey)
	{
		Response res=given()
					.contentType(ContentType.JSON)
					.body(jsonRequestBody)
					.when()
					.post(prop.getProperty(uriKey));
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}
}
