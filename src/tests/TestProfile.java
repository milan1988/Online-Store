package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Profile;

public class TestProfile extends testNG {

	Dashboard dashboard;
	Profile profile;

	@Test(priority = 9)

	public void checkUpdate()  {
		dashboard = new Dashboard(driver);
		profile = new Profile(driver);
		profile.fillInputs();
		Assert.assertEquals(profile.updateProfile(), "Profile updated.");

	}
}
