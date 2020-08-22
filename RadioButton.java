package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
	public static void Radio_Button(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[3]")).click();
		driver.findElement(By.cssSelector("[name='optradio']")).click();
		driver.findElement(By.cssSelector("#buttoncheck")).click();
		WebElement male = driver.findElement(By.cssSelector("[name='gender']"));
		Actions action= new Actions(driver);
		action.moveToElement(male);
		driver.findElement(By.cssSelector("[name='gender']")).click();
		driver.findElement(By.xpath("//label[text()='15 to 50']//*[@name='ageGroup']")).click();
		driver.findElement(By.xpath("//button[text()='Get values']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	
	}
	
}
