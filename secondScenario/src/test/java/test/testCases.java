package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.homePage;
import POM.dealsPage;
import POM.fourthPage;

public class testCases extends testBase {
	homePage home;
	dealsPage deals;
	fourthPage fourthPage;
	WebDriver driver;

	@Test
	public void testFiltering() {
		home = new homePage(driver);
		deals = new dealsPage(driver);
		home.clickTodaysDeals();
		deals.scrollBy(0, 1500);
		deals.filterItems();
		deals.scrollBy(0, 1200);
		deals.chooseDiscount();
		deals.ScrollToPagesBar();
	}

	@Test
	public void testFourthPage() {
		deals = new dealsPage(driver);
		fourthPage = new fourthPage(driver);
		deals.ClickFourth();
		fourthPage.selectItem();

	}

}
