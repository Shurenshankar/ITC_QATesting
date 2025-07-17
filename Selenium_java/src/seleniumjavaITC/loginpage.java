package seleniumjavaITC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
        username.sendKeys("tomsmith");
     
        
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("SuperSecretPassword!");
        
        
        WebElement FieldBox3 = driver.findElement(By.xpath("//button[@type='submit']"));
        FieldBox3.click();
        Thread.sleep(5000);
        // Step 4: Print the title of the results page
        System.out.println("Results Page Title: " + driver.getTitle());
	}

}
