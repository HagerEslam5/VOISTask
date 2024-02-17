package test;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testBase {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}