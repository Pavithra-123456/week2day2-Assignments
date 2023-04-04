package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
        WebElement type = driver.findElement(By.name("firstName"));
        type.sendKeys("Jamal");
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//a[text()='10050']")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("companyName")).clear();
        driver.findElement(By.name("companyName")).sendKeys("TestLeaf.Org");
        driver.findElement(By.name("submitButton")).click();
        driver.close();
        
        
        
        
        
	}

}
