package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\\\"routeSlider\\\"]/div/div[2]/div/div/ul/li[1]/a")
	By destination;

	public void selectDestination() {
		scrollWindow(driver);
		waitForElementToBeClickable(driver, destination);
		clickOnElement(driver, destination);
	}

	@FindBy(xpath = "//tbody/tr[4]/td[3]")
	By arrivalDate;

	public void selectArrivalDate() {

		// Choosing the arrival date dates
		clickOnElement(driver, arrivalDate);
	}

	@FindBy(css = ".btn-booking")
	By searchBtn;

	public void searchForBus() {
		waitForElementToBeClickable(driver, searchBtn);
		clickOnElement(driver, searchBtn);
	}

}
