package seleniumExamples;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Myclass2 {				
    		
    public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/test/link.html";					
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\priyanka.devaliya\\Desktop\\priyanka\\SeleniumProject\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();			
    }		

}