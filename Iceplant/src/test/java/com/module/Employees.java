package com.module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employees {
	@FindBy(xpath = "(//span[text()='Employees'])[1]")
	public static WebElement click_Employee;
	@FindBy(xpath = "(//span[text()='Employees'])[2]")
	public static WebElement employee_Click;
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[2]//li")
	public static List<WebElement> emoloyee_dropdown;
	@FindBy(xpath = "//button[@class='custom-sty']")
	public static WebElement new_Employee;
	@FindBy(xpath = "//input[@formcontrolname='name']")
	public static WebElement employee_Name_Employee;
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	public static WebElement phonenumber_Employee;
	@FindBy(xpath = "//input[@formcontrolname='salary']")
	public static WebElement salary_Employee;
	@FindBy(xpath = "//input[@formcontrolname='designation']")
	public static WebElement designation_Employee;
	@FindBy(xpath = "//input[@formcontrolname='email']")
	public static WebElement employee_Email;
	@FindBy(xpath = "//input[@formcontrolname='city']")
	public static WebElement city_Employee;
	@FindBy(xpath = "//input[@id='valDate']")
	public static WebElement joining_Date_Employee;
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	public static WebElement employee_Status_Employee_Click;
	@FindBy(xpath = "//ul[@class='select2-results__options']//li")
	public static List<WebElement> employee_Status_Selection;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_Employee;
	
	
	//Payment Deduction
	
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[2]//li")
	public static List<WebElement> emoloyee_dropdown_Paymentdeduction;
	@FindBy(xpath = "//input[@id='valDate']")
	public static WebElement date_Deduction;
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[6]")
	public static WebElement date_4_Click;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
	public static WebElement deduction_Type;
	@FindBy(xpath = "//ul[@class='select2-results__options']//li")
	public static List<WebElement> deduction_Type_Select;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[2]")
	public static WebElement employee_Name_payment_deduct;
	@FindBy(xpath = "//ul[@class='select2-results__options']//li")
	public static List<WebElement> employee_Name_Deduct_Select;
	@FindBy(xpath = "//input[@formcontrolname='amount']")
	public static WebElement amount_Deduct;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_deduction;
	
	//payroll
	
	@FindBy(xpath = "//span[text()='Payroll']")
	public static WebElement payroll_Click;
	@FindBy(xpath = "//button[@class='mat-menu-trigger custom-sty float-right']")
	public static WebElement options;
	@FindBy(xpath = "//button[text()='Generating Salary']")
	public static WebElement generating_Salary;
	@FindBy(xpath = "//span[text()='Select Employee']")
	public static WebElement select_Employee;
	@FindBy(xpath = "//div[@class='dropdown-list']//ul//li")
	public static List<WebElement> employee_Name_Dropdown_Generate;
	@FindBy(xpath = "//select[@formcontrolname='month']")
	public static WebElement select_Month_Payroll;
	@FindBy(xpath = "//select[@formcontrolname='year']")
	public static WebElement select_Year_Payroll;
	@FindBy(xpath = "//button[text()='Submit']")
	public static WebElement submit_Payroll;
	@FindBy(xpath = "//i[@class='fas fa-eye']")
	public static WebElement eye_Btn;
	@FindBy(xpath = "//button[text()='Back to List']")
	public static WebElement back_Tolist;
	}

