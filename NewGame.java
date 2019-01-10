package Com.MT.GameOfLife.java;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGame {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://172.16.9.69:8080/201807191550-13/");
		driver.findElement(By.xpath("//*[@class='action-button']")).click();
		Thread.sleep(2000);
		ArrayList<WebElement> ar=(ArrayList<WebElement>) driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for(int i=0;i<=2;i++)
			
		ar.get(i).click();
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='submit' and contains(text(),'Next Generation')]")).click();
		
	
	}

}
