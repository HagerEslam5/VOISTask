package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class itemPage extends basePage {

	public itemPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "add-to-cart-button")
	WebElement addToCartBtn;

	public void addToCart() {
		addToCartBtn.click();
	}
}
