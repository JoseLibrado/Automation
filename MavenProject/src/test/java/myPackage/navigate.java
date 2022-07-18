package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		// Accepts only string parameter 
		driver.get("https://mercadolibre.com");
		//driver.get("https://amazon.com");
		
		driver.navigate().to("https://amazon.com"); // accepts  string url and url instance form a class
		
		driver.navigate().back(); // return to before page
		driver.navigate().forward(); // go to the next page
		
		driver.navigate().refresh(); // reload the actual page.

	}

}
