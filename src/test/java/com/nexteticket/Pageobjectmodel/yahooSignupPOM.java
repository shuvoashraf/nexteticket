package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yahooSignupPOM {
	
WebDriver driver;
	
	public yahooSignupPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@id=\"usernamereg-firstName\"]")
	WebElement type_fullname;
	public WebElement fullname() {
		return type_fullname;
	}

	@FindBy(xpath="//input[@id=\"usernamereg-userId\"]")
	WebElement type_email;
	public WebElement email() {
		return type_email;
	}
	@FindBy(xpath="//input[@id=\"usernamereg-password\"]")
	WebElement password;
	public WebElement password() {
		return password;
	}

	@FindBy(xpath="//select[@id=\"usernamereg-month\"]")
	WebElement click_month;
	public WebElement month() {
		return click_month;
	}
	@FindBy(xpath="//input[@id=\"usernamereg-day\"]")
	WebElement type_day;
	public WebElement Day() {
		return type_day;
	}

	@FindBy(xpath="//input[@id=\"usernamereg-year\"]")
	WebElement type_year;
	public WebElement Year() {
		return type_year;
	}
}
