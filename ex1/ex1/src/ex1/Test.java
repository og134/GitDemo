package ex1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// "http://qaclickacademy.com/practice.php"
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\qualitest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement  Table = driver.findElement(By.id("product"));
		int Coloums = Table.findElements(By.cssSelector("table[id='product'] tbody th")).size();
		System.out.println(Coloums);
		
		int Rows = Table.findElements((By.cssSelector("table[name='courses'] tbody tr"))).size();
		System.out.println(Rows);
		
		List <WebElement> Data = Table.findElements((By.cssSelector("table[name='courses'] tbody tr")));
		Iterator<WebElement> it = Data.iterator();
		it.next();
		it.next();
		WebElement Info = it.next();
		System.out.println(Info.getText());
		

	}

}
