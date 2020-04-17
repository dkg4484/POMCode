package com.webapp.executionScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement ele1 = driver.findElement(By.id("txtUsername"));

		WebElement ele2 = driver.findElement(By.id("txtPassword"));

		WebElement ele3 = driver.findElement(By.name("Submit"));

		ele1.sendKeys("Admin");

		ele2.sendKeys("admin12");

		ele3.click();

		ele1.sendKeys("Admin");

		ele2.sendKeys("admin123");

		ele3.click();

	}
}