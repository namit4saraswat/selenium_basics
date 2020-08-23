package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.findElement(By.id("radio-button-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/input")).click();
		
	}

}
