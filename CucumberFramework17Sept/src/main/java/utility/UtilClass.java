package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UtilClass {
	
	private WebDriver driver;
	public UtilClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectOptionDropdown(WebElement ref_web,String option_text)
	{
		Select s = new Select(ref_web);
		s.selectByVisibleText(option_text);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}

}
