package com.module;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invoice {
	@FindBy(xpath ="//span[text()='Sales']" )
	public static WebElement sales_Invoice;
	@FindBy(xpath = "(//ul[@id='collapseBasic'])[1]//li")
	public static List<WebElement> invoice_Click;
	@FindBy(xpath = "//button[@class='custom-sty mr-3']")
	public static WebElement new_Invoice;
	@FindBy(xpath = "//input[@id='valDate']")
	public static WebElement date;
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[5]")
	public static WebElement date_Select_Invoice;
	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
	public static WebElement customer_Name_Invoice;
	@FindBy(xpath = "//ul[@id='select2-customer_id-results']//li")
	public static List<WebElement> customer_Name_Select_Invoice;
	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	public static WebElement remarks_Invoice;
	@FindBy(xpath = "//div[@class='ng-value-container']")
	public static WebElement item_Details;
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted']")
	public static WebElement item_Select;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	public static WebElement quantity_Invoice;
	@FindBy(xpath = "//label[@class='mat-slide-toggle-label']")
	public static WebElement paymentmade_Invoice;
	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
	public static WebElement paymenttype_Invoice;
	@FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[2]")
	public static WebElement paymenttype_Invoice_Select;
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement save_invoice;
}
