package com.webapp.executionScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webapp.pages.DashBoardPage;
import com.webapp.pages.LoginPage;

public class ExecutionMenu {

	
	// Plain POM
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		LoginPage login = new LoginPage(driver);

		login.getHeaderTitle("LOGIN Panel");

		login.validateLinkForgot("a");

		login.enterUsername("Admin");

		login.enterPassword("admin123");

		login.clickSubmit();

		DashBoardPage board = new DashBoardPage(driver);

		board.validateTextMarket("Marketplace");

		board.validateTextWelcome("Welcome Admin");

		board.clickWelcome();

		board.dDnWelcomeMenu();

		board.validateLanguageContainer();

	}

}
