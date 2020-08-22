package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class SelPract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/");
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		WebElement  autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]")));
		autocompleteResult.click();
		
		WebElement down_arrow = driver.findElement(By.cssSelector(".two"));
		Actions action= new Actions(driver);
		action.moveToElement(down_arrow);
		down_arrow.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement form = driver.findElement(By.xpath("//*[@id=\"basic_example\"]/span/i"));
		action.moveToElement(form);
		
		//String home = driver.getWindowHandle();
		
		
		SimpleForm obj = new SimpleForm();
		obj.SimpleForm(driver);
		
		//driver.switchTo().window(home);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".two")).click();
		WebElement  Checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#basic .list-group > a:nth-of-type(2)")));
		action.moveToElement(Checkbox);
		CheckBox obj1 = new CheckBox();
		obj1.CheckBox(driver);
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".two")).click();
		WebElement RB = driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[3]"));
		action.moveToElement(RB);
		RadioButton obj2 = new RadioButton();
		obj2.Radio_Button(driver);
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".two")).click();
		WebElement DD = driver.findElement(By.xpath("//*[@id='basic']//a[text()='Select Dropdown List']"));
		action.moveToElement(DD);
		DropDown obj3 = new DropDown();
		obj3.DropDown(driver);
		
	}

}
