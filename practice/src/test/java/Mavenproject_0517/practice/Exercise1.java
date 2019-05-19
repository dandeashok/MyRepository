package Mavenproject_0517.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args)
	{
		System.out.println("Debug 1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Debug 2");
		//driver.get("http://www.google.com");
	   String baseUrl = "https://www.flipkart.com/";
       String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
       String actualTitle = "";
       
       driver.get(baseUrl);
       System.out.println("Title=" +actualTitle);
       actualTitle = driver.getTitle();
       
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
       
       //driver.close();
	
	}
}


