package com.testcase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Customer_Sales;

public class Testcase_Cusomer_Sales extends Main_Iceplant{
	@Test(priority = 1 , enabled = true)
	public void customer_page() throws InterruptedException {
		PageFactory.initElements(driver, Customer_Sales.class);
		Customer_Sales.sales.click();
		Thread.sleep(3000);
		for (int i = 0; i < Customer_Sales.customer_Sales_List.size(); i++) {
			if (Customer_Sales.customer_Sales_List.get(i).getText().contains("Customer")) {
				Customer_Sales.customer_Sales_List.get(i).click();
				break;
			}
		}
		Customer_Sales.new_Customer.click();
		Customer_Sales.customer_Name.sendKeys("Ben");
		Customer_Sales.customer_Email.sendKeys("ben@gmail.com");
		Customer_Sales.display_Name.sendKeys("Ben");
		Customer_Sales.phone_Number.sendKeys("9465783476");
		Customer_Sales.address.sendKeys("22/4, Colachel");
		Customer_Sales.customer_Type.sendKeys("Retailer");
		Customer_Sales.is_Vendor.click();
		Customer_Sales.save_Customer.click();
		
		
	}
}
