package com.saucedemo.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;

	public Base() throws IOException {
		prop = new Properties();
		FileInputStream ip;
			try {
			ip = new FileInputStream("C:/Users/harish/vinu/work/swagLabs/SauceDemo/Configuration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public  void initialize() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

}