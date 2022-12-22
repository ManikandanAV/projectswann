package org.practise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver dri = new ChromeDriver();
	dri.get("https://www.flipkart.com/");
	dri.manage().window().maximize();
	dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dri.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4']")).click();
	List<WebElement> li = dri.findElements(By.xpath("//a[@class='wrongpath']"));
	//li.get(0).click();
	System.out.println(li);
	
	
	
	
	
	
	
	
	
	
}
}
