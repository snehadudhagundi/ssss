package com.mavendemo.firstmvndemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoQA {

	public static FbCreateAccPage demo()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.get(Constants.APP_URL);
		driver.manage().window().maximize();
		
		FbCreateAccPage page=PageFactory.initElements(driver, FbCreateAccPage.class);
		return page;
		

	}

}
