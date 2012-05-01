/**
 * 
 */
package com;

import com.browserdriver.BrowerDriver;
import com.common.Driver;
import com.operation.OperationImpl;

/**
 * @author dell
 * 
 */
public class LoginPageTest {

	public static void main(String[] args) {
//		BrowerDriver
//				.setSystemProperty(
//						"webdriver.chrome.driver",
//						"C:\\Users\\dell\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		BrowerDriver.setWebDriver(Driver.FireFox);
		BrowerDriver.setUrl("http://mail.163.com");
		
		OperationImpl op = new OperationImpl();
		op.getPage("http://mail.163.com");
		LoginPage lp = new LoginPage(op);
		lp.loginAs("caiqiuliang", "qiu_5077");
		
	}

}
