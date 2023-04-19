package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.CheckoutPage;
import pageLayer.RegisterPage;
import utility.UtilClass;

public class CheckoutPageStep {

	CheckoutPage checkoutpage_obj;
	PageObjectManager pageobjectmanager;
	TestContext testcontext;
	
	public CheckoutPageStep(TestContext context)
	{
		testcontext = context;
		checkoutpage_obj = testcontext.getPageObjectManager().getCheckoutPage();
	}
	
	@When("click on checkout")
	public void click_on_checkout() {
		checkoutpage_obj.checkoutOptionsGuest();
	}
	@When("fill all user details those are compulsory")
	public void fill_all_user_details_those_are_compulsory() {
		checkoutpage_obj.enterBillingDetails();
	}
	@When("click on confirm order")
	public void click_on_confirm_order() {
		checkoutpage_obj.enterPaymentMethod();
	}
	@Then("user is able to buy product and shows {string}")
	public void user_is_able_to_buy_product_and_shows(String string) {
	    
		Assert.assertEquals(checkoutpage_obj.getOrderStatus(), "Warning: Payment method required!");
	}
}
