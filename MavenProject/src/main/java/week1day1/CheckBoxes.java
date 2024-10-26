package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		driver.findElement(By.xpath("//(div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[1]")).click();
		
	}

}
