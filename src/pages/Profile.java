package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Profile extends PageObject {

	public Profile(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "input[id='first_name']")
	WebElement firstName;

	@FindBy(css = "input[id='last_name']")
	WebElement lastName;

	@FindBy(xpath="//*[@id='submit']")
	WebElement updateProfileBtn;

	@FindBy(xpath = "//*[@id=\"message\"]/p/strong")
	WebElement successMsg;

	public void fillInputs() {
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.clear();
		firstName.sendKeys("Milan");
		wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName.clear();
		lastName.sendKeys("Vunjak");
		wait.until(ExpectedConditions.visibilityOf(updateProfileBtn));
		updateProfileBtn.click();
	}

	public String updateProfile()  {

		wait.until(ExpectedConditions.visibilityOf(successMsg));
		return successMsg.getText();

	}
}
