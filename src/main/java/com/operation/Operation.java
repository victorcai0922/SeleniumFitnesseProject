/**
 * 
 */
package com.operation;

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
	
	public Element findElementById(String id);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Element findElementByName(String name);
	
	/**
	 * 
	 * @param className
	 * @return
	 */
	public Element findElementByClassName(String className);
	
	/**
	 * 
	 * @param tagName
	 * @return
	 */
	public Element findElementByTagName(String tagName);
	
	/**
	 * 
	 * @param linkText
	 * @return
	 */
	public Element findElementByLinkText(String linkText);
	
	/**
	 * 
	 * @param partialLinkText
	 * @return
	 */
	public Element findElementByPartialLinkText(String partialLinkText);
	
	/**
	 * 
	 * @param xpath
	 * @return
	 */
	public Element findElementByXpath(String xpath);
	
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
	

}
