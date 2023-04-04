package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Email']")).click();
        driver.findElement(By.name("emailAddress")).sendKeys("pavithraece2@gmail.com");
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//a[text()='10050']")).click();
        driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
        //String DuplicateLead=driver.getTitle();
        //System.out.println(DuplicateLead);
        driver.findElement(By.name("submitButton")).click();
        driver.close();
      
        
        
	}

}
