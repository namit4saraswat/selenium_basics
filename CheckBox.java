package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {
	
	public static void CheckBox(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Check Box Demo']")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		Actions action= new Actions(driver);
		WebElement RB1 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
		action.moveToElement(RB1);
		driver.findElement(By.cssSelector(".text-left > div:nth-of-type(2) > div:nth-of-type(2) > div > label > input")).click();
		driver.findElement(By.cssSelector(".text-left > div:nth-of-type(2) > div:nth-of-type(2) > div > label > input")).click();
		driver.findElement(By.cssSelector(".text-left > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > label > input")).click();
		driver.findElement(By.cssSelector(".text-left > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > label > input")).click();
		driver.findElement(By.cssSelector(".text-left > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > label > input")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

}
