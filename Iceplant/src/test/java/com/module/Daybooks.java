package com.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Daybooks {
	@FindBy(xpath = "//span[text()='Day Book']")
	public static WebElement day_Book;
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public static WebElement date_Day_Book;
	@FindBy(xpath = "//button[text()='Previous Month']")
	public static WebElement previous_Month_Daybook;
	@FindBy(xpath = "//button[text()='Apply']")
	public static WebElement apply;
}
