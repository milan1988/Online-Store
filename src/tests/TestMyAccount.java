package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Checkout;
import pages.MyAccount;

public class TestMyAccount extends testNG {

	Checkout checkout;
	MyAccount myaccount;

	@Test(priority = 7)

	public void checkIsProfileUpdated() {
		checkout = new Checkout(driver);
		myaccount = new MyAccount(driver);
		myaccount.goToLogin();
		Assert.assertEquals(myaccount.checkLogin(), "(Logout)");
	}
}
