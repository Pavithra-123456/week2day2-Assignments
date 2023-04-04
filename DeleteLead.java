package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        driver.findElement(By.xpath("//span[text()='Phone'] ")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("8526096402");
        driver.findElement(By.name("phoneAreaCode")).sendKeys("4");
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10049");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//a[text()='10049']")).click();
        driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-companyName")).click();
        driver.findElement(By.xpath("//a[text()='Qeagle']")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10049");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        
		
	}

}
