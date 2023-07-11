package com.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_In {
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	public static WebElement email;
	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	public static WebElement password;
	@FindBy(xpath = "//button[text()='LOGIN']")
	public static WebElement login_Btn;
}
