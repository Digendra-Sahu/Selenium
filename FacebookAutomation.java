package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("welcome to selenium training");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php?locale=EN_US&campaign_id=973072070&extra_1=s%7Cc%7C256741383347%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=256741383347&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006292691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-295862466660%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D19894516786%26param1%3D%26param2%3D&gclid=EAIaIQobChMI8cS_tpnQ7wIVFrqWCh0XkgMiEAAYASABEgJsGPD_BwE");

		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("admin");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("admin@gmail");
		Select dd= new Select(driver.findElement(By.id("day")));
        dd.selectByValue("23");
        Thread.sleep(2000);
    	Select dd1= new Select(driver.findElement(By.id("month")));
        dd1.selectByValue("8");
        Thread.sleep(2000);
    	Select dd2= new Select(driver.findElement(By.id("year")));
        dd2.selectByValue("1998");
        WebElement radio1 = driver.findElement(By.cssSelector("input[value='2']"));							

        radio1.click();
        driver.findElement(By.name("websubmit")).click();
	}
}
