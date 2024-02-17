package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class baseTest {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	

	

}


