package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class TestUserRegistration extends TestBase {

	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 

	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() throws Throwable {
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
	}

	@When("^I click on register link$")
	public void i_click_on_register_link()  {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	@When("^I entered the user data$")
	public void i_entered_the_user_data()  {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("ismail", "saleh", "4 Maadi Street", "Cairo", "CA" , "1234" , "01151279132" , "2345" , "ismailSaleh" , "12345678");
	}


	@Then("^The registration page displayed successfully$")
	public void the_registration_page_displayed_successfully()  {
		registerObject.userLogout();
	}
}
