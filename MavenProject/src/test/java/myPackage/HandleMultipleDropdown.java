package myPackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		WebElement Noemployes = driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
		selectOptionFromDropdown(Noemployes, "21 - 25");

	}
	
	public static void selectOptionFromDropdown(WebElement ele, String value) 
	{
		Select drp = new Select(ele);
		
		List<WebElement> dropdown = drp.getOptions();
		
		for( WebElement option  : dropdown)
		{
			if (option.getText().equals(value))
			{
				option.click();
				System.out.println("----------- OPTION SELECTED: "+option.getText());
				break;
			}
		}
		
	}

}
