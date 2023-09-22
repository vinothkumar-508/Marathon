package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//div[@id='nav-flyout-searchAjax']/div/div/div/div[1]/div[1]/div")).click();
		WebElement Results = driver.findElement(By.xpath("//div[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div"));
		System.out.println(Results.getText());
		WebElement Brand1 = driver.findElement(By.xpath("//li[@id=\"p_89/American Tourister\"]/span/a/div/label/i"));
		Brand1.click();
		Thread.sleep(2000);
		WebElement Brand2 = driver.findElement(By.xpath("//li[@id=\"p_89/Skybags\"]/span/a/div/label/i"));
		Brand2.click();
	    driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	    driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
	    WebElement Title = driver.findElement(By.xpath("//div[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span"));
	    System.out.println(Title.getText());
	    WebElement DiscountPrice = driver.findElement(By.xpath("//div[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div"));
	    System.out.println(DiscountPrice.getText());
	    String title = driver.getTitle();
		System.out.println(title);
	}

}
