package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Checkout extends PageObject {

	public Checkout(WebDriver driver) {
		super(driver);

	}

	@FindBy(className = "cart_icon")
	WebElement checkoutBtn;

	@FindBy(xpath = "//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[3]/td[3]/form/input[1]")
	WebElement quantity;

	@FindBy(xpath = "//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[3]/td[3]/form/input[4]")
	WebElement updateBtn;

	@FindBy(xpath = "//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[3]/td[5]/span/span")
	WebElement checkUpdatedPrice;

	@FindBy(xpath = "//*[@id=\"checkout_page_container\"]/div[1]/table/tbody/tr[3]/td[6]/form/input[4]")
	WebElement removeBtn;

	@FindBy(xpath = "//*[@id=\"checkout_page_container\"]/div[1]/span/span")
	WebElement checkSubTotalPrice;

	public void addOneMoreiPhone() {
		checkoutBtn.click();
		quantity.clear();
		quantity.sendKeys("2");
		updateBtn.click();
	}

	public String checkPrice() {
		wait.until(ExpectedConditions.visibilityOf(checkUpdatedPrice));
		return checkUpdatedPrice.getText();

	}

	public void remove2iPhones() {
		removeBtn.click();
	}

	public String checkSubTotal() {
		wait.until(ExpectedConditions.visibilityOf(checkSubTotalPrice));
		return checkSubTotalPrice.getText();
	}

}
