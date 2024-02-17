package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage extends basePage {

	public searchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-component-type='s-search-result'][1]")
	By firstProduct;

	public void GetFirstProduct() {
		waitForElement(driver, firstProduct);
		driver.findElement(firstProduct).click();
	}

}
