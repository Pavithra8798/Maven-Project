package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("009");
		driver.findElement(By.name("phoneNumber")).sendKeys("7667762609");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//driver.findElement(By.linkText("Delete")).click();
		//driver.findElement(By.linkText("Find Leads")).click();
		}
}
