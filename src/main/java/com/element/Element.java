/**
 * 
 */
package com.element;

import org.openqa.selenium.WebElement;

/**
 * @author dell
 * 
 */
public abstract class Element implements WebElement {

	private String id;
	private String name;
	private String className;
	private String tagName;
	private String linkText;
	private String partialLinkText;
	private String css;
	private String xpath;
	
	
	public abstract void click();
	

	public abstract void input(String text);
	
	public abstract void input(int text);
	
	public abstract boolean check();
	
	public abstract boolean select();

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getLinkText() {
		return linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	public String getPartialLinkText() {
		return partialLinkText;
	}

	public void setPartialLinkText(String partialLinkText) {
		this.partialLinkText = partialLinkText;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

}
