package for_loop;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practic {
	
	public static void main(String[]args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/buttons");
		//WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		//email.sendKeys("shilpaborkar294@gmail.com");
	//	WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		//pass.sendKeys("Maitreya@123");
		//WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		//login.click();
		//JavascriptExecutor ref=((JavascriptExecutor)driver);     //caste webdriver reference to javascript executorinterface
		//ref.executeScript("window.scroll(0,2032)");
		
		//Point fff=new Point(100,200);
		//driver.manage().window().setPosition(fff);
		
		//Dimension ddd=new Dimension(100,300);
		//driver.manage().window().setSize(ddd);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		//WebElement click=driver.findElement(By.xpath("//button[@id='k9v9i']"));
	
		Actions ref=new Actions(driver);
	ref.moveToElement(doubleclick).doubleClick().build().perform();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ref.moveToElement(rightclick).contextClick().build().perform();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//ref.moveToElement(click).click().build().perform();
	}




	}


