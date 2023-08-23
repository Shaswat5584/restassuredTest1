package restassuredTest1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestTest1 {
	
	@Test
	public void rest1() {
	
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println(response.asPrettyString());
	}
}
