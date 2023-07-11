package com.module;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Sales {
	@FindBy(xpath ="//span[text()='Sales']" )
	public static WebElement sales;
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[1]//li")
	public static List<WebElement> customer_Sales_List;
	@FindBy(xpath = "//button[@class='custom-sty']")
	public static WebElement new_Customer;
	@FindBy(xpath = "//input[@formcontrolname='customer_name']")
	public static WebElement customer_Name;
	@FindBy(xpath = "//input[@formcontrolname='email_id']")
	public static WebElement customer_Email;
	@FindBy(xpath = "//input[@formcontrolname='display_name']")
	public static WebElement display_Name;
	@FindBy(xpath = "//input[@formcontrolname='mobile_number']")
	public static WebElement phone_Number;
	@FindBy(xpath = "//textarea[@formcontrolname='address']")
	public static WebElement address;
	@FindBy(xpath = "//input[@formcontrolname='customer_type']")
	public static WebElement customer_Type;
	@FindBy(xpath = "//label[@class='mat-slide-toggle-label']")
	public static WebElement is_Vendor;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Customer;
}
