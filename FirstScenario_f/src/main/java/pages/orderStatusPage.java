package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderStatusPage extends basePage {

	public orderStatusPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold")
	By message;

	public String GetDisplayedMessage() {
		waitForElement(driver, message);
		String Actualmessage = driver.findElement(message).getText();
		return Actualmessage;

	}
}
