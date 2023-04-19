package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ReadConfig;

public class WebDriverManager {

	private ReadConfig read_config;
	private WebDriver driver;
	
	
	public WebDriverManager()
	{
		read_config = new ReadConfig();
		
	}
	
	private WebDriver createDriver()
	{
		String browser_name = read_config.getBrowserName();
		
		if(browser_name.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Please provide correct browser name");
		}
		
		driver.get(read_config.getApplicationUrl());
		
		return driver;
	}
	
	
	public WebDriver getDriver()
	{
		if(driver == null)
		{
			driver = createDriver();
		}
		return driver;
	}
	
}
