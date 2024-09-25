package Automate.project;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logger {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("logger");
		
		PropertyConfigurator.configure("C:\\Users\\Admin\\eclipse-workspace\\project\\Repository\\log4j.properties");

		WebDriver driver = new ChromeDriver();
		logger.info("Chrome browser instance opened");

		driver.manage().window().maximize();
		logger.info("Window Maximized");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicitwait given");

		driver.get("https://www.facebook.com/");
		logger.info("Application opened");

		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element is displayed");
		} catch (Exception e) {
			logger.info("Failure - 'emails' web element is not displayed");
		}

	}

}
