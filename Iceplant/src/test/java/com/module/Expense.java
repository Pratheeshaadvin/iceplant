package com.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Expense {
	@FindBy(xpath = "//span[text()='Expense']")
	public static WebElement expense_List;
	@FindBy(xpath = "//span[text()='Expenses']")
	public static WebElement expenses_Dropdown;
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public static WebElement select_Date_Expense;
	@FindBy(xpath = "//button[text()='Previous Month']")
	public static WebElement previous_Month_Expense;
	@FindBy(xpath = "//button[text()='Apply']")
	public static WebElement apply_Expense;
	
	
	//expense payment
	@FindBy(xpath = "//span[text()='Expense Payment']")
	public static WebElement expense_Payment;
	@FindBy(xpath = "//button[text()=' New Payment']")
	public static WebElement new_Expense_Payment;
	@FindBy(xpath = "//input[@id='valDate']")
	public static WebElement date_Expense_Payment;
	@FindBy(xpath = "//mat-select[@formcontrolname='expense_type']")
	public static WebElement expense_Type;
	@FindBy(xpath = "//span[text()=' Ice Purchasing ']")
	public static WebElement ice_Purchasing;
	@FindBy(xpath = "//input[@formcontrolname='amount_pay']")
	public static WebElement amount_Expense;
	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	public static WebElement remarks_Expense;
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	public static WebElement payment_Type_Expense;
	@FindBy(xpath = "//li[text()='Cash']")
	public static WebElement cash_Expense;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Expense;
}
