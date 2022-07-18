package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launch the webpage
		driver.get("https://demo.nopcommerce.com/register");
		
		//locate the element
		WebElement searchStore = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		// idDisplayed()	isEnabled()	--> BOOLEAN
		System.out.println("Display status: "+searchStore.isDisplayed());
		
		System.out.println("Enabled status: "+searchStore.isEnabled());
		
		//isSelected()	--> BOOLEAN
		WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //false
		
		//selecting the male button 
		male.click();
		
		System.out.println(male.isSelected()); //true
		System.out.println(female.isSelected()); //false
		
		//selecting the male button 
		female.click();
		
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //true

	}

}
