import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBroken {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Broken Links - Images']")).click();
		Thread.sleep(2000);
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		System.out.println("Total no. of images are " + imagesList.size());
		
		for (WebElement imgElement : imagesList) {
				if (imgElement.getAttribute("naturalWidth").equals("0"))
			    {
			        System.out.println(imgElement.getAttribute("outerHTML") + " is broken.");
			    }
		}
	}
}
