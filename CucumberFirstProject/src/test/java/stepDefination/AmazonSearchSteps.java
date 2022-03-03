package stepDefination;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AmazonSearchSteps {
	
	Product product;
	Search search;
	
	@Given("I have search field on Amazon page")
	public void i_have_search_field_on_amazon_page() {
	   System.out.println("Step 1: Searched on Amazon Page");
	}

	@When("^I have search the product \"([^\"]+)\" and price (\\d+)$")
	public void i_have_search_the_product_and_price(String productName, Integer price) {
		System.out.println("Step 2: Searched the product: "+productName + "price: "+price);
		
		product =new Product(productName,price);
		
	}

	
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		
		System.out.println("Step 3: Product displayed: "+productName);
		
		search = new Search();
		String name=search.displayProduct(product);
		System.out.println("Product Name: " + name);
		Assert.assertEquals(product.getProductName(), name);
		
	   	}


}
