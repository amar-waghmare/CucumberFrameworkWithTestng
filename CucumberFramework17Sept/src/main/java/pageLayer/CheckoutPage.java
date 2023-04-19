package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilClass;

public class CheckoutPage {

	private WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	private By checkout_btn = By.xpath("//a[contains(text(),'Checkout')]");
	private By guest_checkout_radiobtn = By.xpath("(//input[@name='account'])[2]");
	private By continue_btn1 = By.xpath("//input[@id='button-account']");
	
	private By firstname_txtbox = By.xpath("//input[@id='input-payment-firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='input-payment-lastname']");
	private By email_txtbox = By.xpath("//input[@id='input-payment-email']");
	private By telephone_txtbox = By.xpath("//input[@id='input-payment-telephone']");
	private By address_txtbox = By.xpath("//input[@id='input-payment-address-1']");
	private By city_txtbox = By.xpath("//input[@id='input-payment-city']");
	private By postcode_txtbox = By.xpath("//input[@id='input-payment-postcode']");
	private By country_dropdown = By.xpath("//select[@id='input-payment-country']");
	private By state_dropdown = By.xpath("//select[@id='input-payment-zone']");
	private By continue_btn2 = By.xpath("//input[@id='button-guest']");
	
	private By comment_txtbox = By.xpath("//textarea[@name='comment']");
	private By term_conditions_checkbox = By.xpath("//input[@name='agree']");
	private By continue_btn3 = By.xpath("//input[@id='button-payment-method']");
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-danger')]")
	private WebElement order_status;
	
	public void checkoutOptionsGuest()
	{
		driver.findElement(checkout_btn).click();
		driver.findElement(guest_checkout_radiobtn).click();
		driver.findElement(continue_btn1).click();
	}
	
	public void enterBillingDetails()
	{
		UtilClass util = new UtilClass(driver);
		driver.findElement(firstname_txtbox).sendKeys("David");
		driver.findElement(lastname_txtbox).sendKeys("test");
		driver.findElement(email_txtbox).sendKeys("david@test.com");
		driver.findElement(telephone_txtbox).sendKeys("84126874268");
		driver.findElement(address_txtbox).sendKeys("asdfgh");
		driver.findElement(city_txtbox).sendKeys("Pune");
		driver.findElement(postcode_txtbox).sendKeys("411001");
		
		WebElement country_dropdown1 = driver.findElement(country_dropdown);
		WebElement state_dropdown1 = driver.findElement(state_dropdown);
		util.selectOptionDropdown(country_dropdown1, "India");
		util.selectOptionDropdown(state_dropdown1, "Maharashtra");
		
		driver.findElement(continue_btn2).click();
	}
	
	public void enterPaymentMethod()
	{
		driver.findElement(comment_txtbox).sendKeys("asedfhgt");
		driver.findElement(term_conditions_checkbox).click();
		driver.findElement(continue_btn3).click();
	}
	
	public String getOrderStatus()
	{
		String text =  order_status.getText();
		return text;
	}
}
