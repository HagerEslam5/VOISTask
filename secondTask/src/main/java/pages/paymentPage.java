package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paymentPage extends basePage {

	public paymentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
	WebElement checkoutFrame;

	@FindBy(xpath = "//*[@id=\\\"form-common\\\"]/div[1]/div[1]/div/div/div[2]/div/button[4]/div")
	By walletOption;

	@FindBy(xpath = "//*[@id=\\\"form-wallet\\\"]/div[1]/div/div/button[2]")
	By amazonPay;

	public void checkout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(checkoutFrame));
		driver.switchTo().frame(checkoutFrame);
		clickOnElement(driver, walletOption);
		clickOnElement(driver, amazonPay);
	}

}
