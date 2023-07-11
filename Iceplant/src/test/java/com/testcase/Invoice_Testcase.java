package com.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Invoice;

public class Invoice_Testcase extends Main_Iceplant{
	@Test(priority = 2, enabled = true)
	public void invoice_page() throws InterruptedException {
		PageFactory.initElements(driver, Invoice.class);
		//Invoice.sales_Invoice.click();
		Thread.sleep(3000);
		for (int i = 0; i <Invoice.invoice_Click.size(); i++) {
			if (Invoice.invoice_Click.get(i).getText().contains("Invoice")) {
				Invoice.invoice_Click.get(i).click();
				break;
			}
		}
		Invoice.new_Invoice.click();
		Invoice.date.click();
		Invoice.date_Select_Invoice.click();
		Thread.sleep(2000);
		Invoice.customer_Name_Invoice.click();
		for (int i = 0; i <Invoice.customer_Name_Select_Invoice.size(); i++) {
			if (Invoice.customer_Name_Select_Invoice.get(i).getText().contains("Ben")) {
				Invoice.customer_Name_Select_Invoice.get(i).click();
				break;
			}
		}
		Invoice.remarks_Invoice.sendKeys("First Purchase");
		Invoice.item_Details.click();
		Invoice.item_Select.click();
		Invoice.quantity_Invoice.sendKeys("5");
		Invoice.paymentmade_Invoice.click();
		Thread.sleep(1000);
		Invoice.paymenttype_Invoice.click();
		Invoice.paymenttype_Invoice_Select.click();
		Invoice.save_invoice.click();
	}
}
