package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
				
		//1) select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2) select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.print(checkboxes.size());
		/*
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
		for (WebElement chbox : checkboxes) {
			chbox.click();
		}
		
		//3 select multiple check boxes by choice
		for (WebElement chbox : checkboxes) {
			String name = chbox.getAttribute("id");
			if (name.equals("monday") || name.equals("sunday")) {
				chbox.click();
			}
		}		
		int totalch = checkboxes.size();

		//4) elect the last check boxes
		for (int i = totalch - 4 ; i < totalch; i++) {
			checkboxes.get(i).click();
		}
		*/
		int totalch = checkboxes.size();
		for (int i = 0; i < totalch; i++) {
			if (i < 3) {
				checkboxes.get(i).click();
			}
			
		}
		

	}

}
