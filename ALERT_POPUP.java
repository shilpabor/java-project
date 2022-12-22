package for_loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_POPUP {
	
	public static void main(String[]args) throws Exception
	{
	///	System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
//		driver.get("https://courses.letskodeit.com/practice");
		//WebElement button=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
	//	Thread.sleep(2000);
	//	button.click();
	 //   driver.switchTo().alert().accept();
	//	Thread.sleep(2000);
	//	button.click();
	//	driver.switchTo().alert().dismiss();
	//	Thread.sleep(2000);
	//	button.click();
//	String text=driver.switchTo().alert().getText();
	//System.out.println(text);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement button=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		button.click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		
	}

}
