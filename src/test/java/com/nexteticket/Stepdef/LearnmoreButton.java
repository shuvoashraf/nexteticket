package com.nexteticket.Stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.nexteticket.Pageobjectmodel.LearnmoreButtonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnmoreButton {
	
	WebDriver driver;
	
	@Given("^User visits nexteticket homepage$")
	public void user_visits_nexteticket_homepage() throws Throwable {
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("https://nexteticket.com/");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\ashra\\OneDrive\\Nexttechscreenshot2.jpg"));
		
		
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("Browser not opening");
		}
	}

	@When("^User click learn more button$")
	public void user_click_learn_more_button() throws Throwable {
	    try {
		LearnmoreButtonPOM obj=new LearnmoreButtonPOM(driver);
		obj.LearnMore().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	    }
	    catch(Exception e) {
	    	System.out.println("element not selectable");
	    }
	}

	@Then("^User able to apper event details\\.$")
	public void user_able_to_apper_event_details() throws Throwable {
    
		
	}
	

}
