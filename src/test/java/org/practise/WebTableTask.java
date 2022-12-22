package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableTask extends ReusableMethods{
public static void main(String[] args) {
	
	launch("http://testleaf.herokuapp.com/");
	maximize();
	driv.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a")).click();
	WebElement table = driv.findElement(By.tagName("table"));
	WebElement body = table.findElement(By.tagName("tbody"));
	List<WebElement> row = body.findElements(By.tagName("tr"));
	int rows = row.size();
	int coloum = 0;
	System.out.println("no of rows = " + rows);
	for (int i = 0; i < row.size(); i++) {
		WebElement element2 = row.get(i);
		List<WebElement> col = element2.findElements(By.tagName("td"));
		for (int j = 0; j < col.size(); j++) {
			coloum++;
			WebElement coll = col.get(j);
			String text = coll.getText();
			if (text.equals("Learn to interact with Elements")) {
				System.out.println(text);
				System.out.println(i);
			}
		}
	}
	System.out.println("no of coloum = " + coloum);

}
}
