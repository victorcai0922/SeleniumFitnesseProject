/**
 * 
 */
package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author dell
 *
 */
public class Selenium4Example {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.163.com");
		//please input account number
		By byid = new By.ById("idInput");
		WebElement accelement = driver.findElement(byid);
		accelement.sendKeys("caiqiuliang0922");
		//please input password 
		By bypwdid = new By.ById("pwdInput");
		WebElement pwdelement = driver.findElement(bypwdid);
		pwdelement.sendKeys("qiu_5077");
		//click the submit button
		By bybtnid = new By.ById("loginBtn");
//		By byname = new By.ByName("");
		WebElement btnelement = driver.findElement(bybtnid);
		btnelement.click();
		System.out.println(driver.getTitle());
		driver.quit();
		driver.close();

	}
	
	
	public void get(String url){
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void login(String url,String username,String pwd){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new InternetExplorerDriver();
		driver.get("http://mail.163.com");
		//please input account number
		By byid = new By.ById("idInput");
		WebElement accelement = driver.findElement(byid);
		accelement.sendKeys("caiqiuliang0922");
		//please input password 
		By bypwdid = new By.ById("pwdInput");
		WebElement pwdelement = driver.findElement(bypwdid);
		pwdelement.sendKeys("qiu_5077");
		//click the submit button
		By bybtnid = new By.ById("loginBtn");
		WebElement btnelement = driver.findElement(bybtnid);
		btnelement.click();
		System.out.println(driver.getTitle());
		driver.close();
	}
	

}
