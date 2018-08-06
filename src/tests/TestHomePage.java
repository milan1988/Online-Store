package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class TestHomePage extends testNG {

	HomePage homepage;

	@Test(priority = 0)

	public void checkPointRight() {

		driver.get("http://store.demoqa.com");
		homepage = new HomePage(driver);
		homepage.clickOnPointRight();
		Assert.assertEquals(homepage.isTextRightPresent(), "iPod Nano Blue");

	}

	@Test(priority = 1)

	public void checkPointMiddle() {

		homepage = new HomePage(driver);
		homepage.clickOnPointMiddle();
		Assert.assertEquals(homepage.isTextMiddlePresent(), "iPhone 5");
	}

	@Test(priority = 2)

	public void checkPointLeft() {

		homepage = new HomePage(driver);
		homepage.clickOnPointLeft();
		Assert.assertEquals(homepage.isTextLeftPresent(), "Magic Mouse");
	}

}
