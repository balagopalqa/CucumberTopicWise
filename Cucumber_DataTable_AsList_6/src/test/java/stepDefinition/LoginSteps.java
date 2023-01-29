package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	

@Given("user is on registartion page")
public void user_is_on_registartion_page() {
   System.out.println("user is on registration page");
}

@When("user enters following user details")
public void user_enters_following_user_details(DataTable dataTable) {
   
	List<List<String>> userlist=dataTable.asLists(String.class);
	
	for(List<String> e : userlist) {
		System.out.println(e);
	}
	
}

@Then("user registration successful")
public void user_registration_successful() {
  System.out.println("Registration is success");
}


}