package seleniumExamples;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

public class MyClass3 {				
    		
    public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/test/block.html";					
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\priyanka.devaliya\\Desktop\\priyanka\\SeleniumProject\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("Inside")).click();					
        System.out.println(driver.getTitle());					
        driver.navigate().back();			
        driver.findElement(By.partialLinkText("Outside")).click();					
        System.out.println(driver.getTitle());					
        driver.quit();			
    }		
}		