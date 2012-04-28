/**
 * 
 */
package com.browserdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.common.Driver;

/**
 * @author dell
 * 
 */
public class BrowerDriver {

	public static WebDriver driver;
	
	private static URL url;
	
	private static DesiredCapabilities dc;
	
	public static DesiredCapabilities getDesiredCapabilities(){
		return dc;
	}
	
	public static void setDesiredCapabilities(DesiredCapabilities dcs){
		dc = dcs;
	}
	

	public static URL getUrl() {
		return url;
	}

	public static void setUrl(String strurl) {
		try {
			url = new URL(strurl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * set system property
	 * 
	 * @param webDriverClass
	 * @param driverPath
	 */
	public static void setSystemProperty(String webDriverClass,
			String driverPath) {
		System.setProperty(webDriverClass, driverPath);
	}

	/**
	 * set the driver type such as ie,chrome,firefox
	 * @param driverType
	 */
	public static void setWebDriver(Driver driverType) {
		switch(driverType){
		case IE:
			DesiredCapabilities isCapabilities = DesiredCapabilities.internetExplorer();
			isCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(isCapabilities);
			break;
		case Chrome:
			driver = new ChromeDriver();
			break;
		case FireFox:
			driver = new FirefoxDriver();
			break;
		case HtmlUnitDriver:
			driver = new HtmlUnitDriver(true);
			break;
		case RemoteWebDriver:
			driver = new RemoteWebDriver(getUrl(), getDesiredCapabilities());
		}
		 
	}
	
	
	public static void changeTheUserAgent(){
		FirefoxProfile profile = new FirefoxProfile();
//		profile.a
	}

}
