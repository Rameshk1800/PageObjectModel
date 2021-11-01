package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TicketBookingObjects {
	
	@FindBy(how=How.ID, using ="travname" )
	public static WebElement nameButton;
	
	@FindBy(xpath="//*[@id=\'dob\']")
	public static WebElement dateButton;
	
	@FindBy(xpath="//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[4]/a")
	public static WebElement dateToGiven;
	
	@FindBy(id="sex_1")
	public static WebElement sexButton;
	
	
	
	

	/*
	 * public static WebElement nameButton( WebDriver driver) { return
	 * driver.findElement(By.id("travname"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement dateButton(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\'dob\']"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement dateToGiven(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[4]/a"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement sexButton(WebDriver driver) { return
	 * driver.findElement(By.id("sex_1"));
	 * 
	 * }
	 */
	
}
