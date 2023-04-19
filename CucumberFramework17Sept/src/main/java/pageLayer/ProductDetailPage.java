package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	private WebDriver driver;
	public ProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	private By add_to_cart_btn = By.xpath("//button[@id='button-cart']");
	
	public void clickOnAddToCartButton()
	{
		driver.findElement(add_to_cart_btn).click();
	}
	
}
