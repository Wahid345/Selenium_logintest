package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args) {
		
		WebDriver driver = base.getdriver();
		
		  driver.get("https://www.saucedemo.com/");
		  
		  WebElement element = driver.findElement(By.id("user-name"));
		  element.click();
		  element.sendKeys("standard_user");
		  
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click();
		  
		  WebElement app_logo=driver.findElement(By.className("app_logo"));
		  String AppLogo=app_logo.getText();
		  System.out.println(AppLogo);
		  
		  if(AppLogo.equals("app_logo")) {
			  System.out.println("Login Successfully");
		  }
		  else {
			  System.out.println("Login Unsuccessful");
		  }
		  
	}

}
