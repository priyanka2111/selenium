package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {

	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\priyanka.devaliya\\Desktop\\priyanka\\SeleniumProject\\Driver\\geckodriver.exe");
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
	        System.out.println(innerText); 
		//driver.quit();
		}
	}
