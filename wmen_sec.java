package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wmen_sec {

	public static void wmen_sec(WebDriver driver)
	{
		driver.findElement(By.cssSelector("[title='Women']")).click();
	}

}
