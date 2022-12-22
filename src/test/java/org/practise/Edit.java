package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Edit extends ReusableMethods {

	public static void main(String[] args) {
		
		launch("http://testleaf.herokuapp.com/");
		maximize();
		driv.findElement(By.partialLinkText("Edit")).click();
		driv.findElement(By.id("email")).sendKeys("manianjith@123");
		driv.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("concot");
		String attribute = driv.findElement(By.name("username")).getAttribute("value");
		System.out.println(attribute);
		driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		WebElement element = driv.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		if (element.isEnabled()) {
			System.out.println("button is enabled");
		} else {
			System.err.println("button is disabled");
		}
	}
}
