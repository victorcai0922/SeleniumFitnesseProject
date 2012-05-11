/**
 * 
 */
package com;

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
		
	}

}
