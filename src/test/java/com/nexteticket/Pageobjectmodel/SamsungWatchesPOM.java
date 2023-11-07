package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  SamsungWatchesPOM {
	
WebDriver driver;
	
	public SamsungWatchesPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);

}


	@FindBy(xpath="//button[@an-la=\"mobile\"]")
	WebElement Mobile;
	public WebElement SamMobile() {
		return Mobile;
	}

	@FindBy(xpath="//a[@an-la=\"mobile:watches\"]")
	WebElement click_Watches;
	public WebElement SamWatches() {
		return click_Watches;
	}




}
