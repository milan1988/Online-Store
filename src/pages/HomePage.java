package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"slide_menu\"]/a[1]")
	WebElement pointLeft;

	@FindBy(xpath = "//*[@id=\"slides\"]/div[1]/div[1]/h2")
	WebElement textLeft;

	@FindBy(xpath = "//*[@id=\"slide_menu\"]/a[2]")
	WebElement pointMiddle;

	@FindBy(css = "#slides > div:nth-child(1) > div.product_description > h2")
	WebElement textMiddle;

	@FindBy(xpath = "//*[@id=\"slide_menu\"]/a[3]")
	WebElement pointRight;

	@FindBy(css = "#slides > div:nth-child(1) > div.product_description > h2")
	WebElement textRight;

	public void clickOnPointLeft() {
		wait.until(ExpectedConditions.visibilityOf(pointLeft));
		pointLeft.click();

	}

	public String isTextLeftPresent() {
		wait.until(ExpectedConditions.visibilityOf(textLeft));
		return textLeft.getText();

	}

	public void clickOnPointMiddle() {
		wait.until(ExpectedConditions.visibilityOf(pointMiddle));
		pointMiddle.click();

	}

	public String isTextMiddlePresent() {
		wait.until(ExpectedConditions.visibilityOf(textMiddle));
		return textMiddle.getText();

	}

	public void clickOnPointRight() {
		wait.until(ExpectedConditions.visibilityOf(pointRight));
		pointRight.click();

	}

	public String isTextRightPresent() {
		wait.until(ExpectedConditions.visibilityOf(textRight));
		return textRight.getText();

	}

}
