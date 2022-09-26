package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String username = "DemoSalesManager";
		String password = "crmsfa";		
		
				//Setup the webdriver manager's chrome driver
				       WebDriverManager.chromedriver().setup();
				     //launch the chrome browser
				       ChromeDriver driver = new ChromeDriver();
				       //1. load the url
				      driver.get("http://leaftaps.com/opentaps/control/login");
				       				       
				       //maximize the browser window
				       driver.manage().window().maximize();
				       
				    
				       //2. Enter the username and pwd using ID locator
				       driver.findElement(By.id("username")).sendKeys(username);
				       driver.findElement(By.id("password")).sendKeys(password);
				       
				       //3.click on Login button using class locator
				       driver.findElement(By.className("decorativeSubmit")).click();
				       
				       //4.click on CRM/SFA link
				       driver.findElement(By.linkText("CRM/SFA")).click();
				       
				       //5. click on contacts button
				       driver.findElement(By.linkText("Contacts")).click();
				       
				     //6. click on create contacts button
				       driver.findElement(By.linkText("Create Contact")).click();
				       
				       //7. Enter first name field using ID locator
				       driver.findElement(By.id("firstNameField")).sendKeys("Sujatha");
				       
				       //8. Enter LastName Field Using id Locator
				       driver.findElement(By.id("lastNameField")).sendKeys("Shanmugam");
				       
				     //9. Enter FirstName(Local) Field Using id Locator
				       driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sujatha");
				       
				     //10. Enter LastName(Local) Field Using id Locator
				        driver.findElement ( By.id ( "createContactForm_lastNameLocal" ) ).sendKeys ( "S" );

				        //11. Enter Department Field Using any Locator of Your Choice
				       driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
				       
				     //12. Enter Description Field Using any Locator of your choice
				       driver.findElement(By.id("createContactForm_description")).sendKeys("Create Lead form");
				       
				       //13. Enter your email in the E-mail address Field using the locator of your choice
				       driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Sujatha.s@gmail.com");
				       
				     //14. Select State/Province as NewYork Using Visible Text
				  	 //Thread.sleep(2000);
				      // Select province = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
				       //select state/province as Newyork using visible text
				     // province.selectByVisibleText("New York");
				       
				      //15. Click on Create Contact
				       driver.findElement(By.name("submitButton")).click();
				       
				     //16. Click on edit button
				       driver.findElement(By.linkText("Edit")).click();
				       
				     //17. Clear the Description Field using .clear
				       driver.findElement(By.id("updateContactForm_description")).clear();		       
				       
				       //18. Fill Description Field with Any text
				       driver.findElement(By.id("updateContactForm_description")).sendKeys("Filling Description");
				       
				       //18. Fill ImportantNote Field with Any text
				       driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Filling ImportantNote with Data");
				       
				       //19. Click on update button using Xpath locator
				       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				      				   			      
				       //20. Get the Title of Resulting Page
				       System.out.println("Title of the resulting page:" +driver.getTitle());
				       	
	}

}
