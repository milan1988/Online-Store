package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Logout;

public class TestLogout extends testNG {

	@Test(priority = 10)

	public void checkWasLogoutSuccessful() {
		Logout logout = new Logout(driver);
		logout.logOut();
		Assert.assertEquals(logout.checkLogout(), "You are now logged out.");

	}
}
