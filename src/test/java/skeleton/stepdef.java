package skeleton;

import cucumber.api.java.en.Given;

public class stepdef {
	@Given("user launches to chrome")
	public void user_launches_to_chrome() {
		System.out.println("Launching chrome");
	   
	}

	@Given("user navigates to demowebshop")
	public void user_navigates_to_demowebshop() {
		System.out.println("navigates to demowebshop");
	    
	}

	@Given("user enters search criteria as {string}")
	public void user_enters_search_criteria_as(String search) {
		System.out.println("entering search as "+search);
	    
	}

	@Given("user clicks on search button")
	public void user_clicks_on_search_button() {
		System.out.println("click on search button");
	   
	}

	@Given("user performs close")
	public void user_performs_close() {
		System.out.println("peforming close");
	   
	}


}
