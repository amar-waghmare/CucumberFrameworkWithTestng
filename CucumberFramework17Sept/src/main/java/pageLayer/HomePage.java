package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//--------------Obj repo ---------------------
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	private By product_link = By.xpath("//a[contains(text(),'MacBook')]");
	
	private By shopping_cart_link = By.xpath("//span[contains(text(),'Shopping Cart')]");
	
	//------------ Action methods ----------------
	
	public void clickOnMyAccountLink()
	{
		myaccount_link.click();
	}
	
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	
	public void clickOnRegisterLink()
	{
		register_link.click();
	}
	
	public void clickOnProductLink()
	{
		driver.findElement(product_link).click();
	}
	
	
	
	public void clickOnShoppingCartLink()
	{
		driver.findElement(shopping_cart_link).click();
	}
}
