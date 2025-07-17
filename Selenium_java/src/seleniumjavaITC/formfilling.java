package seleniumjavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class formfilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	        // Step 1: Open the test form page
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        Thread.sleep(2000);
	        // Step 2: Fill the username field
	        WebElement username = driver.findElement(By.name("username"));
	        username.clear();
	        username.sendKeys("student");
	        
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Password123");
	        // Step 3: Click the Submit button
	        WebElement submitBtn = driver.findElement(By.id("submit"));
	        submitBtn.click();
	        // Step 4: Wait and verify result
	        Thread.sleep(8000);
	        // Verify the result page contains submitted data
	        String pageSource = driver.getPageSource();
	        if (pageSource.contains("mytestuser")) {
	            System.out.println("Button click successful, data submitted.");
	        } else {
	            System.out.println("Submission failed or data not found.");
	        }
	        // Step 5: Close browser
	        driver.quit();
	}

}
