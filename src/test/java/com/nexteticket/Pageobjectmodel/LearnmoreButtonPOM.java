package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnmoreButtonPOM {

	WebDriver driver;
	
	public LearnmoreButtonPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//a[@href=\"#upevent\"]")
	WebElement click_LearnmoreButton;
	public WebElement LearnMore() {
		return click_LearnmoreButton;
	
	}
}
