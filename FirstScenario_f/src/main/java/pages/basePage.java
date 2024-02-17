package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

	WebDriver driver;

	// constructor
	public basePage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendKey(WebDriver driver, By locator, String text) {
		driver.findElement(locator).sendKeys(text);

	}
}
