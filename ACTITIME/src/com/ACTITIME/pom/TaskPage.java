package com.ACTITIME.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ACTITIME.Generic.ReadDataFromExcel;


public class TaskPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnewbtn;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath="//div[@class='dropdownButton']")
	private WebElement dropdown;
	
	@FindBy(xpath="(//div[.='Big Bang Company'])[6]")
	private WebElement compname;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustname() {
		return custname;
	}
	public void addnew() throws IOException, InterruptedException {
		ReadDataFromExcel r = new ReadDataFromExcel();
				String customer =r.ReadDataExcelFile("Sheet1", 1, 1);
		
		Addnewbtn.click();
		newcustomer.click();
		Thread.sleep(3000);
		custname.sendKeys("customer");
		Thread.sleep(3000);
		description.sendKeys("Banking");
		Thread.sleep(3000);
		dropdown.click();
		Thread.sleep(3000);
		compname.click();
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getDropdown() {
		return dropdown;
		
	}

	public WebElement getCompname() {
		return compname;
	}
	
}
