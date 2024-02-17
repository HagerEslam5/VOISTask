package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends basePage {

	public cartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "nav-cart-text-container")
	WebElement cartIcon;

	public void openCartPage() {
		waitForElement(driver, By.id("nav-cart-text-container"));
		cartIcon.click();

	}

	@FindBy(css = ".a-row.sc-list-item.sc-java-remote-feature")
	List<WebElement> cartItems;

	public int getNumOfCartItems() {
		int cartSize = cartItems.size();
		return cartSize;

	}
}
