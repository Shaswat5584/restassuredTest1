package restassuredTest1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeserialTest {
	
	@Test
	
	public void deTest() throws JsonMappingException, JsonProcessingException {
		
	String a ="{\"page\":1,\"per_page\":6,\"total\":12,\"total_pages\":2,\"data\":[{\"id\":1,\"name\":\"cerulean\",\"year\":2000,\"color\":\"#98B2D1\",\"pantone_value\":\"15-4020\"},{\"id\":2,\"name\":\"fuchsia rose\",\"year\":2001,\"color\":\"#C74375\",\"pantone_value\":\"17-2031\"},{\"id\":3,\"name\":\"true red\",\"year\":2002,\"color\":\"#BF1932\",\"pantone_value\":\"19-1664\"},{\"id\":4,\"name\":\"aqua sky\",\"year\":2003,\"color\":\"#7BC4C4\",\"pantone_value\":\"14-4811\"},{\"id\":5,\"name\":\"tigerlily\",\"year\":2004,\"color\":\"#E2583E\",\"pantone_value\":\"17-1456\"},{\"id\":6,\"name\":\"blue turquoise\",\"year\":2005,\"color\":\"#53B0AE\",\"pantone_value\":\"15-5217\"}],\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}";
	
	RestAssured.baseURI="https://reqres.in";
	RestAssured.basePath="/api/unknown";
	
	RequestSpecification req = RestAssured.given();
	
	Response resp = req.get();
	
	resp.prettyPrint();
	
	//DeserializationPojo dp = resp.as(DeserializationPojo.class);
	
	//System.out.println(dp.getPage()+" *****");
	//System.out.println(dp.getSupport()+" *****");
	//System.out.println(dp.getData()+" *****");
	
	ObjectMapper omap = new ObjectMapper();
	DeserializationPojo dp = omap.readValue(a,DeserializationPojo.class);
	System.out.println(dp.getTotal());
	
	
	}

}
