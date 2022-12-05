package API_TestCase;

import org.testng.annotations.Test;

import ApiUtil.DataProviderClass;

import static io.restassured.RestAssured.*;

public class ReqRes {
	
	
	@Test(priority = 1)
	public void listUser()
	{
		given()
		
		
		.when()
		
				.get("https://reqres.in/api/users?page=2")
		.then()
		
				.statusCode(200)
				.log()
				.body();
		
		
		System.out.println("----------------------------------Test Case 1 End--------------------------------------------------");
		
	}
	
	@Test(priority = 2)
	public void singleUser()
	{
		given()
		
		.when()
		
				.get("https://reqres.in/api/users/2")
		.then()
		
				.statusCode(200)
				.log()
				.body();
		
		System.out.println("----------------------------------Test Case 2 End--------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void single_User_Not_Found()
	{
		given()
		
		.when()
		
				.get("https://reqres.in/api/users/23")
		
		.then()
		
				.statusCode(404)
				.log()
				.body();
		
		System.out.println("----------------------------------Test Case 3 End--------------------------------------------------");
		
	}
	
	@Test(priority = 4)
	public void  listResource()
	{
		given()
		
		.when()
		
				.get("https://reqres.in/api/unknown")
				
		.then()
		
			.statusCode(200)
			.log()
			.body();
		
		System.out.println("----------------------------------Test Case 4 End--------------------------------------------------");
		
	}
	
	@Test(priority = 5)
	public void createPost()
	{
		DataProviderClass data = new DataProviderClass();
		
		given()
		
				.contentType("application/json")
				.body(data.dataProviderMethod())
		.when()
		
				.post("https://reqres.in/api/users")
				
		.then()
		
				.statusCode(201)
				.log()
				.body();
		
		System.out.println("----------------------------------Test Case 5 End--------------------------------------------------");
		
	}

}
