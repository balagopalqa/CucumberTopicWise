package stepDefinition;

import java.util.List;
import java.util.Map;

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
   
List<Map<String,String>> userlist = dataTable.asMaps(String.class, String.class);
//To print all values
System.out.println(userlist);

//Will print naveen alone as it is 0
System.out.println(userlist.get(0).get("name"));


for(Map<String,String> e : userlist) {
	System.out.println(e.get("name"));
	System.out.println(e.get("email"));
}

}

@Then("user registration successful")
public void user_registration_successful() {
  System.out.println("Registration is success");
}


}