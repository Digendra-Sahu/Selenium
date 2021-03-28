package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibef_SignUp {
	public static void main(String[] args) {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ibef.org/ibefusers/signupRequest");
		driver.manage().window().maximize();
		

		driver.findElement(By.id("signupFname")).sendKeys("Digendra");
		driver.findElement(By.id("signupLname")).sendKeys("Sahu");
		
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).click();
		
		driver.findElement(By.id("signupEmail")).sendKeys("digendrakumar@sahu.com");
		
		driver.findElement(By.name("signupPassword")).sendKeys("@digendra123");
		
		driver.findElement(By.name("signupCPassword")).sendKeys("@digendra123");
		
		driver.findElement(By.name("signupUserOrg")).sendKeys("sahu");
		
		driver.findElement(By.name("signupUserContact")).sendKeys("9999900000");
		
		String captcha=driver.findElement(By.className("captchaContainer")).getText();
		System.out.println("output:"+captcha);
		driver.findElement(By.id("captchaResult")).sendKeys(captcha);
	}

}
