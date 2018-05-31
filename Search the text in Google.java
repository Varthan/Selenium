import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32(4)\\chromedriver.exe");
		String actualtitle="selinium - Google Search";
		WebDriver driver=new ChromeDriver();
    
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selinium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
    
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		String expectedtitle1=driver.getTitle();
    
		if(actualtitle.contentEquals(expectedtitle1))
		{
			System.out.println("Title Correct");
			System.out.println(expectedtitle1);
		}
		else
		{
			System.out.println("Title Incorrect");
			System.out.println(expectedtitle1);
		}
	}
}
