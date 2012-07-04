/**
 * 
 */
package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author caiqiuliang
 * 
 */
public class PropertiesReader {
	
    private	InputStream in = null;
    private Properties pros = null;
	public PropertiesReader(String filepath){
		in = getClass().getResourceAsStream(filepath);
		pros = new Properties();	
	}

	public String getValueByKey(String key) {
		try {
			if (in != null) {
				pros.load(in);
				String value = pros.getProperty(key);
				return value;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		PropertiesReader p = new PropertiesReader("/login.properties");
		String value = p.getValueByKey("usernameinput");
		System.out.println(value);
	}
}
