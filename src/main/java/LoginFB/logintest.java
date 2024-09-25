package LoginFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LoginFB.login;

public class logintest {
	WebDriver driver;
	
	@BeforeClass
	public void set() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\TestNG\\src\\test\\java\\Drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test
	public void testLogin() throws Exception {
		login p1 = new login(driver);
		Thread.sleep(2000);
		p1.setUsername("miss@gmail.com");
		p1.setPassword("12345678");
		p1.clickLogin();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
