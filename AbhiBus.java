package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn active text tertiary md active button']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@id='service-operator-agent-name-1693568567']"));
		System.out.println(element.getText());
		driver.findElement(By.xpath("//div[@id=\"seat-filter-bus-type\"]/a[4]/span[2]")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[@id=\"service-operator-select-seat-1675352109\"]/div/small"));
		System.out.println(element1.getText());
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//button[span='SL6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"place-container\"]/div[1]/label/div/p[1]")).click();
		driver.findElement(By.xpath("//div[@id=\"place-container\"]/div[1]/label/div/p[1]")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@id=\"seating-selected-seat-details\"]/span[1]"));
		System.out.println(element2.getText());
		WebElement element3 = driver.findElement(By.xpath("//div[@id=\"seating-selected-seat-details\"]/span[2]"));
		System.out.println(element3.getText());
		String title = driver.getTitle();
		System.out.println(title);
	

	}

}
