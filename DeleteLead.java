package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			String username = "DemoSalesManager";
			String password = "crmsfa";

			// Setup WebDriver Manager's Chrome Driver
			WebDriverManager.chromedriver().setup();

			// Open the browser
			ChromeDriver driver = new ChromeDriver();

			// Open the link
			driver.get("http://leaftaps.com/opentaps/control/login");

			// Maximize the Browser window
			driver.manage().window().maximize();

			// Login using username and password
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);

			// Click Submit button
			driver.findElement(By.className("decorativeSubmit")).click();

			// Click Link Text CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();

			// Click Tab Leads
			driver.findElement(By.linkText("Leads")).click();

			// Click Find leads
	        driver.findElement ( By.linkText ( "Find Leads" ) ).click ( );
	        
	        // click on phone
	        driver.findElement ( By.linkText ( "Phone" ) ).click ( );
	        //driver.findElement ( By.xpath ( "(//span[@class='x-tab-strip-text '])[2]" ) ).click ( );
	        
	        //Enter phone number
	        //driver.findElement(By.name("phoneCountryCode")).clear();
	        //driver.findElement(By.name("phoneCountryCode")).sendKeys("12345");

	       // driver.findElement ( By.xpath ( "//input[@name='phoneCountryCode']" ) ).clear ( );
	       // driver.findElement ( By.xpath ( "//input[@name='phoneCountryCode']" ) ).sendKeys ( "00" );
	      //  driver.findElement ( By.xpath ( "//input[@name='phoneAreaCode']" ) ).clear ( );
	      //  driver.findElement ( By.xpath ( "//input[@name='phoneAreaCode']" ) ).sendKeys ( "000" );
	        driver.findElement ( By.xpath ( "//input[@name='phoneNumber']" ) ).clear ( );
	        driver.findElement ( By.xpath ( "//input[@name='phoneNumber']" ) ).sendKeys ( "123" );
	        
	        // Click Find leads
	        driver.findElement (By.xpath("//button[text()='Find Leads']")).click ( );
	        
	        Thread.sleep(2000);
	        
	        // Capture lead ID of First Resulting lead
	        WebElement eleLeadId = driver.findElement (By.xpath ("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a" ) );

	        //Retrieve the Text of Lead ID
	        String leadId = eleLeadId.getText ( );
	        System.out.println ( "First Resulting lead ID is : " + leadId );

	        //Click First Resulting lead
	        eleLeadId.click ( );
	        
	        //Verify title of the page
	        System.out.println("Title: " + driver.getTitle());
	        
	        // Click Delete
	       // driver.findElement ( By.xpath ( "//div[@class='frameSectionExtra']//a[@class='subMenuButtonDangerous'][3]" ) ).click ( );
	        //driver.findElement(By.linkText("Delete")).click();
	        driver.findElement ( By.xpath ( "//a[@class='subMenuButtonDangerous']" ) ).click ( );
	        
	     // Click Find leads
	        driver.findElement ( By.linkText ( "Find Leads" ) ).click ( );
	        
	       // Enter captured lead ID
	        driver.findElement ( By.xpath ( "(//div[@class='x-form-item x-tab-item']/div/input[@class=' x-form-text x-form-field'])[1]" ) ).sendKeys ( leadId );
	        
	        //Click Find leads
	        driver.findElement (By.xpath("//button[text()='Find Leads']")).click ( );
	        
	      //17 Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	        String deletedLead = driver.findElement ( By.xpath ( "//div[contains(text(),'No records')]" ) ).getText ( );

	        //if ( deletedLead.equalsIgnoreCase ( "No records to display" ) )
	        
	        if (deletedLead.contains("No records"))
	        {
	            System.out.println ( "Sucessfully Deleted the Lead ID: " + leadId );
	        }
	        else
	        {
	            System.out.println ( "Lead ID not Deleted: Actual Text Found " + deletedLead );
	        }
	        
	       
	        // Close the browser (Do not log out)
	        driver.close ( );
		}
	}


