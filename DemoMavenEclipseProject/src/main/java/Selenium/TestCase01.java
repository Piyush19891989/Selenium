package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase01 implements Serializable {
	
public WebDriver driver ;
	
@Test
public void Script() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe") ;
	driver = new ChromeDriver() ;
	driver.get("http://www.google.com");
	driver.close();
}

}
