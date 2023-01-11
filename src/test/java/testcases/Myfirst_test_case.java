package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myfirst_test_case {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.zoho.com/");
		 driver.findElement(By.linkText("Sign In")).click();
		 
		 

	}

}
