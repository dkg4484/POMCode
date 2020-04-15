package com.webapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By uName = By.id("txtUsername");

	By pwd = By.id("txtPassword");

	By login = By.name("Submit");

	By header = By.id("logInPanelHeading");

	By forgot = By.xpath("//*[text()='Forgot your password?']");

	public void enterUsername(String user_name) {

		driver.findElement(uName).sendKeys(user_name);

	}

	public void enterPassword(String pass_word) {

		driver.findElement(pwd).sendKeys(pass_word);

	}

	public void clickSubmit() {

		driver.findElement(login).click();

	}

	public void getHeaderTitle(String head) {

		String lab = driver.findElement(header).getText();

		if (lab.equals(head)) {

			System.out.println("Text " + lab + " - valid");
		}

		else {

			System.out.println("Text " + lab + " - invalid");
		}

	}

	public void validateLinkForgot(String tag) {

		String link = driver.findElement(forgot).getTagName();

		if (tag.equals(link)) {

			System.out.println("link " + link + " - valid");
		}

		else {

			System.out.println("link" + link + " - invalid");
		}

	}

}
