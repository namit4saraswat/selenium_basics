package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	
	public static void DropDown(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='basic']//a[text()='Select Dropdown List']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement  day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Please select']")));
		day.click();
		WebElement  sunday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Sunday']")));
		sunday.click();
		
		driver.findElement(By.xpath("//option[text()='New York']")).click();
		driver.findElement(By.cssSelector("#printMe")).click();
		Thread.sleep(2000);
		driver.navigate().back();
			
		
	}

}
