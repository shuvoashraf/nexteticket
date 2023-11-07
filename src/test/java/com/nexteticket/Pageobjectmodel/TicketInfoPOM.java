package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketInfoPOM {
	
WebDriver driver;
	
	public TicketInfoPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[@id=\"elementor-tab-content-1091\"]/div/div[1]")
    public WebElement TicketInfo;
	
	
	
	
	}



