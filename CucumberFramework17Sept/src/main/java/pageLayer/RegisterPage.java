package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {


	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//--------------Obj repo ---------------------
	private By firstname_txtbox = By.xpath("//input[@id='input-firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='input-lastname']");
	private By email_txtbox = By.xpath("//input[@id='input-email']");
	private By telephone_txtbox = By.xpath("//input[@id='input-telephone']");
	private By password_txtbox = By.xpath("//input[@id='input-password']");
	private By confirmpassword_txtbox = By.xpath("//input[@id='input-confirm']");
	private By privacypolicy_checkbox = By.xpath("//input[@name='agree']");
	private By continue_button = By.xpath("//input[@value='Continue']");
	
	
	//------------ Action methods---------------------
	public void enterFirstName(String firstname)
	{
		driver.findElement(firstname_txtbox).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		driver.findElement(lastname_txtbox).sendKeys(lastname);
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(email_txtbox).sendKeys(email);
	}
	
	public void enterTelephone(String tele)
	{
		driver.findElement(telephone_txtbox).sendKeys(tele);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void enterConfirmPassword(String con_pass)
	{
		driver.findElement(confirmpassword_txtbox).sendKeys(con_pass);
	}
	
	public void clickOnPrivacyCheckbox()
	{
		driver.findElement(privacypolicy_checkbox).click();
	}
	public void clickOnContinueButton()
	{
		driver.findElement(continue_button).click();
	}
}
