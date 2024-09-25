package LoginFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class login {
	WebDriver driver;

	//@FindBy(id = "email")
	@FindBy(xpath="//input[@id='email']")
	WebElement emailField;

	@FindBy(id = "pass")
	WebElement passwordField;

	@FindBy(id = "loginbutton")
	WebElement loginButton;

	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String email) {
		emailField.sendKeys(email);
	}

	public void setPassword(String pass) {
		passwordField.sendKeys(pass);
	}

	public void clickLogin() {
		loginButton.click();
	}

}
