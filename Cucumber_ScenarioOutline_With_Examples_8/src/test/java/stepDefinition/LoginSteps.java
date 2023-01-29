package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    String username;
    String password;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("User is on login page");
	}

	
	@When("user enters {string}")
	public void user_enters(String username) {
		   System.out.println(username);

	}

	@When("user enters1 {string}")
	public void user_enters1(String password) {
	   System.out.println(password);
	}



	@When("clicks login button")
	public void clicks_login_button() {
	   System.out.println("user clisck the buttin");
	}

}
