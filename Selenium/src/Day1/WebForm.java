package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Namit");
		driver.findElement(By.id("last-name")).sendKeys("Saraswat");
		driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='2']")).click();
		WebElement dt = driver.findElement(By.id("datepicker"));
		dt.sendKeys("22/08/2020");
		dt.sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn btn-lg .btn-primary"));
		WebDriverWait wait = new WebDriverWait (driver, 10); 
		WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
		
		//String alertText = alert.getText();
		//assertEquals("The form was successfully submitted!", alertText);
		
	}

}
