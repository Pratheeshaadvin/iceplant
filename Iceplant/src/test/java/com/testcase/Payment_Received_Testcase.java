package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Payment_Received;

public class Payment_Received_Testcase extends Main_Iceplant {
	@Test(priority = 4, enabled = true)
	public void payment_Received_Page() throws InterruptedException {
		PageFactory.initElements(driver, Payment_Received.class);
		//Payment_Received.sales_Click_Payment.click();
		Thread.sleep(3000);
		for (int i = 0; i < Payment_Received.paymentreceived_Click.size(); i++) {
			if (Payment_Received.paymentreceived_Click.get(i).getText().contains("Payment Recieved")) {
				Payment_Received.paymentreceived_Click.get(i).click();
				break;
			}
		}
		Payment_Received.date_Payment.click();
		Payment_Received.previous_Month.click();
		Payment_Received.apply.click();
		Payment_Received.new_Payment.click();
		Payment_Received.customer_Name_Click.click();
		Thread.sleep(2000);
		for (int i = 0; i <Payment_Received.customer_Name_Payment.size() ; i++) {
			if (Payment_Received.customer_Name_Payment.get(i).getText().contains("Ben")) {
				Payment_Received.customer_Name_Payment.get(i).click();
			} 
		}
		Payment_Received.amount_Payment.sendKeys("100");
		Payment_Received.payment_Type_Payment.click();
		Payment_Received.cash_Payment.click();
		Payment_Received.date_Payment_Add.sendKeys("2-Jul-2023");
		Payment_Received.notes_Payment.sendKeys("Paid 100");
		Payment_Received.save_Payment.click();
	}
}
