package ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\qualitest\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
		Iterator<String> it = windows.iterator();

		String childId = it.next();

		driver.switchTo().window(childId);

		driver.findElement(By.xpath(" //a[contains(text(),'Click Here')]")).click();
		
		windows = driver.getWindowHandles();
		it = windows.iterator();		
		it.next();
		
		String subChildId = it.next();
		driver.switchTo().window(subChildId);
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());



	}

}
