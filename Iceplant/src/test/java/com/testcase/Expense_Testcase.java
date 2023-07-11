package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Expense;

public class Expense_Testcase extends Main_Iceplant{
	
	public void expenses_Page() throws InterruptedException {
		PageFactory.initElements(driver, Expense.class);
		Expense.expense_List.click();
		Expense.expenses_Dropdown.click();
		Expense.select_Date_Expense.click();
		Thread.sleep(2000);
		Expense.previous_Month_Expense.click();
		Expense.apply_Expense.click();
	}
	public void expense_Payment_Page() throws InterruptedException {
		PageFactory.initElements(driver, Expense.class);
		Expense.expense_Payment.click();
		Expense.new_Expense_Payment.click();
		Expense.date_Expense_Payment.sendKeys("5-Jul-2023");
		Expense.amount_Expense.sendKeys("100");
		Expense.payment_Type_Expense.click();
		Expense.cash_Expense.click();
		Thread.sleep(2000);
		Expense.expense_Type.click();
		Expense.ice_Purchasing.click();
		Expense.remarks_Expense.sendKeys("paid Rs.100");
		Expense.save_Expense.click();
	}
	@Test(priority = 8, enabled = true)
	public void expense_All_Page() throws InterruptedException {
		expenses_Page();
		expense_Payment_Page();
	}
}
