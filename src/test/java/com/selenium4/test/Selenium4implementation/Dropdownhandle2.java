package com.selenium4.test.Selenium4implementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandle2 {
	
	
	@Test
	public void Test1()
	{

	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//This line added from remote repository by Hillol

//line added by hillol
		


		WebElement Option=driver.findElement(By.id("option"));

		Select dropdown=new Select(Option);
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Option");
		dropdown.selectByValue("option 3");

		WebElement list1=driver.findElement(By.id("datalists"));
		System.out.println("WebElementList1"+list1);
		driver.findElement(By.xpath("//input[@name=\"Options\"]")).click();
		WebElement StartTyping=driver.findElement(By.xpath("//input[@name=\"Options\"]"));
		
		WebElement textbox =driver.findElement(By.xpath("//textarea[@name=\"message\"]"));
		textbox.clear();
		textbox.sendKeys("I provide the input");
		//driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		
	
		












		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


driver.close();

	}
	}


