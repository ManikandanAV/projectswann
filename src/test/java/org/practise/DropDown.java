package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends ReusableMethods {

	public static void main(String[] args) {

		launch("http://testleaf.herokuapp.com/");
		maximize();
		driv.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5")).click();
		WebElement drop = driv.findElement(By.id("dropdown1"));
		Select s = new Select(drop);
		s.selectByIndex(1);
		WebElement d2 = driv.findElement(By.name("dropdown2"));
		Select s1 = new Select(d2);
		s1.selectByVisibleText("Appium");
		WebElement d3 = driv.findElement(By.id("dropdown3"));
		Select s2 = new Select(d3);
		s2.selectByValue("3");
		WebElement d4 = driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select s3 = new Select(d4);
		List<WebElement> options = s3.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}
		driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		WebElement d5 = driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select s4 = new Select(d5);
		s4.selectByIndex(1);
		s4.selectByValue("4");
		s4.selectByVisibleText("UFT/QTP");
		
		

	}

}
