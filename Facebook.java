package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Pavithra");
        driver.findElement(By.name("lastname")).sendKeys("M");
        driver.findElement(By.name("reg_email__")).sendKeys("8526096402");
        driver.findElement(By.id("password_step_input")).sendKeys("pavi@123");
        WebElement day = driver.findElement(By.id("day"));
        Select num=new Select(day);
        num.selectByIndex(19);
        WebElement month = driver.findElement(By.id("month"));
        Select word=new Select(month);
        word.selectByIndex(5);
        WebElement year = driver.findElement(By.id("year"));
        Select numbers=new Select(year);
        numbers.selectByIndex(28);
        driver.findElement(By.className("_8esa")).click();
        driver.findElement(By.name("websubmit")).click();










	}

}
