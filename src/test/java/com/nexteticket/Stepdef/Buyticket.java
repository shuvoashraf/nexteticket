package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.BuyticketPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buyticket {

	
	
	WebDriver driver;
	
	@Given("^User visit nexteticket Homepage$")
	public void user_visit_nexteticket_Homepage() throws Throwable {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			driver.get("https://nexteticket.com/");
			
			
			
			driver.manage().window().maximize();
			}
			catch(Exception e) {
				System.out.println("Browser not opening");
			}
	    
	}

	@When("^user scrool down and click on  buy ticket Button$")
	public void user_scrool_down_and_click_on_buy_ticket_Button() throws Throwable {
	    try {
		BuyticketPOM obj=new BuyticketPOM (driver);
		obj.buyticket().click();
		Thread.sleep(3000);
		
		obj.earlyBird_Buyticket.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		obj.regular_Buyticket.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		obj.platinum_Buyticket.click();
		Thread.sleep(3000);
		
		
		
	    }
	    catch(Exception e) {
	    	System.out.println("element not visible");
	    }
	}
	@Then("^User able to se the Ticket Price Details \\.$")
	public void user_able_to_se_the_Ticket_Price_Details() throws Throwable {
	}
}
