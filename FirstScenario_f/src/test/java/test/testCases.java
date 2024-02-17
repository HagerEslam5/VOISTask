package test;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.cartPage;
import pages.homePage;
import pages.itemPage;
import pages.orderStatusPage;
import pages.searchPage;

//private HomePage homePage;

public class testCases extends testBase {
	WebDriver driver;
	homePage home = new homePage(driver);
	searchPage search = new searchPage(driver);
	itemPage item = new itemPage(driver);
	orderStatusPage status = new orderStatusPage(driver);
	cartPage cart = new cartPage(driver);

	@Test
	public int GetCartSizaBefore() {
		cart.openCartPage();
		int NumBefore = cart.getNumOfCartItems();
		return NumBefore;
	}

	@Test
	public void testSearch() {
		home.searchBy("car accessories");
	}

	@Test
	public void testAddItem() {
		item.addToCart();
	}

	@Test
	public void testOrderStatus() {
		// Assertion
		Assert.assertEquals(status.GetDisplayedMessage(), "Added to Cart");
	}

	@Test
	public void GetCartSizaAfter() {
		cart.openCartPage();
		int NumBefore = cart.getNumOfCartItems();
		// Assertion
		Assert.assertNotEquals(NumBefore, NumBefore);
	}

}