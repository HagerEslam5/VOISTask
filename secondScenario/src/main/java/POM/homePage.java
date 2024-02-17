package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends basePage{
	WebDriver driver;

	// Create Constructor
	public homePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Today's Deals")
	By deals;
	public void clickTodaysDeals() {
		// Explicit wait until handling CAPTCHA manually
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Today's Deals"))).click();
	}
	
	
	

}
