package FileWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileElement {
	public static void main(String[] args)throws IOException{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Excel\\target\\msedgedriver.exe");	
	
		
         WebDriver driver = new EdgeDriver();
      
         String url="https://www.facebook.com/";
         driver.navigate().to(url);
         driver.manage().window().maximize();
         WebElement email = driver.findElement(By.id("email"));
         email.sendKeys("varunkumarsaravanan@gmail.com");
         WebElement pswd= driver.findElement(By.name("pass"));
         pswd.sendKeys("Varun@9198");
		
	}
	
}

