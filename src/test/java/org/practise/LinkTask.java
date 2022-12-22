package org.practise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkTask extends ReusableMethods {

	public static void main(String[] args) throws Throwable {

		
		/*
		 * launch("http://testleaf.herokuapp.com/"); maximize();
		 * driv.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5")).
		 * click(); List<WebElement> link = driv.findElements(By.tagName("a"));
		 * System.out.println(link.size()); for (WebElement x : link) { String href =
		 * x.getAttribute("href");
		 * 
		 * URL url = new URL(href); HttpURLConnection http = (HttpURLConnection)
		 * url.openConnection(); int code = http.getResponseCode(); try { if (code !=
		 * 200) { System.out.println("Link is broken"); String responseMessage =
		 * http.getResponseMessage(); System.out.println(responseMessage); } } catch
		 * (Exception e) { System.out.println(e); } }
		 */
		 
		List<String> li = new ArrayList<String>();

		li.add("hello");
		String s = li.get(0);
		li.add("java");
		System.out.println(s);
		System.out.println(li);

		Set<String> set = new HashSet<String>();
		set.add("hi");
		System.out.println(set);
		for (String x : set) {
			System.out.println(x);
		}

		Map<String, String> map = new HashMap<String, String>();
		map.put("student", "mani");
		map.put("student1", "raj");
		String string = map.get("student");
		System.out.println(string);

		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		Collection<String> values = map.values();
		System.out.println(values);

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			String value = entry.getValue();
			System.out.println(value);
		}
		System.out.println(map);

		String str = "welcome to java class selenium";
		String rev = "";
		String output = "";
		String[] sp = str.split(" ");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
			String str2 = sp[i];
			if (str2.equals("java")) {
				char[] chars = str2.toCharArray();
				for (int j = chars.length - 1; j >= 0; j--) {
					char c = chars[j];
					rev = rev + c;
				}
			}
			if (rev.equals("avaj") && str2.equals("java")) {

				output = output + rev + " ";
			} 
			else {
				output = output + str2 + " ";
			}

		}

		
		System.out.println(output);

	}

}
