package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Locate the Login button element
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Chrome");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industryWE=driver.findElement(By.name("industryEnumId"));
		Select industryDD=new Select(industryWE);
		industryDD.selectByValue("IND_HARDWARE");
		WebElement ownershipWE=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDD=new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		WebElement sourceWE=driver.findElement(By.name("dataSourceId"));
		Select sourceDD=new Select(sourceWE);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingWE=driver.findElement(By.name("marketingCampaignId"));
		Select marketingDD=new Select(marketingWE);
		marketingDD.selectByValue("9000");
		WebElement stateWE=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateDD=new Select(stateWE);
		stateDD.selectByValue("TX");
		driver.findElement(By.id("numberEmployees")).sendKeys("8");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}
