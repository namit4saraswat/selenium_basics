package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.findElement(By.id("new-tab-button")).click();
		driver.findElement(By.id("new-tab-button")).click();
		driver.findElement(By.id("new-tab-button")).click();
		String original_handle = driver.getWindowHandle();
		System.out.print("All 3 tabs are open now");
		
		for (String handle1 : driver.getWindowHandles())
		{
			driver.switchTo().window(handle1);
			Thread.sleep(1000);
		}
		
		System.out.print("Traversing through 3");
		driver.switchTo().window(original_handle);
		System.out.print("Back to Pavilion");
	}

}
