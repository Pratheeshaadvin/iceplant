package com.module;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Item {
	@FindBy(xpath ="//span[text()='Sales']")
	public static WebElement sales_Click_Item; 
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[1]//li")
	public static List<WebElement> item_Click;
	@FindBy(xpath = "//button[@class='custom-sty']")
	public static WebElement new_Item;
	@FindBy(xpath = "//input[@formcontrolname='name']")
	public static WebElement item_Name;
	@FindBy(xpath = "//input[@formcontrolname='unit_price']")
	public static WebElement unit_Price;
	@FindBy(xpath = "//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")
	public static WebElement notes;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_item;
}
