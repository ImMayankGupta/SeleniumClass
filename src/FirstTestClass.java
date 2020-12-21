import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
								
		driver.manage().window().maximize();
		
		driver.get("https://bestbuy.com/");
		
		driver.findElement(By.xpath("(//img[@alt='United States'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(@class,'c-close')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gh-search-input")).click();
		driver.findElement(By.id("gh-search-input")).sendKeys("iPhone 12");
		
		driver.findElement(By.id("gh-search-input")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='esg-standard']//a)[1]")).click();
		
//		driver.get("https://google.com/");
//		
//		driver.findElement(By.name("q")).sendKeys("Car");
//		
//		driver.findElement(By.name("q")).submit();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//div[@class='g'])[1]")).click();
//		
//		Thread.sleep(10000);
//		
//		driver.quit();
		
	}

}
