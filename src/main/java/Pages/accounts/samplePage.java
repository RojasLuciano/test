package Pages.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;


public class samplePage extends BasePage {
	 
	String url =  "http://demo.guru99.com/V4/"; 

	public samplePage(WebDriver driver) {
		super(driver);
	}

	public String login_ok(String user, String pass) {
		driver.get(url);
		FindWebElementBy_name("uid").sendKeys(user);
		FindWebElementBy_name("password").sendKeys(pass);
		FindWebElementBy_name("btnLogin").click();
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}

	public String login_fail(String user, String pass) {
		driver.get(url);
		FindWebElementBy_name("uid").sendKeys(user);
		FindWebElementBy_name("password").sendKeys(pass);
		
		FindWebElementBy_name("btnLogin").click();
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}
}