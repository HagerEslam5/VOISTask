package test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.basePage;
import pages.homePage;
import pages.seatPage;
import pages.paymentPage;

public class testCases extends baseTest {
	WebDriver driver;
	basePage base;
	homePage home= new homePage(driver);
	seatPage seat= new seatPage(driver);
	paymentPage payment = new paymentPage(driver);


	@Test
	public void testHomePage() {
		home.selectDestination();
		home.selectArrivalDate();
		home.searchForBus();
	}
@Test
	public void testseatSelection() {
		seat.selectSeat();
		seat.selectBroadingPoint();
		seat.selectDroppingPoint();
	}
	@Test(dataProvider="testData")
	public void enterDetails(String mobile,String email,String name,String age) {
		seat.enterDetails(mobile,email,name,age);
	}	
		@Test
	public void confirmPayment(){
		seat.makePayment();
	}

	@Test
	public void TestCheckout() {

		payment.checkout();
	}
	@DataProvider
	public String[][] testData()throws InvalidFormatException, IOException{
		readExcelData obj=new readExcelData();
		return obj.readSheet();
	}
}
