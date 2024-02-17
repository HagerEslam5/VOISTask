package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fourthPage extends basePage {
	WebDriver driver;
	public fourthPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".DealCard-module__card_1u9yKYV4EIA-fL4ibeMVIU")
	WebElement item;

	public void selectItem() {
		item.click();
	}
}
