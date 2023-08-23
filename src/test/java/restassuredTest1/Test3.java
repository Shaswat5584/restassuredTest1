package restassuredTest1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Test3 {
	
	@Test
	public void rest1() {
	
	Response resp = RestAssured.get("https://reqres.in/api/unknown");
	resp.prettyPrint();
	
	System.out.println("**********");
	
	JsonPath jsonpath = resp.jsonPath();
	
	String data = jsonpath.get("data[0].email");
	
	System.out.println("email: "+data);
	
	
	}
	

}
