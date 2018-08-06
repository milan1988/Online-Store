package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Logout extends PageObject {

	public Logout(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"wp-admin-bar-my-account\"]/a/span")
	WebElement userBtn;

	@FindBy(css = "#wp-admin-bar-logout > a")
	WebElement logoutBtn;

	@FindBy(className = "message")
	WebElement successLogoutMsg;

	public void logOut() {

		Actions builder = new Actions(driver);
		Action mouseOverUsername = builder.moveToElement(userBtn).build();
		mouseOverUsername.perform();

		wait.until(ExpectedConditions.visibilityOf(logoutBtn));
		logoutBtn.click();
	}

	public String checkLogout() {
		wait.until(ExpectedConditions.visibilityOf(successLogoutMsg));
		return successLogoutMsg.getText();
	}

}
