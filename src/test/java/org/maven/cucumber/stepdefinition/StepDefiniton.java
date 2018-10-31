package org.maven.cucumber.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.maven.cucumber.FacebookCucumber.LogInPage;
import org.maven.cucumber.baseclass.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton {
	 WebDriver driver;
	LogInPage login=new LogInPage(driver);
	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\FacebookCucumber\\driver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	     //Write code here that turns the phrase above into concrete actions
		//getDriver("chrome");
   
	}
	@When("^user enter the url$")
	public void user_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.get("https://www.facebook.com/");
	}
	
	@When("^user enter name \"([^\"]*)\"$")
	public void user_enter_name(String arg1) throws Throwable {
		System.out.println(arg1);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
		
		//setText(login.getEmail(), arg1);
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String arg1) throws Throwable {
		System.out.println(arg1);
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1);
		

	}

	@When("^user click the login button \"([^\"]*)\"$")
	public void user_close_the_browser() throws Throwable {
		WebElement element = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element.click();
		
		
	}
	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
