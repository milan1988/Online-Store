package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductCategory;

public class TestProductCategory extends testNG {

	HomePage homepage;
	ProductCategory productcategory;

	@Test(priority = 3)

	public void checkText() {
		homepage = new HomePage(driver);
		productcategory = new ProductCategory(driver);
		productcategory.buyiMacs();
		Assert.assertEquals(productcategory.isTextAt(), "Item has been added to your cart!");
	}

	@Test(priority = 4)

	public void checkText2() {
		homepage = new HomePage(driver);
		productcategory = new ProductCategory(driver);
		productcategory.buyiPhone();
		Assert.assertEquals(productcategory.isText2At(), "Item has been added to your cart!");

	}

	@Test(priority = 5)

	public void checkFullShopping() {
		homepage = new HomePage(driver);
		productcategory = new ProductCategory(driver);
		Assert.assertTrue(productcategory.isItemsAt());

	}
}
