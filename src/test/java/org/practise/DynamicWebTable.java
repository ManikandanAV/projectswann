package org.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicWebTable extends ReusableMethods {

	public static void main(String[] args) {

		launch("https://demo.guru99.com/test/web-table-element.php");
	
		WebElement table = driv.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));

		for (int i = 0; i < headers.size(); i++) {
			WebElement header = headers.get(i);
			String text = header.getText();
			
				int position = i;
			WebElement body = table.findElement(By.tagName("tbody"));
			List<WebElement> rows = body.findElements(By.tagName("tr"));

			for (int j = 0; j < rows.size(); j++) {
				WebElement row = rows.get(j);
				List<WebElement> datas = row.findElements(By.tagName("td"));
				
				for (int k = position; k < position+1; k++) {
					WebElement data = datas.get(k);
					String text2 = data.getText();
					if (text.contains("Current Price")) {
						System.out.println(text2);

					}
				}
			}
			

		}

	}
}
