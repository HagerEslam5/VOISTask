package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	By searchBox;

	public void searchBy(String itemTitle) {
		waitForElement(driver, searchBox);
		sendKey(driver, searchBox, itemTitle);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(searchBox)).keyDown(Keys.ENTER).build().perform();
	}

}
