package com.ACTITIME.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ACTITIME.pom.HomePage;
import com.ACTITIME.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("datebase connected", true);
	}
	@AfterSuite
	public void databaseconnected() {
		Reporter.log("database disconnected", true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

@AfterTest
public void closebrowser() {
	driver.close();
}

@BeforeMethod
public void login() throws IOException {
	ReadDataFromPropertyFile data = new ReadDataFromPropertyFile();
	String url = data.ReadDataFromProperty("url");
	String un = data.ReadDataFromProperty("username");
	String pw = data.ReadDataFromProperty("password");
	
	driver.get(url);
	LoginPage lp = new LoginPage(driver);
	lp.loginintoActitime(un,pw);
}
@AfterMethod
public void logout() throws InterruptedException {
	Thread.sleep(5000);
	HomePage hp = new HomePage(driver);
	hp.logout();
}}

