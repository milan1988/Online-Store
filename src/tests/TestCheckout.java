package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Checkout;
import pages.ProductCategory;

public class TestCheckout extends testNG {

	ProductCategory productcategory;
	Checkout checkout;

	@Test(priority = 6)

	public void checkUpdateAndRemoveBtn() {
		productcategory = new ProductCategory(driver);
		checkout = new Checkout(driver);
		checkout.addOneMoreiPhone();
		Assert.assertEquals(checkout.checkPrice(), "$540.00");
		checkout.remove2iPhones();
		Assert.assertEquals(checkout.checkSubTotal(), "$150.00");
	}

}
