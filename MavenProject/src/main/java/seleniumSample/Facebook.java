package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Pavithra");
		driver.findElement(By.name("lastname")).sendKeys("Siva");
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select dateDD=new Select(date);
		dateDD.selectByValue("8");
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select monthDD=new Select(month);
		monthDD.selectByValue("7");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select yearDD=new Select(year);
		yearDD.selectByValue("1998");
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//span[1]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("spavithra8798@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("P@ssw0rd");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		}

}
