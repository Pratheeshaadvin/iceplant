package com.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Employees;

public class Employee_Testcase extends Main_Iceplant{
	public static WebDriverWait wait;
	@Test(priority = 5 , enabled = true)
	public void employee_Page() throws InterruptedException {
		PageFactory.initElements(driver, Employees.class);
		Employees.click_Employee.click();
		Employees.employee_Click.click();
		Thread.sleep(2000);
		for (int i = 0; i < Employees.emoloyee_dropdown.size(); i++) {
			if (Employees.emoloyee_dropdown.get(i).getText().contains("Employees")) {
				Employees.emoloyee_dropdown.get(i).click();
				break;
			}
			
		}
		Employees.new_Employee.click();
		Employees.employee_Name_Employee.sendKeys("Raj");
		Employees.phonenumber_Employee.sendKeys("9456677755");
		Employees.salary_Employee.sendKeys("10000");
		Employees.designation_Employee.sendKeys("Sales Man");
		Employees.employee_Email.sendKeys("raj@gmail.com");
		Employees.city_Employee.sendKeys("Colachel");
		Employees.joining_Date_Employee.sendKeys("01-Jan-2023");
		Employees.employee_Status_Employee_Click.click();
		Thread.sleep(2000);
		for (int i = 0; i < Employees.employee_Status_Selection.size(); i++) {
			if (Employees.employee_Status_Selection.get(i).getText().contains("Active")) {
				Employees.employee_Status_Selection.get(i).click();
				break;
			}
		}
		Employees.save_Employee.click();
	}@Test(priority = 6, enabled = true)
	public void payment_Deduction() throws InterruptedException {
		PageFactory.initElements(driver, Employees.class);
		Employees.click_Employee.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@id='collapseBasic'])[2]//li")));
		for (int i = 0; i < Employees.emoloyee_dropdown_Paymentdeduction.size(); i++) {
			if (Employees.emoloyee_dropdown_Paymentdeduction.get(i).getText().contains("Payment Deduction")) {
			Employees.emoloyee_dropdown_Paymentdeduction.get(i).click();
			break;
			}
		}
		Employees.date_Deduction.click();
		Employees.date_4_Click.click();
		Employees.deduction_Type.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='select2-results__options']//li")));
		for (int i = 0; i <Employees.deduction_Type_Select.size(); i++) {
			if (Employees.deduction_Type_Select.get(i).getText().contains("Personal")) {
			Employees.deduction_Type_Select.get(i).click();
			break;
			}
		}
		//Thread.sleep(3000);
		Employees.employee_Name_payment_deduct.click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", Employees.employee_Name_payment_deduct);
		//Employees.employee_Name_payment_deduct.click();
		
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='select2-results__options']//li"))); 
		  for (int i = 0; i <Employees.employee_Name_Deduct_Select.size(); i++) {
			  if(Employees.employee_Name_Deduct_Select.get(i).getText().contains("Raj")) {
		  Employees.employee_Name_Deduct_Select.get(i).click();
		  break; } }
		  Employees.amount_Deduct.sendKeys("1000"); Employees.save_deduction.click();
		 
	}
	@Test(priority = 7 ,enabled = true)
	public void pay_Roll() throws InterruptedException {
		PageFactory.initElements(driver, Employees.class);
		Employees.click_Employee.click();
		Employees.payroll_Click.click();
		Employees.options.click();
		Thread.sleep(2000);
		Employees.generating_Salary.click();
		Employees.select_Employee.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown-list']//ul//li"))); 
		Thread.sleep(3000);
		for (int i = 0; i < Employees.employee_Name_Dropdown_Generate.size(); i++) {
			if (Employees.employee_Name_Dropdown_Generate.get(i).getText().contains("Raj")) {
				Employees.employee_Name_Dropdown_Generate.get(i).click();
				break;
			}
		}
		Select select_Month = new Select(Employees.select_Month_Payroll);
		select_Month.selectByIndex(7);
		Thread.sleep(2000);
		Select select_Year = new Select(Employees.select_Year_Payroll);
		select_Year.selectByIndex(1);
		Employees.submit_Payroll.click();
		Employees.eye_Btn.click();
		Employees.back_Tolist.click();
	}
}
