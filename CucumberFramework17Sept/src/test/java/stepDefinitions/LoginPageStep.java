package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import utility.UtilClass;

public class LoginPageStep {

	LoginPage loginpage_obj;
	UtilClass util_obj;
	PageObjectManager pageobjectmanager;
	private TestContext testcontext;
	
	public LoginPageStep(TestContext context)
	{
		testcontext = context;
	}
	
	@Then("user navigates to account login")
	public void user_navigates_to_account_login() {
		
		loginpage_obj = testcontext.getPageObjectManager().getLoginPage();
		util_obj = testcontext.getPageObjectManager().getUtilClass();
		Assert.assertEquals(util_obj.getPageTitle(), "Account Login");
	}
	@When("User enter email as {string} and password as {string} and clicked on login")
	public void user_enter_email_as_and_password_as_and_clicked_on_login(String email, String password) throws InterruptedException {
		loginpage_obj.enterEmailAddress(email);
		loginpage_obj.enterPassword(password);
		Thread.sleep(2000);
		loginpage_obj.clickOnLoginButton();
	}
	@Then("logged in sucessfully")
	public void logged_in_sucessfully() {
		Assert.assertEquals(util_obj.getPageTitle(), "My Account");
	}
	
	@Then("not logged in as user details are not available")
	public void not_logged_in_as_user_details_are_not_available() {
		Assert.assertEquals(util_obj.getPageTitle(), "Account Login");
	}
	
}
