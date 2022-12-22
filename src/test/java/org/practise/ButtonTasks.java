package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class ButtonTasks extends ReusableMethods{
	public static void main(String[] args) {
		
		launch("http://testleaf.herokuapp.com/");
		maximize();
		driv.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]")).click();
	    driv.findElement(By.id("home")).click();
		driv.navigate().back();
		WebElement position = driv.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
		WebElement color = driv.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		WebElement size = driv.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("height is "+height);
		System.out.println("width is "+width);
		
	}

}
