package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Pavithra");
        driver.findElement(By.id("lastNameField")).sendKeys("M");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Pavi");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ece");
        driver.findElement(By.name("description")).sendKeys("To create contact in leaftaps");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("pavithraece2@gmail.com");
        WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select country=new Select(State);
        country.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("To create contact in leaftaps");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String CreateContact=driver.getTitle();
        System.out.println(CreateContact);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
