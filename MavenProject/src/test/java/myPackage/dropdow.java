package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select drpCountry = new Select(drpCountryEle);
		
		//Select option from dropdown by text
		//drpCountry.selectByVisibleText("Denmark");
		
		//select option from dropdown by value
		//drpCountry.selectByValue("10");
		
		//select option from dropdown by index
		drpCountry.selectByIndex(12);
		
		
		
	}

}
