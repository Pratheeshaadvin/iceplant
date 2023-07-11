package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Daybooks;

public class Daybook_Testcase extends Main_Iceplant{
	@Test(priority = 9, enabled = true)
	public void daybook_page() {
		PageFactory.initElements(driver, Daybooks.class);
		Daybooks.day_Book.click();
		Daybooks.date_Day_Book.click();
		Daybooks.previous_Month_Daybook.click();
		Daybooks.apply.click();
	}
}
