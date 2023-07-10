package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ASUS1\\eclipse-workspace\\cucumber\\Cucumberpractice\\Features\\practice.feature",
glue ="Stepdefinition",
plugin="pretty",

dryRun=false,
monochrome=true)
//html:target/Reports/cucumber-html-report1.html--suppose html not woking we use this syntax
public class Runner {

}
