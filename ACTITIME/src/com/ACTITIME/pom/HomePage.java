package com.ACTITIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (id="logoutLink")
	private WebElement lgoutLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userlnk;

	private WebElement lgoutlnk;

	private WebElement reportlnk;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		// TODO Auto-generated constructor stub
	

	public WebElement getLgoutLink() {
		return lgoutLink;
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getUserlnk() {
		return userlnk;
	}
	public void logout() {
		lgoutlnk.click();
	}
	public void report() {
		reportlnk.click();
	}

	public void tasktab() {
		// TODO Auto-generated method stub
		
	tasklnk.click();
	}
	}
	
	


