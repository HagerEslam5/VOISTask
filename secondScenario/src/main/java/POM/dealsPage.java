package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dealsPage extends basePage {
	public dealsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	public void scrollBy(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,x)");
	}

	@FindBy(xpath = "//span[text()='Grocery & Gourmet Food']")
	WebElement Grocery;

	@FindBy(xpath = "//span[text()='Headphones & Earbuds']")
	WebElement Headphones;

	public void filterItems() {
		Grocery.click();
		Headphones.click();
	}

	@FindBy(partialLinkText = "10% off or more")
	WebElement discount;

	public void chooseDiscount() {
		discount.click();
	}

	@FindBy(css = ".a-text-center")
	WebElement pagesBox;

	public void ScrollToPagesBar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(".a-text-center")));
	}

	public void ClickFourth() {
		pagesBox.findElement(By.partialLinkText("4")).click();

	}

}
