package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.TicketBookingObjects;

public class TicketPage {
	

	@Test
	public void Login() {
		
	    System.setProperty("webdriver.chrome.driver","E:\\Automation\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		PageFactory.initElements(driver, TicketBookingObjects.class);
		
	    TicketBookingObjects.nameButton.sendKeys("Ram");
	    TicketBookingObjects.dateButton.click();
	    TicketBookingObjects.dateToGiven.click();
	    TicketBookingObjects.sexButton.click();
	    
		

	}

}
