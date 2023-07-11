package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Reports;

public class Report_Testcase extends Main_Iceplant {
	@Test(priority = 10)
	public void report_page() {
		PageFactory.initElements(driver, Reports.class);
		Reports.report_List.click();
		Reports.sales_Item_Report.click(); 
		Reports.back_Report.click();
		Reports.profit_Loss_Report.click(); 
		Reports.back_Report.click();
		Reports.expense_report.click();
		Reports.back_Report.click();
	}
}
