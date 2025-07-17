package seleniumjavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        // Step 2: Navigate to the dropdown page
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);
        // Step 3: Locate the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        // Step 4: Select option by visible text
        select.selectByVisibleText("Option 1");
        System.out.println("Selected by visible text: Option 1");
        Thread.sleep(1000);
        // Step 5: Select option by index (2 = Option 2, index starts at 0)
        select.selectByIndex(2);
        System.out.println("Selected by index: Option 2");
        Thread.sleep(1000);
        // Step 6: Select option by value
        select.selectByValue("1");
        System.out.println("Selected by value: 1 (Option 1)");
        Thread.sleep(1000);
        // Step 7: Close browser
        driver.quit();
	}

}
