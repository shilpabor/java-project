package for_loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {
	
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\shilp\\OneDrive\\Desktop\\Pravin");
		
		
	//	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		//password.sendKeys("Maitreya@123");
	//	WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		//login.click();
		//Thread.sleep(2000);
	
		//WebElement profile=driver.findElement(By.xpath("//a[@tabindex='-1']"));
		//profile.click();
		
	}

}
