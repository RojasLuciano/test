package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass 
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "res\\geckodriver.exe");
		driver = new EventFiringWebDriver(new FirefoxDriver(getChromeOptions()));
	}
	private FirefoxOptions getChromeOptions() {
	FirefoxOptions options = new FirefoxOptions();
	// options.addArguments("disable-infobars");
	options.setHeadless(true);
	return options;
	}
	@AfterClass
	public void tearDown() {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.quit();		
	}
	

}
 