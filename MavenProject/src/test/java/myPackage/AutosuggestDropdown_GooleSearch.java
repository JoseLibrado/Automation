package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown_GooleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']//div[1]/span"));
		
		System.out.print("Size of auto suggestions: " + list.size());
		
		
		 for(WebElement listItem : list) {
			
			if(listItem.getText().contains("java tutorial for beginners")) {
				listItem.click();
				break;
			}
			
		} 
		 
		

	}

}
