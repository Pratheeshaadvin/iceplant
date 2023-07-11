package com.module;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Received {
	@FindBy(xpath = "//span[text()='Sales']")
	public static WebElement sales_Click_Payment;
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[1]//li")
	public static List<WebElement> paymentreceived_Click;
	@FindBy(xpath = "//input[@name='daterange']")
	public static WebElement date_Payment;
	@FindBy(xpath ="//button[text()='Previous Month']")
	public static WebElement previous_Month;
	@FindBy(xpath = "//button[@class='btn']")
	public static WebElement apply;
	@FindBy(xpath = "//button[@class='custom-sty']")
	public static WebElement new_Payment;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
	public static WebElement customer_Name_Click;
	@FindBy(xpath = "//ul[@class='select2-results__options']//li")
	public static List<WebElement> customer_Name_Payment;
	@FindBy(xpath = "//input[@id='valDate']")
	public static WebElement date_Payment_Add;
	@FindBy(xpath = "//input[@formcontrolname='amount']")
	public static WebElement amount_Payment;
	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	public static WebElement notes_Payment;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[2]")
	public static WebElement payment_Type_Payment;
	@FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[2]")
	public static WebElement cash_Payment;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Payment;
	
	
}
