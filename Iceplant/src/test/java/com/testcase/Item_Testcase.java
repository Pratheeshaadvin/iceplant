package com.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Item;

public class Item_Testcase extends Main_Iceplant {
	@Test(priority = 3, enabled = true)
	public void item_Page() throws InterruptedException {
		PageFactory.initElements(driver, Item.class);
		//Item.sales_Click_Item.click();
		Thread.sleep(2000);
		for (int i = 0; i < Item.item_Click.size(); i++) {
			if (Item.item_Click.get(i).getText().contains("Item")) {
			Item.item_Click.get(i).click();
			break;
			}
		}
		Item.new_Item.click();
		Item.item_Name.sendKeys("Ice Box");
		Item.unit_Price.sendKeys("100");
		Item.notes.sendKeys("It hold 20 kg");
		Item.sales_Click_Item.click();
		Item.save_item.click();
	}
}
