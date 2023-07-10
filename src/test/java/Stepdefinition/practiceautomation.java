package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practiceautomation {
WebDriver driver;
@Given("open a chrome browser")
public void open_a_chrome_browser() {
    driver = new ChromeDriver();
    
}
@When("load a url")
public void load_a_url() {
	driver.get("https://practicetestautomation.com/practice-test-login/");  
}

@When("provide student and Password123 in text fields")
public void provide_student_and_password123_in_text_fields() {
    driver.findElement(By.name("username")).sendKeys("student");
    driver.findElement(By.name("password")).sendKeys("Password123");
}

@When("click submit button")
public void click_submit_button() {
	driver.findElement(By.id("submit")).click();
    
}

@Then("verify the outcome")
public void verify_the_outcome() {
  String title=driver.getTitle();
  System.out.println("Title:"+title);
}

@When("provide teacher and Password1 in text fields")
public void provide_teacher_and_password1_in_text_fields() {
	driver.findElement(By.name("username")).sendKeys("student");
    driver.findElement(By.name("password")).sendKeys("Password123");
}

}
