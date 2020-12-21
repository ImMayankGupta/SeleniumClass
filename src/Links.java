
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Links']")).click();
		Thread.sleep(2000);

		
		String parentTabName = driver.getWindowHandle();
		
		System.out.println("Windown name="+parentTabName);
		
		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
		
	    ArrayList<String> listOfTabs = new ArrayList<String>(driver.getWindowHandles());
	    
	    for (String childTab:listOfTabs){
            driver.switchTo().window(childTab);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//img[contains(@src,'Toolsqa')]")).isDisplayed();
            Thread.sleep(2000);
    }
	    driver.switchTo().window(parentTabName);
	    Thread.sleep(20000); 
	    
	    List<WebElement> links = driver.findElements(By.xpath("//a[@href='javascript:void(0)']"));
	    for (WebElement link : links) {
	    	link.click();
	    	Thread.sleep(2000);
	    }
	}
}


