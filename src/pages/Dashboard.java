package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dashboard extends PageObject {

	public Dashboard(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"meta\"]/ul/li[1]/a")
	WebElement siteAdmin;

	@FindBy(xpath = "//*[@id=\"menu-users\"]/a/div[3]")
	WebElement profileBtn;

	@FindBy(className = "wp-heading-inline")
	WebElement profile;

	public void goToProfile() {
		wait.until(ExpectedConditions.visibilityOf(siteAdmin));
		siteAdmin.click();
		wait.until(ExpectedConditions.visibilityOf(profileBtn));
		profileBtn.click();

	}

	public String isProfileAt() {
		wait.until(ExpectedConditions.visibilityOf(profile));
		return profile.getText();
	}

}
