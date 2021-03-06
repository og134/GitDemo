package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.String;

class Demo {

	public int DeveloperChnages() {

		System.out.println("hello");
		return 1;
	}

	public static void main(String[] args) throws InterruptedException {

		Scanner myObj = new Scanner(System.in);
		// set webSite
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\qualitest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement staticDropdown = driver
				.findElement(By.xpath("//div[@class='mb-4']/select[@class='bc-neutral-100 bg-transparent']")); // option[@value='1']
		Select adultDropDown = new Select(staticDropdown);
		adultDropDown.selectByValue("5");

		staticDropdown = driver.findElement(
				By.xpath("//*[contains(text(),'Children')]/../select[@class='bc-neutral-100 bg-transparent']"));
		Select childrenDropDown = new Select(staticDropdown);
		childrenDropDown.selectByValue("2");

		// search flights
		driver.findElement(By.xpath("//*[contains(text(),'Search flights')]")).click();
		String a = myObj.nextLine();
		// wait and close
		driver.quit();

	}

}

/*
 * 
 * check using assert
 * 
 * WebElement firstCheckBox =
 * driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
 * firstCheckBox.click(); Assert.assertTrue(firstCheckBox.isSelected());
 * firstCheckBox.click(); Assert.assertFalse(firstCheckBox.isSelected());
 */

/*
 * 
 * select from dynamic dropdowm
 * 
 * driver.findElement(By.id("autosuggest")).sendKeys("ind"); Thread.sleep(3000);
 * List <WebElement> options =
 * driver.findElements(By.cssSelector("li[class ='ui-menu-item'] a"));
 * 
 * for (WebElement option : options) {
 * if(option.getText().equalsIgnoreCase("India")){ option.click(); break; } }
 *
 * 
 */

/*
 * 
 * Dynamic dropDown , Departure city and Arrival City
 * 
 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
 * ); driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
 * Thread.sleep(2000); driver.findElement(By.
 * xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value = 'MAA']"
 * )).click();
 * 
 */

/*
 * change currency
 * 
 * WebElement staticDropdown =
 * driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); Select
 * dropDown = new Select(staticDropdown); dropDown.selectByIndex(3);
 * System.out.println(dropDown.getFirstSelectedOption().getText());
 * dropDown.selectByValue("INR");
 * System.out.println(dropDown.getFirstSelectedOption().getText());
 * dropDown.selectByVisibleText("AED");
 * 
 * System.out.println(dropDown.getFirstSelectedOption().getText());
 *
 *
 */

/*
 * click adult in passenger
 * 
 * driver.findElement(By.id("divpaxinfo")).click(); try { Thread.sleep(2000L); }
 * catch (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } WebElement addAdult =
 * driver.findElement(By.id("hrefIncAdt")); addAdult.click(); addAdult.click();
 * addAdult.click(); driver.findElement(By.id("btnclosepaxoption")).click();
 *
 *
 */
