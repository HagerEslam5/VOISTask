package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

	protected WebDriver driver;

	public basePage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForElementToBeClickable(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void scrollWindow(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	}

	public void clickOnElement(WebDriver driver, By locator) {
		driver.findElement(locator);

	}

	public void sendKey(WebDriver driver, By locator, String text) {
		driver.findElement(locator).sendKeys(text);

	}

	public void page_down(WebDriver driver) {

		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();

	}

	public void executeScript(WebDriver driver, By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(locator));

	}

}
