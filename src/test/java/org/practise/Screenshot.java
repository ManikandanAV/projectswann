package org.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("https:/www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[3]"));
		
		File sc = img.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\html\\imgs\\flipkart.png");
		try {
			FileUtils.copyFile(sc, f);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
