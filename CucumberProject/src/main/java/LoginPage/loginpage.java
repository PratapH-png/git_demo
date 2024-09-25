package LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	WebDriver driver;

	public void openURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}

	public void enterUsername() {
		driver.findElement(By.id("email")).sendKeys("missu@gmail.com");
	}

	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("123abc");
	}

	public void clickLoginButton() {
		System.out.println("Login Button Clicked");
	}

	public void verifyLogin() {
		System.out.println("Verified Login");
	}
}
