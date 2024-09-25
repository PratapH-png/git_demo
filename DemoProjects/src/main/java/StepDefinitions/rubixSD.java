package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rubixSD {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		// Assuming you're using ChromeDriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\DemoProjects\\src\\test\\java\\Drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("the user launches the application")
	public void the_user_launches_the_application() {
		driver.get("https://rubixe.com/"); // Replace with actual URL
	}

	@And("the application should open successfully on the respective platform")
	public void the_application_should_open_successfully_on_the_respective_platform() {
		// Verify that the home page is loaded
		String pageTitle = driver.getTitle();
		assert pageTitle.contains("https://rubixe.com/"); // Adjust based on actual title
	}
	@And("a user clicks on the {string} module")
	public void a_user_clicks_on_the_module(String moduleName) throws Exception {
		Thread.sleep(20000);
		WebElement moduleLink = driver.findElement(By.linkText("AI INTERNSHIP "));
		moduleLink.click();
		 // Verify if the user clicks on the AI INTERNSHIP module, check for the drop-down menu
	    if(moduleName.equals("AI INTERNSHIP")) {
	        // Locate the drop-down menu
	    	// Replace with the actual ID of the drop-down element
	        WebElement dropdownMenu = driver.findElement(By.xpath("//a[normalize-space()='AI INTERNSHIP']"));  

	        // Check if the drop-down is displayed
	        if(dropdownMenu.isDisplayed()) {
	            System.out.println("Drop-down menu is displayed with relevant contents.");
	        } else {
	            throw new Exception("Drop-down menu did not appear for AI INTERNSHIP module.");
	        }
	    }

	    // Add assertions or validations to check if the user is navigated to the correct page for other modules
	    String currentUrl = driver.getCurrentUrl();
	    if(currentUrl.contains(moduleName.toLowerCase())) {
	        System.out.println("Successfully navigated to the " + moduleName + " page.");
	    } else {
	        throw new Exception("Navigation to " + moduleName + " page failed.");
	    }

	}

	@And("the drop-down menu should appear, displaying all relevant contents")
	public void the_drop_down_menu_should_appear_displaying_all_relevant_contents() throws Exception {
		Thread.sleep(2000);
		 // Adjust with actual ID or selector
		WebElement dropdownMenu = driver.findElement(By.xpath("//a[normalize-space()='AI INTERNSHIP']"));
		assert dropdownMenu.isDisplayed();
	}

	@And("clicking on any item in the drop-down menu")
	public void clicking_on_any_item_in_the_drop_down_menu() throws Exception {
		Thread.sleep(2000);
		// Adjust with actual item name
		WebElement dropdownItem = driver.findElement(By.xpath("//a[normalize-space()='INCUBATION CENTER']")); 
		dropdownItem.click();
	}

	@And("a user clicks on the back button or the logo")
	public void a_user_clicks_on_the_back_button_or_the_logo() throws Exception {
		Thread.sleep(2000);
		// Adjust with actual logo ID or selector
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Rubixe Logo']")); 
		logo.click();
		// Or alternatively, use browser back
		// driver.navigate().back();
	}

	@And("a user enters their name, email address, and mobile number into the fields on the {string} page and clicks the {string} button")
	public void a_user_enters_their_name_email_address_and_mobile_number_into_the_fields_on_the_contact_us_page_and_clicks_the_send_message_button(
			String page, String button) throws Exception {
		Thread.sleep(2000);
		WebElement nameField = driver.findElement(By.id("senderName"));
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement mobileField = driver.findElement(By.id("mobileNumber"));

		nameField.sendKeys("John Doe");
		emailField.sendKeys("john.doe@example.com");
		mobileField.sendKeys("1234567890");

		WebElement sendMessageButton = driver.findElement(By.xpath("//textarea[@id='messageBox']"));
		sendMessageButton.click();
	}

	@Then("the information should be submitted successfully")
	public void the_information_should_be_submitted_successfully() throws Exception {
		Thread.sleep(2000);
		// Wait and verify that the form was successfully submitted (e.g., with a success message)
		// Adjust with actual ID or selector
		WebElement successMessage = driver.findElement(By.xpath("//button[@id='sendMessage']")); 
		assert successMessage.isDisplayed();

		Thread.sleep(2000);
		driver.close();
	}
}