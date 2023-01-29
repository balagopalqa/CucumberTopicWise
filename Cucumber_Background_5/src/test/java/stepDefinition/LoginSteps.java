package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {


@Given("user is on login page")
public void user_is_on_login_page() {
   System.out.println("login page");
}

@When("user enters username")
public void user_enters_username() {
	   System.out.println("enters username");

}

@When("user enters password")
public void user_enters_password() {
   System.out.println("enters password");
}

@When("clicks login button")
public void clicks_login_button() {
   System.out.println("Clicks login button");
}

@When("user enters invalid username")
public void user_enters_invalid_username() {
    System.out.println("invalid un smoke");
}

@When("user enters  invalid password")
public void user_enters_invalid_password() {
System.out.println("invalid pwd smoke");
}


@Given("chrome browser is launched")
public void chrome_browser_is_launched() {
  System.out.println("bg:browser1");
}

@When("url is put in the browser")
public void url_is_put_in_the_browser() {
	  System.out.println("bg:browser2 url");

}

@When("enter key is pressed")
public void enter_key_is_pressed() {
	  System.out.println("bg:browser3 enter");

}


	
}
