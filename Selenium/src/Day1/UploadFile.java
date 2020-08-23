package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.findElement(By.id("file-upload-field")).sendKeys("Scroll.java");
	}

}
