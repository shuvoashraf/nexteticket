package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyticketPOM {
	
	WebDriver driver;
	
	public BuyticketPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/section[1]/div[3]/div[1]/div/section/div/div/div/div/div/div/a/span/span")
	WebElement click_Buyticket;
	public WebElement buyticket() {
		return click_Buyticket;
	}
	@FindBy(xpath="//*[@id=\"price\"]/div/div[1]/div/div/div/div/a")
    public WebElement earlyBird_Buyticket;
	
	
	@FindBy(xpath="//*[@id=\"price\"]/div/div[2]/div/div/div/div/a")
    public WebElement regular_Buyticket;
	
	@FindBy(xpath="//*[@id=\"price\"]/div/div[3]/div/div/div/div/a")
    public WebElement platinum_Buyticket;

	
	
}
