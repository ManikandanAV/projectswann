package org.practise;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadTask extends ReusableMethods {

	public static void main(String[] args) throws Throwable {
		
		launch("http://testleaf.herokuapp.com/");
		maximize();

		String path = "C:\\Users\\mania\\OneDrive\\windowhandling.png";
		StringSelection location = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(location);

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
}
