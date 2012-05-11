/**
 * 
 */
package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.browserdriver.BrowerDriver;
import com.common.Driver;
import com.operation.OperationImpl;

/**
 * @author caiqiuliang
 *
 */
public class PlayerDataGet {
	
	public static void main(String[] args) {
		BrowerDriver.setSystemProperty("webdriver.chrome.driver", "C:\\Documents and Settings\\caiqiuliang\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chromedriver.exe");
		BrowerDriver.setWebDriver(Driver.Chrome);
		OperationImpl ol = new OperationImpl();
		ol.getPage("http://soccernet.espn.go.com/match?id=323155&cc=4716");
//		WebElement element = ol.findElementByClassName("team-color-strip");
//		System.out.println(element.getAttribute("Nottingham Forest"));
//	    WebElement element = ol.findElementByClassName("team-color-strip");
//	    WebElement element1 = element.findElement(By.tagName("th"));
//	    System.out.println(element1.getText());
//	    
		List<WebElement> elements = ol.findElementsByCssSeletor("tr");
//	    System.out.println(element2.getText());
//	    List<WebElement> list = element2.findElements(By.tagName("th"));
	    Iterator<WebElement> it = elements.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next().getText());
	    }
	}

}
