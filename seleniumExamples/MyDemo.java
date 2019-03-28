package seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\priyanka.devaliya\\Desktop\\priyanka\\SeleniumProject\\Driver\\geckodriver.exe");
    	WebDriver driver =new FirefoxDriver();
    	String baseUrl ="http://www.google.com";
    	driver.get(baseUrl);
    	String expectedTitle ="Google";
    	String actualTitle="";
    	
    	actualTitle =driver.getTitle();
    	
    	if(actualTitle.contentEquals(expectedTitle))
    	{
    		System.out.println("pass");

    	}else{
    		System.out.println("fail");
    	}
	}
}
