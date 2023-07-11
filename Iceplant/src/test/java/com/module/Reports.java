package com.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports {
	@FindBy(xpath = "//span[text()='Reports']")
	public static WebElement report_List;
	@FindBy(xpath = "//a[text()='Sales Items Report']")
	public static WebElement sales_Item_Report;
	@FindBy(xpath = "//button[text()='Back ']")
	public static WebElement back_Report;
	@FindBy(xpath = "//a[text()='Profit And Loss Report']")
	public static WebElement profit_Loss_Report;
	@FindBy(xpath = "//a[text()='Expenses Report']")
	public static WebElement expense_report;
}
