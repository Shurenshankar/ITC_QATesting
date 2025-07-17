package seleniumjavaITC;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    //Thread.sleep(2000);
	    
	    // Step 3: Take screenshot and store it as a file
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Step 4: Define target file location
        File destination = new File("C:\\Users\\LabsKraft\\Desktop\\file\\screenshot.png");
        // Step 5: Copy the screenshot to destination
        Files.copy(screenshot, destination);
        System.out.println("Screenshot saved as: " + destination.getAbsolutePath());
        // Step 6: Close the browser
        driver.quit();

	}

}
