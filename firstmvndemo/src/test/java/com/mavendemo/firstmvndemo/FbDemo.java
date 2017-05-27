package com.mavendemo.firstmvndemo;

public class FbDemo {

	public static void main(String[] args) throws InterruptedException
	{
		FbCreateAccPage form= DemoQA.demo();
		form.sendFirstName("Om");
		form.sendLastName("Dudhagundi");
		form.sendEmailAddress("omprakashdudhagundi007@gmail.com");
		form.sendNewPassword("om007007");
		//form.selectGender("Male");
		//boolean selectRadio=false;
		//boolean selectRadio;
	/*	if(selectRadio==true)
		{
			form.selectSex.get(1).click();
			
		}
		else
			form.selectSex.get(0).click();
		
*/
	}

}
