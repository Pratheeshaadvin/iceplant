package com.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.main.Main_Iceplant;
import com.module.Sign_In;

public class Sign_In_Testcase extends Main_Iceplant {
	@Test(priority = 0)
	public void sign_In_Fun() {
		PageFactory.initElements(driver, Sign_In.class);
		Sign_In.email.sendKeys("arul@gmail.com");
		Sign_In.password.sendKeys("12345678");
		Sign_In.login_Btn.click();
	}
}
