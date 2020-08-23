package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				WebDriver driver =  new ChromeDriver();
				
				driver.get("https://formy-project.herokuapp.com/modal");
				driver.findElement(By.id("modal-button")).click();
				
				//Alert alert = driver.switchTo().alert();
				//alert.accept();
				
				WebElement close = driver.findElement(By.id("close-button"));
				
				//JavascriptExecutor js = (JavascriptExecutor).driver;
				//js.executeScript("argument[0].click();",close);
	}

}
