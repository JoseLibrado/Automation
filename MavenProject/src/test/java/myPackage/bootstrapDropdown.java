package myPackage;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.hdfcbank.com/");
		driver.navigate().to("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//id[@class='nvpush_cross']")).click();
		
		driver.findElement(By.xpath("//div[@class='drp1']")).click();
		
		List<WebElement> productList = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		selectOptionFromDropdown(productList, "6");
		
		List<WebElement> drp2 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		selectOptionFromDropdown(drp2, "1");
		
		
		//JOptionPane.showMessageDialog(null, productList.size());		

		
		driver.close();
	}
	
	public static void selectOptionFromDropdown(List<WebElement> dropdown, String NoOption)
	{
		for( WebElement item : dropdown) 
		{
			if(item.getAttribute("value").equals("3"))
			{
				System.out.println("Transparent Option: "+item.getText());
			}
						
		}
	}

}
