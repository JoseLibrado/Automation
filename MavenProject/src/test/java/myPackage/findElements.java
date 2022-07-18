package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// method --------------------->> findElement() <<---------------------
		/*
		//1 -> RETURNIGa single element by xpath that represent just an element
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		searchElement.sendKeys("XYZ");	
		
		//2 return the first elemento from a group of elements
		WebElement ele = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		System.out.println(ele.getText());
		
		//3 return an exception when the method not finds anything 
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button//login"));
		
		
		// method --------------------->> findElements(). <<---------------------
		/*
		 * This method returns a list of elements of type WebElement
		 
		// 1) --> returnig how many elements match with the xpath location
		List<WebElement> links = driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		System.out.println("Number of elements: "+links.size());

		for(WebElement ele : links)
		{
			System.out.println(ele.getText());
		}
		
		
		// 2) --> When use findElements method whit and xpath that contains just one element, this capture inside a list the that only element.
		List<WebElement> logo = driver.findElements(By.xpath("//*[@id=\"small-searchterms\"]"));
		System.out.println(logo.size());
		
		*/
		
		// 3) --> When use findElements method whit and xpath that not match with some location, the method returns cero, in difference whit findElement that return an exceptions response.
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/a/img"));
		System.out.println(elements.size());
		

	}

}
