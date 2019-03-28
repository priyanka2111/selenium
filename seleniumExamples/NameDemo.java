package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\priyanka.devaliya\\Desktop\\priyanka\\SeleniumProject\\Driver\\geckodriver.exe");
    	WebDriver driver =new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("http://demo.guru99.com/test/ajax.html");
    	
    	System.out.println(By.name("name"));
	}

}
