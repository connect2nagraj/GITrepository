package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logintest {
	
	

@Given("^user should be on login page$")
public void user_should_be_on_login_page() throws Throwable {
   
}

@Then("^user invalid \"([^\"]*)\"$")
public void user_invalid(String username) throws Throwable {
	System.out.println(username + " this is");
    
}

@Then("^user enters invalid \"([^\"]*)\"$")
public void user_enters_invalid(String password) throws Throwable {
	System.out.println(password + "  yes this");
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
    
}

@Then("^user should able to see landing page$")
public void user_should_able_to_see_landing_page() throws Throwable {
    
}
	

}
