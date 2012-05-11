/**
 * 
 */
package com.operation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.browserdriver.BrowerDriver;
import com.element.Element;

/**
 * @author dell
 *
 */
public class OperationImpl implements Operation {

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementById(java.lang.String)
	 */
	public WebElement findElementById(String id) {
		// TODO Auto-generated method stub
		By byid = new By.ById(id);
		WebElement element = BrowerDriver.driver.findElement(byid);
		return  element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByName(java.lang.String)
	 */
	public WebElement findElementByName(String name) {
		// TODO Auto-generated method stub
		By byname = new By.ByName(name);
		WebElement element = BrowerDriver.driver.findElement(byname);
		return  element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByClassName(java.lang.String)
	 */
	public WebElement findElementByClassName(String className) {
		// TODO Auto-generated method stub
		By byClassName = By.className(className);
		WebElement element = BrowerDriver.driver.findElement(byClassName);
		return (Element) element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByTagName(java.lang.String)
	 */
	public WebElement findElementByTagName(String tagName) {
		// TODO Auto-generated method stub
		By byTagName = By.tagName(tagName);
		WebElement element = BrowerDriver.driver.findElement(byTagName);
		return  element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByLinkText(java.lang.String)
	 */
	public WebElement findElementByLinkText(String linkText) {
		// TODO Auto-generated method stub
		By bylinkText = By.linkText(linkText);
		WebElement element = BrowerDriver.driver.findElement(bylinkText);
		return  element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByPartialLinkText(java.lang.String)
	 */
	public WebElement findElementByPartialLinkText(String partialLinkText) {
		// TODO Auto-generated method stub
		By bypartialLinkText = By.partialLinkText(partialLinkText);
		WebElement element = BrowerDriver.driver.findElement(bypartialLinkText);
		return  element;
	}

	/* (non-Javadoc)
	 * @see com.operation.Operation#findElementByXpath(java.lang.String)
	 */
	public WebElement findElementByXpath(String xpath) {
		// TODO Auto-generated method stub
		By byxpath = By.xpath(xpath);
		WebElement element = BrowerDriver.driver.findElement(byxpath);
		return element;
	}

	public void getPage(String url) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.get(url);
	}

	public void navigate(String url) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.navigate().to(url);
	}

	public void navigateForward() {
		// TODO Auto-generated method stub
		BrowerDriver.driver.navigate().forward();
	}

	public void navigateBack() {
		// TODO Auto-generated method stub
		BrowerDriver.driver.navigate().back();
	}

	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.manage().addCookie(cookie);
	}

	public void deleteCookieByName(String name) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.manage().deleteCookieNamed(name);
	}

	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.manage().deleteCookie(cookie);
	}

	public void deleteAllCookie() {
		// TODO Auto-generated method stub
		BrowerDriver.driver.manage().deleteAllCookies();
	}

	public Alert switchToPopUpDialog() {
		// TODO Auto-generated method stub
		return BrowerDriver.driver.switchTo().alert();
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		// TODO Auto-generated method stub
		Actions actions = (new Actions(BrowerDriver.driver));
		actions.dragAndDrop(source, target);
	}

	public WebElement waitUntilTheExpectElementAppear(long time,final String id) {
		// TODO Auto-generated method stub
		WebElement element = (new WebDriverWait(BrowerDriver.driver,time)).until(new ExpectedCondition<WebElement>(){

			public WebElement apply(WebDriver wd) {
				// TODO Auto-generated method stub
				return wd.findElement(By.id(id));
			}
			
		});
		return element;
	}

	public void implicitWait(long time, TimeUnit unit) {
		// TODO Auto-generated method stub
		BrowerDriver.driver.manage().timeouts().implicitlyWait(time, unit);
		
	}

	public File takeScreenShot() {
		// TODO Auto-generated method stub
		WebDriver driver = new Augmenter().augment(BrowerDriver.driver);
		File screenshot = ((TakesScreenshot)driver).
                getScreenshotAs(OutputType.FILE);
		return screenshot;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		String title = BrowerDriver.driver.getTitle();
		return title;
	}

	public WebElement findElementByCssSelect(String cssSelect) {
		// TODO Auto-generated method stub
		WebElement element = BrowerDriver.driver.findElement(By.cssSelector(cssSelect));
		return element;
	}

	

}
