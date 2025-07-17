package seleniumjavaITC;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class confirmation_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        // Step 2: Navigate to the dropdown page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        Thread.sleep(2000);
        // Step 3: Locate the dropdown element
        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlertBtn.click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert says: " + alert1.getText());
        alert1.accept(); // Accept the alert
        Thread.sleep(1000);
        
        WebElement jsConfirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsConfirmBtn.click();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirmation says: " + alert2.getText());
        alert2.dismiss(); // Dismiss the alert
        Thread.sleep(1000);
        
        WebElement jsPromptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPromptBtn.click();
        Thread.sleep(1000);
        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt says: " + alert3.getText());
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("Selenium Tester");
        alert3.accept(); // Accept after entering text
        Thread.sleep(1000);
        
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println("Final Result: " + resultText);
	}
}
