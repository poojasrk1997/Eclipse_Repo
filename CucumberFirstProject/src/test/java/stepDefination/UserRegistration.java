package stepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.collect.Maps;

public class UserRegistration {
	
	@Given("User is on registration page")
	public void user_is_on_registration_paage() {
	 System.out.println("User navigates to registration page");  
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		
		List<List<String>> userList=dataTable.asLists(String.class);
		for (List<String> e:userList )
		{
			System.out.println(e);
		}
	
	}
	
	@When("User enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
		
		List<Map<String,String>> userList = dataTable.asMaps(String.class, String.class);
		
		
		for(Map<String, String> e: userList)
		{
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("mail"));
			System.out.println(e.get("phone"));
			
		}
		
	    
	}

	@Then("user register successfully")
	public void user_register_successfully() {
	   System.out.println("User Register Successfully");
	}

}
