package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BestBuyAPITesting {
	
	@Test
	public void verifyProduct() {
		RestAssured.baseURI="http:/localhost/";
		RestAssured.port=3030;
		
		RestAssured.given().when().get("/products").then().statusCode(200);
	}
	
	@Test
	public void verifyGetProductwithSpecificID() {
		
	RestAssured.given().when().param("id", 43900).get("/products").then().log().all().statusCode(200);
			
		
	}
	
	@Test
	public void verifyGetProductwithLimit() {
		
	RestAssured.given().when().queryParam("$limit", 5).get("/products").then().log().all().statusCode(200);
		
	}
	
	
	
	



}
