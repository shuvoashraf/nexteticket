package com.nexteticket.Stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.nexteticket.Pageobjectmodel.SamsungWatchesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SamsungWatches {
	
	WebDriver driver;
	
	@Given("^User visits Samsung homepage$")
	public void user_visits_Samsung_homepage() throws Throwable {
		try {
		
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.samsung.com/us/");
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("url not opening");
		}
	    
	}

	@When("^User go to mobile dropdown menu and click on Watches$")
	public void user_go_to_mobile_dropdown_menu_and_click_on_Watches() throws Throwable {
		try {
		Actions Samsung=new Actions(driver);
		SamsungWatchesPOM object=new SamsungWatchesPOM(driver);
		
		Samsung.moveToElement(object.SamMobile()).build().perform();
		object.SamWatches().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\ashra\\OneDrive\\SamsungWatchScreenshot.jpg"));
		
		}
		catch(Exception e) {
			System.out.println("element not visible");
			
		}
			
	}

	@Then("^User able to see all watches\\.$")
	public void user_able_to_see_all_watches() throws Throwable {
	   
  
}}
