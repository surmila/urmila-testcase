package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validsearch_page {
		WebDriver driver;
		
		By Textbox =By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
		By search= By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
 public void url() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\Chrome driver\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		 System.out.println(driver.getTitle());
	 }
	 
	 public void JpetSearch() {
		 driver.findElement(Textbox).sendKeys("Bulldog");
		 
	 }
	 
	  public void click() {
		 driver.findElement(search).click();
	 }
	 public void close() {
		 driver.quit();
	 }
	}


