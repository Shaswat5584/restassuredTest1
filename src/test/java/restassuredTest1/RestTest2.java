package restassuredTest1;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTest2 {
	
	
	
	@Test(enabled=false)
	public void testResponse1() {
		
		JSONObject json = new JSONObject();
		json.put("name", "shaswat");
		json.put("job", "QA");
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users";
		
		RestAssured.
		given().
			header("Content-type", "application/json").contentType(ContentType.JSON).body(json.toJSONString()).
		when().
			post().
		then().
			statusCode(201).log().all();
		
		
	}
	
	@Test
	public void testResponse2() {
		
		JSONObject json = new JSONObject();
		json.put("name", "shaswat");
		json.put("job", "QA");
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users";
		
		Response resp = RestAssured.
		given().
			header("Content-type", "application/json").contentType(ContentType.JSON).body(json.toJSONString()).
		when().
			post();
		
		System.out.println("***********");
		resp.prettyPrint();
		
		JsonPath jsonpath = resp.jsonPath();
		System.out.println(jsonpath.get("name").toString());
		System.out.println(jsonpath.get("createdAt").toString());
		
		
	}
	
	

}
