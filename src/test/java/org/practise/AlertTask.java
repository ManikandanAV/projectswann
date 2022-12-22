package org.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertTask extends ReusableMethods {
	public static void main(String[] args) {

		launch("http://testleaf.herokuapp.com/");
		maximize();
		Alert alert = driv.switchTo().alert();
		driv.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/h5")).click();
		driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		alert.accept();
		driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		alert.dismiss();
		WebElement e = driv.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		e.click();
		alert.sendKeys("mani");
		alert.accept();
	}
}
 