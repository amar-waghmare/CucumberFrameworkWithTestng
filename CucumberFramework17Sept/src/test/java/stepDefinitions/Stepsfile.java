//package stepDefinitions;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.*;
//import managers.PageObjectManager;
//import pageLayer.CheckoutPage;
//import pageLayer.HomePage;
//import pageLayer.LoginPage;
//import pageLayer.ProductDetailPage;
//import pageLayer.RegisterPage;
//
//public class Stepsfile {
//
//	WebDriver driver;
//	PageObjectManager pageobjectmanager;
//	HomePage homepage_obj;
//	LoginPage loginpage_obj;
//	RegisterPage registerpage_obj;
//	CheckoutPage checkoutpage_obj;
//	ProductDetailPage productdetailpage_obj;
//	
//	
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//		
//		driver = new EdgeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().deleteAllCookies();
//		
//		//---------------------------------------
//		pageobjectmanager = new PageObjectManager(driver);
//		homepage_obj = pageobjectmanager.getHomePage();
//		loginpage_obj = pageobjectmanager.getLoginPage();
//		registerpage_obj = pageobjectmanager.getRegisterPage();
//		productdetailpage_obj = pageobjectmanager.getProductDetailPage();
//		checkoutpage_obj = pageobjectmanager.getCheckoutPage();
//		
//	}
//	
//	@When("user clicks on My account and register link")
//	public void user_clicks_on_my_account_and_register_link() {
//		homepage_obj.clickOnMyAccountLink();
//		homepage_obj.clickOnRegisterLink();
//	}
//	@Then("user navigates to Register Account")
//	public void user_navigates_to_register_account() {
//		Assert.assertEquals(driver.getTitle(), "Register Account");
//	}
//	
//
//	@When("user enter firstname and lastname and email and telephone and password and and confirm password and check marked Privacy Policy and clicked on continue")
//	public void user_enter_firstname_and_lastname_and_email_and_telephone_and_password_and_and_confirm_password_and_check_marked_privacy_policy_and_clicked_on_continue(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//		List<List<String>> userdetails = dataTable.asLists();
//		
//		registerpage_obj.enterFirstName(userdetails.get(0).get(0));
//		registerpage_obj.enterLastName(userdetails.get(0).get(1));
//		registerpage_obj.enterEmail(userdetails.get(0).get(2));
//		registerpage_obj.enterTelephone(userdetails.get(0).get(3));
//		registerpage_obj.enterPassword(userdetails.get(0).get(4));
//		registerpage_obj.enterConfirmPassword(userdetails.get(0).get(5));
//		registerpage_obj.clickOnPrivacyCheckbox();
//		Thread.sleep(2000);
//		registerpage_obj.clickOnContinueButton();
//		Thread.sleep(2000);
//	}
//	
//	@Then("account created successfully and shows {string}")
//	public void account_created_successfully_and_shows(String status_msg) {
//		Assert.assertEquals(driver.getTitle(), status_msg);
//	}
//	
//	@Then("account not created and showing user already have account")
//	public void account_not_created_and_showing_user_already_have_account() {
//		Assert.assertEquals(driver.getTitle(),"Register Account" );
//	}
//	
//	//----------------------------------------------------------------------
//	@When("Clicked on My account and login link")
//	public void clicked_on_my_account_and_login_link() {
//		homepage_obj.clickOnMyAccountLink();
//		homepage_obj.clickOnLoginLink();
//	}
//	@Then("user navigates to account login")
//	public void user_navigates_to_account_login() {
//		Assert.assertEquals(driver.getTitle(), "Account Login");
//	}
//	@When("User enter email as {string} and password as {string} and clicked on login")
//	public void user_enter_email_as_and_password_as_and_clicked_on_login(String email, String password) throws InterruptedException {
//		loginpage_obj.enterEmailAddress(email);
//		loginpage_obj.enterPassword(password);
//		Thread.sleep(2000);
//		loginpage_obj.clickOnLoginButton();
//	}
//	@Then("logged in sucessfully")
//	public void logged_in_sucessfully() {
//		Assert.assertEquals(driver.getTitle(), "My Account");
//	}
//	
//	@Then("not logged in as user details are not available")
//	public void not_logged_in_as_user_details_are_not_available() {
//		Assert.assertEquals(driver.getTitle(), "Account Login");
//	}
//	
//	//-----------------------------------------------------------
//	@When("user clicks on product")
//	public void user_clicks_on_product() {
//		homepage_obj.clickOnProductLink();
//	}
//	
//	@When("user clicks product tab and click on product")
//	public void user_clicks_product_tab_and_click_on_product() {
//	    
//	}
//	
//	@When("enter quantity {string} and click on add to cart")
//	public void enter_quantity_and_click_on_add_to_cart(String string) {
//		productdetailpage_obj.clickOnAddToCartButton();	    
//	}
//	@When("click on Shopping cart link")
//	public void click_on_shopping_cart_link() {
//		homepage_obj.clickOnShoppingCartLink();
//	}
//	@When("click on checkout")
//	public void click_on_checkout() {
//		checkoutpage_obj.checkoutOptionsGuest();
//	}
//	@When("fill all user details those are compulsory")
//	public void fill_all_user_details_those_are_compulsory() {
//		checkoutpage_obj.enterBillingDetails();
//	}
//	@When("click on confirm order")
//	public void click_on_confirm_order() {
//		checkoutpage_obj.enterPaymentMethod();
//	}
//	@Then("user is able to buy product and shows {string}")
//	public void user_is_able_to_buy_product_and_shows(String string) {
//	    
//		Assert.assertEquals(checkoutpage_obj.getOrderStatus(), "Warning: Payment method required!");
//	}
//}
