package com.nexteticket.Stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.nexteticket.Pageobjectmodel.TicketInfoPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TicketInfo {
	
	
	WebDriver driver;
	
	@Given("^Users visits nexteticket homepage$")
	public void users_visits_nexteticket_homepage() throws Throwable {
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

	@When("^User scroll all way down of the homepage$")
	public void user_scroll_all_way_down_of_the_homepage() throws Throwable {
		try {
		
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,7700)","" );
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
         File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 Files.copy(f,new File("C:\\Users\\ashra\\OneDrive\\TicketinfoScreenshot.jpg"));
		
		 
		
		}
		catch(Exception e) {
			System.out.println("element not visible");
		}
		
	}

	
	@Then("^User able to see the Name,Phone and Email under Ticket Info Button\\.$")
	public void user_able_to_see_the_Name_Phone_and_Email_under_Ticket_Info_Button() throws Throwable {
		
		try {
			TicketInfoPOM obj=new TicketInfoPOM(driver);
			
			
		    System.out.println(obj.TicketInfo.getText());
		    
		   
		    
		    
		 
		 
				
				WebDriverWait Wait=new WebDriverWait(driver,30);
				}
				catch(Exception e) {
					System.out.println("element not found");
				}
		}
	}


