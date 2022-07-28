package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropdownSorted {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		//Retrive list elements
		WebElement drpElements =  driver.findElement(By.name("category_id"));
		Select drpselect = new Select(drpElements);
		
		List<WebElement> options = drpselect.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tmpOriginalList = new ArrayList();
		
		for(WebElement option : options) {
			originalList.add(option.getText());
			tmpOriginalList.add(option.getText());
		}
		
		System.out.println(originalList);
		System.out.println(tmpOriginalList);
		
		Collections.sort(tmpOriginalList);
		System.out.println("---------------Ordernamiento de la lista ---------------");
		System.out.println(tmpOriginalList);

	}

}
