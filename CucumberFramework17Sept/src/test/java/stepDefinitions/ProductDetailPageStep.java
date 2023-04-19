package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.ProductDetailPage;

public class ProductDetailPageStep {

	PageObjectManager pageobjectmanager;
	private TestContext testcontext;
	ProductDetailPage productdetailpage_obj;
	
	public ProductDetailPageStep(TestContext context)
	{
		testcontext = context;
	}

	
	
	@When("enter quantity {string} and click on add to cart")
	public void enter_quantity_and_click_on_add_to_cart(String string) {
		productdetailpage_obj = testcontext.getPageObjectManager().getProductDetailPage();
		productdetailpage_obj.clickOnAddToCartButton();	    
	}
}
