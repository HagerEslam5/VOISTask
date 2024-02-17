package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class seatPage extends basePage {

	public seatPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "SrvcSelectBtnForward0")
	By seatBtn;
	@FindBy(id = "Forward40")
	By seatLocation;

	public void selectSeat() {
		executeScript(driver, seatBtn);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		executeScript(driver, seatLocation);
	}

	@FindBy(id = "Forward-1467469338690")
	By BroadingPoint;

	public void selectBroadingPoint() {
		page_down(driver);
	}

	@FindBy(id = "Forward-1467467616730")
	By DroppingPoint;

	public void selectDroppingPoint() {
		page_down(driver);
		executeScript(driver, DroppingPoint);
	}

	@FindBy(xpath = "//input[@name='mobileNo']")
	By mobileNum;
	@FindBy(xpath = "//input[@name='email']")
	By email;
	@FindBy(xpath = "//input[@name='passengerName']")
	By passName;
	@FindBy(id = "concessionIdsForward0")
	By concessionDrop;
	@FindBy(id = "genderCodeIdForward0")
	By genderDrop;
	@FindBy(xpath = "//input[@name='passengerAge']")
	By passAge;

	public void enterDetails(String mobile, String email,String passengerName,String age) {
		sendKey(driver, mobileNum, mobile);
		sendKey(driver, mobileNum,  email);
	
		// name
		sendKey(driver, passName, passengerName);
		// Gender
		WebElement DropDownG = driver.findElement(genderDrop);
		Select genderDropDown = new Select(DropDownG);
		genderDropDown.selectByIndex(1);
		// age
		driver.findElement(passAge).sendKeys(age);

		// concessionDropDown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		WebElement DropDownc = driver.findElement(concessionDrop);
		waitForElementToBeClickable(driver, concessionDrop);
		Select concessionDropDown = new Select(DropDownc);
		concessionDropDown.selectByIndex(1);

	}

	@FindBy(id = "termsChk")
	By checkBox;
	@FindBy(id = "PgBtn")
	By submitBtn;

	public void makePayment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		clickOnElement(driver, checkBox);
		clickOnElement(driver, submitBtn);
	}
}
