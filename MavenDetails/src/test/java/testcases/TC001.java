package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {


		@Test
		public void tcase2() {
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("hello");
			driver.findElement(By.id("pass")).sendKeys("hello");
			driver.quit();
			
		}
	}
