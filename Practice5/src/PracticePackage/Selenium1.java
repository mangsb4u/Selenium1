package PracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.google.com/
		
				System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();

	}

}
