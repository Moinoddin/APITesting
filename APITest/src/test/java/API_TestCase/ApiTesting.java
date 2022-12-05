package API_TestCase;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class ApiTesting {
  

  @Test
  public void f() {
		
	  
	  ApiTesting api = new ApiTesting();
	  
	  
		  given()
		  
		  	.contentType("application/json")
		  //	.body(api.postRequest())
		  
		  .when()
		  		
		  		.get("https://reqres.in/api/users?page=2")
		  		
		  		.then()
		  			
		  				
		  				.statusCode(200)
		  				.log()
		  				.body();
		
		
		
  }

  
  
   public HashMap<String,String> postRequest()
   {
	   HashMap<String,String> data = new HashMap<String,String>();
	   
	   data.put("id", "0");
	   data.put("username", "string");
	   data.put("firstname", "string");
	   data.put("lastname", "string");
	   data.put("email", "string");
	   data.put("password", "string");
	   data.put("phone", "string");
	   data.put("userStatus", "0");
	   
	   return data;
	   
   }
 


}
