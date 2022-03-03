package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSearchSteps {
	
	@Given("User wants to select car type {string} from uber app")
	public void user_wants_to_select_car_type_from_uber_app(String string) {
	  System.out.println("Step 1 : User wants to select car type"); 
	}

	@When("User selects car type as {string} and pickup location is {string} and drop location is {string}")
	public void user_selects_car_type_as_and_pickup_location_is_and_drop_location_is(String string, String string2, String string3) {
		System.out.println("Step 2 : User Selects car type pickup and drop location"); 
	}

	@Then("Driver starts the journney")
	public void driver_starts_the_journney() {
		System.out.println("Step 3 : Driver starts the journey"); 
	}

	@And("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4 : Driver ends the journey");
	    
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer int1) {
		System.out.println("Step 5 : User pays the amount"); 
	}


}
