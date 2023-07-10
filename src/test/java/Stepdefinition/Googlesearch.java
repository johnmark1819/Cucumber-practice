package Stepdefinition;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearch {
	WebDriver driver;
	@Given("open an browser")
	public void open_an_browser() {
	driver = new ChromeDriver();
	
	}

	@Given("load the url")
	public void load_the_url() {
	     driver.get("https://www.google.co.in/");
	}

	@When("In the textbox provide iphone has input and press enter key")
	public void in_the_textbox_provide_iphone_has_input_and_press_enter_key() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("APjFqb")).sendKeys("iphone",Keys.ENTER);
	    
	}
	@When("close")
	public void close() {
	   driver.close();
	   }

	@Then("verify the results")
	public void verify_the_results() {
	  // String title= driver.getTitle();
	  // System.out.println(title);
	}

}
