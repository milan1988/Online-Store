package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccount extends PageObject {

	public MyAccount(WebDriver driver) {
		super(driver);

	}

	@FindBy(className = "account_icon")
	WebElement myAccount;

	@FindBy(css = "input[name='log']")
	WebElement username;

	@FindBy(css = "input[name='pwd']")
	WebElement pass;

	@FindBy(css = "input[id='login']")
	WebElement login;

	@FindBy(css = "a[title='Logout']")
	WebElement checkTextLogout;

	public void goToLogin() {
		myAccount.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.clear();
		username.sendKeys("milanvunjak88@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(pass));
		pass.clear();
		pass.sendKeys(")ASEX@#*g9HOENPw");
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}

	public String checkLogin() {

		wait.until(ExpectedConditions.visibilityOf(checkTextLogout));
		return checkTextLogout.getText();

	}

}
