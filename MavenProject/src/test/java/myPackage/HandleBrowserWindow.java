package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		// Get id Web page 
		//getWindowHandle()
		//id windows change in every execution program.
		//String windowId = driver.getWindowHandle();
		//System.out.println(windowId);
		
		
		driver.findElement(By.xpath("//a[text()=\'OrangeHRM, Inc\']")).click(); //opens another browser window - child window
		
		Set<String> windowIDs = driver.getWindowHandles(); // return ID's of multiple browser windows
		
		/*
		//using an iterator element
		Iterator<String> it = windowIDs.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println("Parent window ID:" + parentWindow);
		System.out.println("Child window ID:" + childWindow);
		*/
		List<String> windowsID = new ArrayList(windowIDs);
		/*
		String parentWindow = windowsID.get(0);
		String childWindow = windowsID.get(1);
		
		System.out.println("Parent window ID:" + parentWindow);
		System.out.println("Child window ID:" + childWindow);
		
		//How to use windows ID's for switching
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: "+ driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println("Child window title: "+ driver.getTitle());
		*/
		for (String win : windowsID) {
			String title = driver.switchTo().window(win).getTitle();
			System.out.println("Name webpage: " + title);
			
			if (title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
		//driver.close(); // close the current window
		//driver.quit(); //close browser

	}

}
