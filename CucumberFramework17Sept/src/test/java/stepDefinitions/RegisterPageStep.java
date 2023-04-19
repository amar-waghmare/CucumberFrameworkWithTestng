package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.ProductDetailPage;
import pageLayer.RegisterPage;
import utility.UtilClass;

public class RegisterPageStep {

	PageObjectManager pageobjectmanager;
	private TestContext testcontext;
	RegisterPage registerpage_obj;
	UtilClass util_obj;
	
	public RegisterPageStep(TestContext context)
	{
		testcontext = context;
		registerpage_obj = testcontext.getPageObjectManager().getRegisterPage();
		util_obj = testcontext.getPageObjectManager().getUtilClass();
	}


	@When("user enter firstname and lastname and email and telephone and password and and confirm password and check marked Privacy Policy and clicked on continue")
	public void user_enter_firstname_and_lastname_and_email_and_telephone_and_password_and_and_confirm_password_and_check_marked_privacy_policy_and_clicked_on_continue(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> userdetails = dataTable.asLists();
		
		registerpage_obj.enterFirstName(userdetails.get(0).get(0));
		registerpage_obj.enterLastName(userdetails.get(0).get(1));
		registerpage_obj.enterEmail(userdetails.get(0).get(2));
		registerpage_obj.enterTelephone(userdetails.get(0).get(3));
		registerpage_obj.enterPassword(userdetails.get(0).get(4));
		registerpage_obj.enterConfirmPassword(userdetails.get(0).get(5));
		registerpage_obj.clickOnPrivacyCheckbox();
		Thread.sleep(2000);
		registerpage_obj.clickOnContinueButton();
		Thread.sleep(2000);
	}
	
	@Then("account created successfully and shows {string}")
	public void account_created_successfully_and_shows(String status_msg) {
		Assert.assertEquals(util_obj.getPageTitle(), status_msg);
	}
	
	@Then("account not created and showing user already have account")
	public void account_not_created_and_showing_user_already_have_account() {
		Assert.assertEquals(util_obj.getPageTitle(),"Register Account" );
	}
	
}
