package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailInputBox = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		
		emailInputBox.clear();
		
		emailInputBox.sendKeys("admin123@gmail.com");
		
		//get input value with getAttribute() method
		System.out.println("Value from input: "+emailInputBox.getAttribute("value"));
		
		//use getText() method to identify the difference between methods getAttribute() vs getText();
		
		System.out.println("Text value: "+emailInputBox.getText());
		
		System.out.println("------------------------------------");
		//button
		WebElement button = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		System.out.println("Getting attribute from button: "+button.getAttribute("type"));
		
		System.out.println("getting text from button: "+button.getText());
	}

}
