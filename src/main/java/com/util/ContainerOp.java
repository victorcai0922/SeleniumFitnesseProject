/**
 * 
 */
package com.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caiqiuliang
 * 
 */
public class ContainerOp {

	public static AbstractApplicationContext aac = new ClassPathXmlApplicationContext(
			"ApplicationContext.xml");
	
	public static void startUp(){
		aac.start();
	}
	
	public static void close(){
		aac.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
