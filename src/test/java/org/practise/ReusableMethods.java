package org.practise;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {
	public static WebDriver driv;

	public static void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driv = new ChromeDriver();
		driv.get(url);
	}

	public static void maximize() {
		driv.manage().window().maximize();

	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public static String getAttribute(WebElement element, String text) {

		String attribute = element.getAttribute(text);
		System.out.println(attribute);
		return attribute;
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void screenShot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driv;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		try {
			FileUtils.copyFile(sc, f);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void listIderation(List<WebElement> element) {
		for (int i = 0; i < element.size(); i++) {
			WebElement webElement = element.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}

	}


}
