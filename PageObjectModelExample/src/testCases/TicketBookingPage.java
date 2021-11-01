package testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TicketBookingPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Automation\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		WebElement rateButton = driver.findElement(By.id("product_549"));
		rateButton.click();



		WebElement nameButton = driver.findElement(By.id("travname"));
		nameButton.sendKeys("ram");


		WebElement dateButton = driver.findElement(By.xpath("//*[@id=\'dob\']"));
		dateButton.click();

		WebElement dateToGiven = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[4]/a"));
		dateToGiven.click();


		WebElement sexButton = driver.findElement(By.id("sex_1"));
		sexButton.click();

		WebElement travelType = driver.findElement(By.id("traveltype_1"));
		travelType.click();

		WebElement fromBox = driver.findElement(By.id("fromcity"));
		fromBox.sendKeys("chennai");

		WebElement toBox = driver.findElement(By.id("tocity"));
		toBox.sendKeys("tenkasi");

		WebElement deptDate =driver.findElement(By.id("departon"));
		deptDate.click();

		WebElement deptDateToGiven =driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[4]/td[3]/a"));
		deptDateToGiven.click();

		WebElement phNumber = driver.findElement(By.id("billing_phone"));
		phNumber.sendKeys("7894561230");

		WebElement mailId = driver.findElement(By.id("billing_email"));
		mailId.sendKeys("asdfcg@gamil.com");

		WebElement addressNum = driver.findElement(By.id("billing_address_1"));
		addressNum.sendKeys("789");

		/*
		 * WebElement country = driver.findElement(By.xpath(
		 * "//*[@id=\'billing_country_field\']/span/span/span[1]/span/span[2]"));
		 * country.click();
		 * 
		 * WebElement countryToGiven =
		 * driver.findElement(By.id("select2-billing_country-result-8ph8-ID"));
		 * countryToGiven.click();
		 */


		WebElement city = driver.findElement(By.id("billing_city"));
		city.sendKeys("chennai");


		WebElement stateToGiven = driver.findElement(By.xpath("//*[@id=\'billing_state_field\']/span/span/span[1]/span/span[2]"));
		stateToGiven.click();

		WebElement state = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		state.sendKeys("Assam\n");

		WebElement pincode = driver.findElement(By.id("billing_postcode"));
		pincode.sendKeys("123456");

		WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\'place_order\']"));
		placeOrder.click();





	}

	private static Object nameButton(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
