package myPackage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		
		//selectChoiceValues(driver, "all");
		selectChoiceValues(driver, "choice 2", "choice 1", "choice 2 1", "choice 2 3","choice 6 2 1","choice 6 2 2","choice 6 2 3");
		

	}

	public static void selectChoiceValues( WebDriver driver, String...strings ) {
		
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		//System.out.println(strings[0].equalsIgnoreCase("all"));
		
		if(!strings[0].equalsIgnoreCase("all")) {
			
			for(WebElement option :choiceList){
				
				String text = option.getText();
				
				for(String val : strings){
					
					if(text.equals(val)) {
						option.click();
					}
				}
			}
			
		} else {
			for(WebElement item : choiceList) {
				item.click();
			}
		}
	}
	
	
}
