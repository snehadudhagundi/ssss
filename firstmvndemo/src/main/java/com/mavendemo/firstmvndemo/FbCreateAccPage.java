package com.mavendemo.firstmvndemo;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;

public class FbCreateAccPage
{
	@FindBy(id="u_0_1")
	WebElement firstNameInput;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")
	WebElement lastNameInput;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
	WebElement emailInput;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[5]/div/div[1]/input")
	WebElement newPasswordInput;
	
	@FindBy(name="sex")
	List<WebElement> selectGender;
	
	
	public void sendFirstName(String f_name) throws InterruptedException
	{
		firstNameInput.sendKeys(f_name);
		Thread.sleep(500);
	}
	
	public void sendLastName(String l_name) throws InterruptedException
	{
		lastNameInput.sendKeys(l_name);
		Thread.sleep(500);
	}
	
	public void sendEmailAddress(String e_address) throws InterruptedException
	{
		emailInput.sendKeys(e_address);
		Thread.sleep(500);
	}
	
	public void sendNewPassword(String new_pass) throws InterruptedException
	{
		newPasswordInput.sendKeys(new_pass);
		Thread.sleep(500);
	}
	
	
	
	
/*	public void selectGender(String gendertype)
	{
		int cnt=0;
		for(WebElement item:selectGender)
		{
			boolean bool=item.isSelected();
			if(bool)
			{
				System.out.println(item.getAttribute("label"));
			}
		if(gendertype.equals(Constants.MALE))
			{
				item.click();
				break;
				
			}
			else if(cnt==1)
			{
				item.click();
				break;
			}
			cnt++;
			
		}
		
	}
	
	*/
	
	
}
