/**
 * 
 */
package com.own.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author snigdhamohapatra
 *
 */
public class BaseDriver {

	
	protected WebDriver driver;
	public BaseDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/snigdhamohapatra/Jars/chromedriver");
		driver = new ChromeDriver();
	}
}
