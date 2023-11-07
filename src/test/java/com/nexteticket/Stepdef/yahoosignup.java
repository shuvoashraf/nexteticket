package com.nexteticket.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.yahooSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class yahoosignup {
	WebDriver driver;
	
	@Given("^User visits Yahoo homepage$")
	public void user_visits_Yahoo_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");
	}

	@When("^User type \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and_and(String arg1, String arg2, String arg3) throws Throwable {
	    
		yahooSignupPOM obj=new yahooSignupPOM(driver);
		obj.fullname().sendKeys(arg1);
		obj.email().sendKeys(arg2);
		obj.password().sendKeys(arg3);
	}

	@Then("^User Select dropdown Month and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Select_dropdown_Month_and_and(String arg1, String arg2) throws Throwable {
		try {
		yahooSignupPOM obj=new yahooSignupPOM(driver);
		Select drop=new Select(obj.month());
		drop.selectByVisibleText("February");
		
		obj.Day().sendKeys(arg1);
		obj.Year().sendKeys(arg2);
		WebDriverWait wait=new WebDriverWait(driver,20);
		}
		catch(Exception e) {
			System.out.println("element not found");
		}   
	}
}
