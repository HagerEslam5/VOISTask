package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	protected WebDriver driver;
	//constructor
		public basePage(WebDriver driver) {
			this.driver=driver;
		}
		public void waitForElementToBeClickable(By findBy) {
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
			w.until(ExpectedConditions.elementToBeClickable(findBy));
		}
}
