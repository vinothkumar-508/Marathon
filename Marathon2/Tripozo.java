package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tripozo {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.tripozo.com/");
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("(//input[@id='search-form_origin'])[1]"));
		source.sendKeys("MAA");
		driver.findElement(By.xpath("(//span[text()='Chennai'])[1]")).click();
		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("(//input[@id='search-form_destination'])[1]"));
		destination.sendKeys("GOX");
		driver.findElement(By.xpath("(//span[text()='New Goa Manohar International Airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='12']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Refundable'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='6 AM - 12PM'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Air India'])[1]")).click();
		List<WebElement> Airlines = driver.findElements(By.xpath("//div[@class='airline-list']//span[@class='selected']"));

		boolean allSelected = true;
		for (WebElement webElement : Airlines) {
			if (!webElement.getText().equals("Air India")) {
				allSelected = false;
				break;

			}
		}
		if (allSelected) {
			System.out.println("All displayed airlines are selected.");
		} else {
			System.out.println("Not all displayed airlines are selected.");
		}
		driver.findElement(By.xpath("(//button[text()='Choose'])[1]")).click();
		WebElement selectedAirline = driver.findElement(By.xpath("(//span[text()='Refundable'])[1]"));
		if (selectedAirline.getText().contains("Refundable")) {
			System.out.println("The selected airline is refundable.");
		} else {
			System.out.println("The selected airline is not refundable.");
		}
		WebElement scr = driver.findElement(By.xpath("//span[text()='Flight Info']"));
		scr.click();
		Thread.sleep(2000);
		WebElement scr1 = driver.findElement(By.xpath("(//div[@class='ant-modal-body'])[1]"));
		File screen = scr1.getScreenshotAs(OutputType.FILE);

		File des = new File("./snap/img3.jpeg");

		FileUtils.copyFile(screen, des);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		
		WebElement scr2 = driver.findElement(By.xpath("//span[text()='Fare Info']"));
		scr2.click();
		Thread.sleep(2000);
		WebElement scr3 = driver.findElement(By.xpath("//div[@class='fareRule-container']"));
	
		File screen1 = scr3.getScreenshotAs(OutputType.FILE);

		File des1 = new File("./snap/img4.jpeg");

		FileUtils.copyFile(screen1, des1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		

	}

}
