package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.CheckoutPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.ProductDetailPage;
import pageLayer.RegisterPage;
import utility.UtilClass;

public class HomePageStep {

	PageObjectManager pageobjectmanager;
	HomePage homepage_obj;
	UtilClass util_obj;
	private TestContext testcontext;
	
	public HomePageStep(TestContext context)
	{
		testcontext = context;
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		homepage_obj = testcontext.getPageObjectManager().getHomePage();
		util_obj = testcontext.getPageObjectManager().getUtilClass();

	}
	
	@When("user clicks on My account and register link")
	public void user_clicks_on_my_account_and_register_link() {
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
	}
	@Then("user navigates to Register Account")
	public void user_navigates_to_register_account() {
		Assert.assertEquals(util_obj.getPageTitle(), "Register Account");
	}
	@When("Clicked on My account and login link")
	public void clicked_on_my_account_and_login_link() {
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
	}
	
	@When("user clicks on product")
	public void user_clicks_on_product() {
		homepage_obj.clickOnProductLink();
	}
	@When("click on Shopping cart link")
	public void click_on_shopping_cart_link() {
		homepage_obj.clickOnShoppingCartLink();
	}
}
