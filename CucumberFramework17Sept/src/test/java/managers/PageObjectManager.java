package managers;

import org.openqa.selenium.WebDriver;

import pageLayer.CheckoutPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.ProductDetailPage;
import pageLayer.RegisterPage;
import utility.UtilClass;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage_obj;
	private LoginPage loginpage_obj;
	private RegisterPage registerpage_obj;
	private CheckoutPage checkoutpage_obj;
	private ProductDetailPage productdetailpage_obj;
	private UtilClass util_obj;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage getHomePage()
	{
		if(homepage_obj==null)
		{
			homepage_obj = new HomePage(driver);
		}
		return homepage_obj;
	}
	
	public LoginPage getLoginPage()
	{
		if(loginpage_obj==null)
		{
			loginpage_obj = new LoginPage(driver);
		}
		return loginpage_obj;
	}
	
	public RegisterPage getRegisterPage()
	{
		if(registerpage_obj==null)
		{
			registerpage_obj = new RegisterPage(driver);
		}
		return registerpage_obj;
	}
	
	public ProductDetailPage getProductDetailPage()
	{
		if(productdetailpage_obj==null)
		{
			productdetailpage_obj = new ProductDetailPage(driver);
		}
		return productdetailpage_obj;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		if(checkoutpage_obj==null)
		{
			checkoutpage_obj = new CheckoutPage(driver);
		}
		return checkoutpage_obj;
	}
	
	public UtilClass getUtilClass()
	{
		if(util_obj==null)
		{
			util_obj = new UtilClass(driver);
		}
		return util_obj;
	}


}
