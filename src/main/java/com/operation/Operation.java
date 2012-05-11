/**
 * 
 */
package com.operation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import com.element.Element;

/**
 * @author dell
 *
 */
public interface  Operation {
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public WebElement findElementById(String id);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public WebElement findElementByName(String name);
	
	/**
	 * 
	 * @param className
	 * @return
	 */
	public WebElement findElementByClassName(String className);
	
	/**
	 * 
	 * @param tagName
	 * @return
	 */
	public WebElement findElementByTagName(String tagName);
	
	/**
	 * 
	 * @param linkText
	 * @return
	 */
	public WebElement findElementByLinkText(String linkText);
	
	/**
	 * 
	 * @param partialLinkText
	 * @return
	 */
	public WebElement findElementByPartialLinkText(String partialLinkText);
	
	/**
	 * 
	 * @param xpath
	 * @return
	 */
	public WebElement findElementByXpath(String xpath);
	
	/**
	 * find element by css selector
	 * @param cssSelect
	 * @return
	 */
	public WebElement findElementByCssSelect(String cssSelect);
	
	/**
	 * 
	 * @param url
	 */
	public void getPage(String url);
	
	/**
	 * 
	 * @param url
	 */
	public void navigate(String url);
	
	/**
	 * navigate forward page
	 */
	public void navigateForward();
	
	/**
	 * navigate back page
	 */
	public void navigateBack();
	
	/**
	 * add cookie
	 * @param cookie
	 */
	public void addCookie(Cookie cookie);
	
	/**
	 * delete cookie by name
	 * @param name
	 */
	public void deleteCookieByName(String name);
	
	/**
	 * delete cookie by cookie
	 * @param cookie
	 */
	public void deleteCookie(Cookie cookie);
	
	/**
	 * delete all cookie
	 */
	public void deleteAllCookie();
	
	/**
	 * switch to pop up dialog
	 */
	public Alert switchToPopUpDialog();
	
	/**
	 * drag and drop the element from source to target
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebElement source, WebElement target);
	
	/**
	 * wait until the expected condition happened
	 * @param time second
	 * @param id
	 * @return
	 */
	public WebElement waitUntilTheExpectElementAppear(long time,final String id);
	
	/**
	 * implicit wait until the time is over
	 * @param time
	 * @param timeType
	 */
	public void implicitWait(long time,TimeUnit until);
	
	/**
	 * take screen shot operation
	 *  when use this method you should set the driver as the remote web driver
	 *  and this method will return the screen shot as the file format
	 * @return
	 */
	public File takeScreenShot();
	
	/**
	 * get title from the page!
	 * @return
	 */
	public String getTitle();
	

}
