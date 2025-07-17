package seleniumjavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testsample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	        // Step 1: Open the test form page
	        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
	        Thread.sleep(5000);
	        // Step 2: Fill the username field
	        WebElement username = driver.findElement(By.name("username"));
	        username.clear();
	        username.sendKeys("Shuren");
	        
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Shuren002");
	        
	        WebElement commens = driver.findElement(By.name("password"));
	        commens.clear();
	        commens.sendKeys("It is personal infomation site ");
	        // Step 3: Click the Submit button
	        WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));
	        submitBtn.click();
	        // Step 4: Wait and verify result
	        Thread.sleep(5000);
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
