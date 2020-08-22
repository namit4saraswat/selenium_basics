package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleForm {
	
	public static void SimpleForm(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.cssSelector("#basic .list-group > a")).click();
		driver.findElement(By.id("user-message")).sendKeys("$Pressed Show Message$");
		driver.findElement(By.cssSelector("#get-input .btn")).click();
		driver.findElement(By.id("sum1")).sendKeys("5");
		driver.findElement(By.id("sum2")).sendKeys("6");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#gettotal .btn")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}

}
