package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("democsr");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
WebElement ele = driver.findElement(By.partialLinkText("CRM"));
ele.click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nasreen");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sharuk");
WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sec = new Select(sourceDD);
sec.selectByIndex(2);
WebElement IndustryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select sec1 = new Select(IndustryDD);
sec1.selectByVisibleText("Computer Software");
WebElement MarketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select sec2 = new Select(MarketingCampaignDD);
sec2.selectByValue("CATRQ_CARNDRIVER");
driver.close();
	}

}
