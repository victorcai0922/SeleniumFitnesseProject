package com.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium4IE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
      DesiredCapabilities isCapability = DesiredCapabilities.internetExplorer();
      isCapability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
      WebDriver driver = new InternetExplorerDriver(isCapability);
      driver.get("http://www.google.com.hk");
	}
}
