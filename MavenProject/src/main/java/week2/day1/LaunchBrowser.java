package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Locate the Login button element
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suresh");
		WebElement sourceWE=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD=new Select(sourceWE);
		sourceDD.selectByIndex(7);
		WebElement industryWE=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD=new Select(industryWE);
		industryDD.selectByValue("IND_SOFTWARE");
		WebElement marketingWE=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDD=new Select(marketingWE);
		marketingDD.selectByVisibleText("Car and Driver");
		WebElement ownerWE=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerDD=new Select(ownerWE);
		ownerDD.selectByValue("OWN_PARTNERSHIP");
		WebElement currencyWE=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDD=new Select(currencyWE);
		currencyDD.selectByValue("INR");
		WebElement countryWE=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD=new Select(countryWE);
		countryDD.selectByValue("IND");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636009");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7667762609");
		driver.findElement(By.name("submitButton")).click();
		String leadId=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		driver.close();
		
	}

}
