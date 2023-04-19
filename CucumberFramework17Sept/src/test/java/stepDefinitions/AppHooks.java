package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.TestContext;

public class AppHooks {

	private TestContext testcontext;
	public AppHooks(TestContext context)
	{
		testcontext = context;
	}
	
	@Before
	public void setUp()
	{
		WebDriver driver = testcontext.getWebDriverManager().getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@After
	public void tearDown()
	{
		testcontext.getWebDriverManager().getDriver().quit();
	}
	
	
	
	
}
