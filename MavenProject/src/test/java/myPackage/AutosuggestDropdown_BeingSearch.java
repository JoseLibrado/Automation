package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown_BeingSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		System.out.print("Size of auto suggestions: " + list.size());
		
		for(WebElement listItem : list) {
			
			if(listItem.getText().contains("selenium id")) {
				listItem.click();
				break;
			}
			
		}
		

	}

}
