/**
 * 
 */
package com.testscript;

import org.openqa.selenium.WebElement;

import com.browserdriver.BrowerDriver;
import com.common.Driver;
import com.operation.OperationImpl;
import com.util.ContainerOp;

/**
 * @author caiqiuliang
 * 
 */
public class SeleniumForShengpay {

	private static String webDriverClass = "webdriver.chrome.driver";
	private static String driverPath = "C:\\Documents and Settings\\caiqiuliang\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chromedriver.exe";
	private OperationImpl operation;
	private String ptid;
	private String ptpwd;
	private String submitbtnid;

	public SeleniumForShengpay() {
		BrowerDriver.setSystemProperty(webDriverClass, driverPath);
		BrowerDriver.setWebDriver(Driver.Chrome);
	}

	public void login(String passId, String passWord, String url) {
		operation.getPage(url);
		System.out.println(ptid);
		WebElement ptidElement = operation.findElementById(ptid);
		if (ptidElement != null) {
			ptidElement.sendKeys(passId);
		}
		WebElement pwdElement = operation.findElementById(passId);
		if (pwdElement != null) {
			pwdElement.sendKeys(passWord);
		}
		WebElement submitB = operation.findElementById(submitbtnid);
		if (submitB != null) {
			submitB.click();
		}
	}

	public void register() {

	}

	public void transferMoney(String fromPid, String toPid, long money) {

	}

	public String getPtid() {
		return ptid;
	}

	public void setPtid(String ptid) {
		this.ptid = ptid;
	}

	public String getPtpwd() {
		return ptpwd;
	}

	public void setPtpwd(String ptpwd) {
		this.ptpwd = ptpwd;
	}

	public String getSubmitbtnid() {
		return submitbtnid;
	}

	public void setSubmitbtnid(String submitbtnid) {
		this.submitbtnid = submitbtnid;
	}

	public OperationImpl getOperation() {
		return operation;
	}

	public void setOperation(OperationImpl operation) {
		this.operation = operation;
	}

	public static void main(String[] args) {
		ContainerOp.startUp();
		SeleniumForShengpay shengpay = (SeleniumForShengpay) ContainerOp.aac
				.getBean("login");
		shengpay.login("qiujun111118", "123qwe",
				"https://testwww.shengpay.com/");
	}

}
