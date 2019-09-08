package Working;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
/*import org.openqa.selenium.Keys;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class workingtest1 {

	 static WebDriver driver;
	
	public static void main(String[] args) {
		
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\sangina\\Downloads\\chromedriver.exe");
			
		// TODO Auto-generated method stub

		driver=new ChromeDriver(); 
		  driver.navigate().to("https://login.yahoo.com/account/create?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F&specId=yidReg");  
		     driver.manage().window().maximize();  
		     driver.findElement(By.id("usernamereg-firstName")).sendKeys("Lion");
		     driver.findElement(By.id("usernamereg-lastName")).sendKeys("King");
		     driver.findElement(By.id("usernamereg-password")).sendKeys("madagascar");
		     driver.findElement(By.id("usernamereg-phone")).sendKeys("2222222222");
		     Select birthmonth= new Select (driver.findElement(By.name("mm")));
		     birthmonth.selectByVisibleText("May");
		     
		     
		     driver.findElement(By.id("usernamereg-day")).sendKeys("67");
		     driver.findElement(By.id("usernamereg-year")).sendKeys("4500");
		     
		     		     
		     driver.findElement(By.id("reg-submit-button")).click(); 		
    
		
	}

}
