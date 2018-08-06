package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.MyAccount;

public class TestDashboard extends testNG {
	MyAccount myaccount;
	Dashboard dashboard;

	@Test(priority = 8)

	public void checkProfileText() {
		myaccount = new MyAccount(driver);
		dashboard = new Dashboard(driver);
		dashboard.goToProfile();
		Assert.assertEquals(dashboard.isProfileAt(), "Profile");
	}
}
