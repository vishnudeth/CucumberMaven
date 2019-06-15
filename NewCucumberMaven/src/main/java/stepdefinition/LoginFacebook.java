package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class LoginFacebook {

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

	}

	@When("^title of the login page is facebook login$")
	public void title_of_login_page() {
		System.out.println(driver.getTitle());

	}

	@Then("^user enters username and password$")
	public void usernameAndPassword() {
		driver.findElement(By.id("email")).sendKeys("Deth18");
		driver.findElement(By.id("pass")).sendKeys("Silpa143#");

	}

	@Then("^user clicks submit button$")
	public void submitButton() {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^user enters to home page$")
	public void homepage() {
		System.out.println(driver.getTitle());
	}

}
