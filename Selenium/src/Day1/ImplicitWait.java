package Day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("1555 Park Blvd, Palo Alto, CA, USA");
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("pac-item")).click();
		
	}

}
