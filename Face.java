package week2.day2.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Face {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				//Setup the webdriver manager's chrome driver
		       WebDriverManager.chromedriver().setup();
		       //launch the chrome browser 
		       ChromeDriver driver = new ChromeDriver();
		           
		     //load the url
			      driver.get("http://en-gb.facebook.com/");
			      
		       //maximize the browser window
		       driver.manage().window().maximize();
		       
		       //add the implicit wait
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       
		       //click on create new account button
		       driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		       
		       //Enter First name
		       driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suja");
		       
		     //Enter last name
		       driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		       
		     //Enter Mobile Number
		      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");

		    //Enter new password
		      driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234567890");

		      //handle all the three dropdowns
		      //handle day
		      Select selDay=new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		      selDay.selectByValue("1");
		      
		      //handle month
		      Select selMonth=new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
		      selMonth.selectByValue("1");
		      
		    //handle year
		      Select selYear=new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		      selYear.selectByValue("1903");
		      
		      //select the radio button "Female"
		      driver.findElement(By.xpath("//input[@value=1]")).click();
		      
}
}
