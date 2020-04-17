package com.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(id = "txtUsername")
	WebElement uName;

	@FindBy(id = "txtPassword")
	WebElement pwd;

	@FindBy(name = "Submit")
	WebElement login;

	@FindBy(how = How.ID, using = "logInPanelHeading")
	WebElement header;

	@FindBy(how = How.XPATH, using = "//*[text()='Forgot your password?']")
	WebElement forgot;

	public void enterUsername(String user_name) {

		uName.sendKeys(user_name);

	}

	public void enterPassword(String pass_word) {

		pwd.sendKeys(pass_word);

	}

	public void clickSubmit() {

		login.click();

	}

	public void getHeaderTitle(String head) {

		String lab = header.getText();

		if (lab.equals(head)) {

			System.out.println("Text " + lab + " - valid");
		}

		else {

			System.out.println("Text " + lab + " - invalid");
		}

	}

	public void validateLinkForgot(String tag) {

		String link = forgot.getTagName();

		if (tag.equals(link)) {

			System.out.println("link " + link + " - valid");
		}

		else {

			System.out.println("link" + link + " - invalid");
		}

	}

}
