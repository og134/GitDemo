package ex1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asseiment8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\qualitest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		driver.findElement(By.id("autocomplete")).sendKeys("ind");//h3[contains(text(),'New Window')]
		action.moveToElement(driver.findElement(By.xpath("//div[(text()='India')]")))
		.click().build().perform();
	/*
		 driver.findElement(By.id("autocomplete")).sendKeys("ind");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	*/	

	}

}
