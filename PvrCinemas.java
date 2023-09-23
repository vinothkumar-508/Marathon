package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='sidebar-list-item']/a)[5]")).click();
        Thread.sleep(3000);
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='genre']"));
        Select select = new Select(Dropdown);
        select.selectByVisibleText("ANIMATION");
		WebElement Dropdown1 = driver.findElement(By.xpath("//select[@name='lang']"));
		Select select1 = new Select(Dropdown1);
		Thread.sleep(4000);
        select1.selectByVisibleText("ENGLISH");
        Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		Thread.sleep(7000);
        driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='cinemaName']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value='PVR Velachery Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		driver.findElement(By.xpath("//select[@name='timings']")).click();
		driver.findElement(By.xpath("//option[@value='03:00 PM - 06:00 PM']")).click();
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.name("name")).sendKeys("Vinoth Kumar");
		driver.findElement(By.name("email")).sendKeys("vinoth@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("8838659570");
		driver.findElement(By.xpath("//select[@name='food']")).click();
		driver.findElement(By.xpath("//option[@value='No']")).click();
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		}
	}

