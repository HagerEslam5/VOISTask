package standAlonwTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullCode {
	WebDriver driver;

	@Test
	public void f() {
	}

	@Test
	public void test() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")).click();

		// Choosing the arrival date dates
		driver.findElement(By.xpath("//tbody/tr[4]/td[3]")).click();
		// Click search for bus
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-booking")));
		driver.findElement(By.cssSelector(".btn-booking")).click();
		// SelectSeat
		js.executeScript("arguments[0].click();", driver.findElement(By.id("SrvcSelectBtnForward0")));

		// SeatLocation
		Actions a = new Actions(driver);
		// SeatLocation
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		js.executeScript("arguments[0].click();", driver.findElement(By.id("Forward40")));
		// broadingPoint
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		js.executeScript("arguments[0].click();", driver.findElement(By.id("Forward-1467469338690")));
		// DroppingPoint
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		js.executeScript("arguments[0].click();", driver.findElement(By.id("Forward-1467467616730")));

		// Customer Details
		driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("6789125987");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ahmed4@yahoo.com");
		// Passenger Details
		driver.findElement(By.xpath("//input[@name='passengerName']")).sendKeys("Ahmed");
		// Gender dropdown
		WebElement DropDownG = driver.findElement(By.id("genderCodeIdForward0"));
		Select genderDropDown = new Select(DropDownG);
		genderDropDown.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='passengerAge']")).sendKeys("20");

		// concessionDropDown
		js.executeScript("window.scrollBy(0, 250)");
		WebElement DropDownc = driver.findElement(By.id("concessionIdsForward0"));
		wait.until(ExpectedConditions.elementToBeClickable(DropDownc));
		Select concessionDropDown = new Select(DropDownc);
		concessionDropDown.selectByIndex(1);
		// checkox
		js.executeScript("window.scrollBy(0, 250)");
		driver.findElement(By.id("termsChk")).click();

		driver.findElement(By.id("PgBtn")).click();

		WebElement checkoutFrame = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		wait.until(ExpectedConditions.visibilityOf(checkoutFrame));
		driver.switchTo().frame(checkoutFrame);
		driver.findElement(By.xpath("//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div[2]/div/button[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"form-wallet\"]/div[1]/div/div/button[2]")).click();
	}

	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterClass
	public void closeBrowser() {
		// driver.close();
	}

}
