package hotel;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelbooking {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
		    WebDriver driver = (WebDriver) new ChromeDriver();
		    
		    driver.get("https://adactinhotelapp.com/");
		    driver.manage().window().maximize();
		    
		    WebElement user = driver.findElement(By.name("username"));
		    user.sendKeys("udhaya1211");
		    
		    WebElement pass = driver.findElement(By.name("password"));
		    pass.sendKeys("uk144uk144");
		    
		    WebElement log = driver.findElement(By.name("login"));
		    log.click();
		  
		    WebElement location = driver.findElement(By.name("location"));
		    
		    Select select = new Select(location);
		    select.selectByValue("London");
		    
		    WebElement hotel = driver.findElement(By.name("hotels"));
		    Select ho = new Select(hotel);
		    ho.selectByValue("Hotel Creek");
		    
		    WebElement room = driver.findElement(By.name("room_type"));
		    Select roo = new Select(room);
		    roo.selectByValue("Standard");
		    
		    WebElement sub = driver.findElement(By.name("Submit"));
		    sub.click();
		    
		    
		    WebElement rad = driver.findElement(By.name("radiobutton_0"));
		    rad.click();
		    
		    WebElement con = driver.findElement(By.name("continue"));
		    con.click();
		    
		    WebElement u = driver.findElement(By.name("first_name"));
		    u.sendKeys("udhaya");
		   
		    WebElement us = driver.findElement(By.name("last_name"));
		    us.sendKeys("kumar");
		    
		    
		    WebElement usl= driver.findElement(By.name("address"));
		    usl.sendKeys("Udhayakumar");
		    
		    
		    WebElement last = driver.findElement(By.name("cc_num"));
		    last .sendKeys("1234567890123456");
		    
		  WebElement locatio = driver.findElement(By.name("cc_type"));
		    
		    Select selec = new Select(locatio);
		    selec.selectByValue("VISA");
		    
		  WebElement locati = driver.findElement(By.name("cc_exp_month"));
		    
		    Select sele = new Select(locati);
		    sele.selectByValue("12");
		    
		 WebElement loc = driver.findElement(By.name("cc_exp_year"));
		    
		    Select sel = new Select(loc);
		    sel.selectByValue("2022");
		    
		    WebElement no= driver.findElement(By.name("cc_cvv"));
		    no.sendKeys("3214");
		    
		    WebElement n= driver.findElement(By.name("book_now"));
		    n.click();
		    
		  
		    
	}
	
}

		

	 