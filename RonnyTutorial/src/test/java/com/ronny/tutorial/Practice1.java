package com.ronny.tutorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	private WebDriver driver;
	@Before
	public void configurar() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement txtBuscador = driver.findElement(By.name("q"));
		txtBuscador.sendKeys("automatización");
		Thread.sleep(1500);
		WebElement btnBuscar = driver.findElement(By.name("btnK"));
		btnBuscar.click();
	}

}
