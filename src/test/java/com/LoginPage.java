/**
 * 
 */
package com;

import com.operation.OperationImpl;

/**
 * @author dell
 * 
 */
public class LoginPage {

	private OperationImpl operation;

	public LoginPage(OperationImpl operation) {
		this.operation = operation;
		if (!"163网易免费邮--中文邮箱第一品牌".equals(operation.getTitle())) {
			throw new IllegalStateException("This is not login page!");
		}
	}

	public LoginPage loginAs(String username, String password) {
		operation.findElementById("idInput").sendKeys(username);
		operation.findElementById("pwdInput").sendKeys(password);
		operation.findElementById("loginBtn").submit();
		return new LoginPage(operation);
	}
}
