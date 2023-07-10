package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchinput {
	  WebDriver driver;
	@Given("open the chromebrowser")
	public void open_the_chromebrowser() {
	 
	   driver=new ChromeDriver();
	}

	@Given("load the urlofchrome")
	public void load_the_urlofchrome() {
	    driver.get("https://www.google.co.in/");
	}

	@When("provide the input as {string} and click enter")
	public void provide_the_input_as_and_click_enter(String v) {
	    driver.findElement(By.id("APjFqb")).sendKeys(v,Keys.ENTER);
	}

	@Then("quit")
	public void quit() {
	  driver.quit();
	}

}
