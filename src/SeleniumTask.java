//CHINMAY CHAWATHE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.JavascriptExecutor;

public class SeleniumTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\BOOKS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		driver.findElement(By.className("caret")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Executive Team")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("News")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Corporate Partners")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='caret'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='caret'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='caret'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='caret'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		Thread.sleep(2000);
		driver.findElement(By.name("Name")).sendKeys("Chinmay Chawathe");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("chinmay1609@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
		driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
		Thread.sleep(3000);
		
		
		
		
		
		System.out.println("Successfully Tested All The Elements and Pages!");
		
		
		
		
		
		
		
		
		
	}

}
