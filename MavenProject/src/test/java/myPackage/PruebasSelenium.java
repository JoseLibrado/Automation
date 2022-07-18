package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author afore.jsoto
 *
 */
public class PruebasSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the properties to get the web driver functionality from the executable application.
		
		/*
		 * //Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afore.jsoto\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		// object from class to have access an use the methods.
		WebDriver driver = new ChromeDriver();
		// method  to open an specific url
		
		
		
		//Fire Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\afore.jsoto\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver(); //FirefoxDriver driver = new FirefoxDriver();
		
		
		//Edge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\afore.jsoto\\Downloads\\edgedriver_win64\\msedgedriver.exe");		
		WebDriver driver = new EdgeDriver(); //edgeDriver driver = new EdgeDriver();
		
		
		// settings to get the web driver from a manager.
		//chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//firefox browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		*/
		
		//firefox browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.federico-toledo.com/sitios-de-prueba-para-practicar/");
		
		//get the webpage tittle
		System.out.println("Tittle from the web page: "+driver.getTitle());
		System.out.println("Current url from the web page: "+driver.getCurrentUrl());
		
		//System.out.println("source code from the web page: "+driver.getPageSource());


	}

}
