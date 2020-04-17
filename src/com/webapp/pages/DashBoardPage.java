package com.webapp.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {

		this.driver = driver;

	}

	/*
	 * By market = By.id("MP_link");
	 * 
	 * By welcome = By.id("welcome");
	 * 
	 * By welcomeMenu = By.xpath("//*[@id='welcome-menu']/ul/li/a");
	 * 
	 * By container = By.xpath("//*[@class='quickLaungeContainer']//tr//span");
	 */

	@FindBy(id = "MP_link")
	WebElement market;

	@FindBy(id = "welcome")
	WebElement welcome;

	@FindBy(how = How.XPATH, using = "//*[@id='welcome-menu']/ul/li/a")
	List<WebElement> welcomeMenu;

	@FindBy(how = How.XPATH, using = "//*[@class='quickLaungeContainer']//tr//span")
	List<WebElement> container;

	public void validateTextMarket(String text) {

		String lab = market.getAttribute("value");

		if (lab.equals(text)) {

			System.out.println("Text " + lab + " - valid");
		}

		else {

			System.out.println("Text " + lab + " - invalid");

		}

	}

	public void validateTextWelcome(String text) {

		String lab = welcome.getText();

		if (lab.equals(text)) {

			System.out.println("Text " + lab + " - valid");
		}

		else {

			System.out.println("Text " + lab + " - invalid");
		}

	}

	public void clickWelcome() {

		welcome.click();
	}

	public void dDnWelcomeMenu() {

		List<WebElement> elements = welcomeMenu;

		List<String> expected = new ArrayList<String>(Arrays.asList("About", "Logout"));

		List<String> actual = new ArrayList<String>();

		for (int i = 0; i < elements.size(); i++) {

			actual.add(elements.get(i).getText());

		}

		if (actual.equals(expected)) {

			System.out.println(actual + " is equal to " + expected);

		}

		else {

			System.out.println(actual + " is not equal with " + expected);
		}

	}

	public void validateLanguageContainer() {

		List<WebElement> elements = container;

		List<String> actual = new ArrayList<String>();

		List<String> expected = new ArrayList<String>(Arrays.asList("Assign Leave", "Leave List", "Timesheets"));

		for (int i = 0; i < elements.size(); i++) {

			actual.add(elements.get(i).getText());

		}

		if (actual.equals(expected)) {

			System.out.println(actual + " is equal to " + expected);

		}

		else {

			System.out.println(actual + " is not equal with " + expected);
		}

	}

}
