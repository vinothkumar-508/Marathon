package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoHotels {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='CityData'])[1]")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Goa'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkin_checkout']")).click();
		driver.findElement(By.xpath("//td[@title='2023-10-12']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ant-picker-input']"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@title='2023-10-13']")).click();
		driver.findElement(By.xpath("//span[text()=' Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Air Conditioning']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Parking']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='flexRow'])[6]")).click();
		driver.findElement(By.xpath("(//span[text()='Choose'])[1]")).click();
		Thread.sleep(2000);
		String checkinDate = driver.findElement(By.xpath("(//p[@class='pl-2'])[1]")).getText();
		if (checkinDate.contains("12 Oct 2023")) {
			System.out.println("Verify the checkin date :" +checkinDate);
			
		} else {
			System.out.println("Checkin date is incorrect");

		}
		driver.findElement(By.xpath("//i[@class='icon-angle-down']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		WebElement scr = driver.findElement(By.xpath("//span[text()='Amenities & Details']"));
		scr.click();
		Thread.sleep(2000);
		WebElement scr1 = driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
		File screen = scr1.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/img6.jpeg");
		FileUtils.copyFile(screen, des);
		driver.findElement(By.xpath("//button[@class='ant-modal-close']")).click();
		

	}

}
