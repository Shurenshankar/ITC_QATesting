package steps;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import java.time.Duration;
public class RegistrationSteps {
    WebDriver driver;
    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @When("the user enters first name {string}")
    public void the_user_enters_first_name(String fname) {
        driver.findElement(By.id("firstName")).sendKeys(fname);
    }
    @And("the user enters last name {string}")
    public void the_user_enters_last_name(String lname) {
        driver.findElement(By.id("lastName")).sendKeys(lname);
    }
    @And("the user selects gender {string}")
    public void the_user_selects_gender(String gender) {
        driver.findElement(By.xpath("//label[text()='" + gender + "']")).click();
    }
    @And("the user enters mobile number {string}")
    public void the_user_enters_mobile_number(String num) {
        driver.findElement(By.id("userNumber")).sendKeys(num);
    }
    @And("the user selects hobbies {string} and {string}")
    public void the_user_selects_hobbies_and(String hobby1, String hobby2) {
        driver.findElement(By.xpath("//label[text()='" + hobby1 + "']")).click();
        driver.findElement(By.xpath("//label[text()='" + hobby2 + "']")).click();
    }
    @And("the user selects state {string} and city {string}")
    public void the_user_selects_state_and_city(String state, String city) {
        WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
        stateInput.sendKeys(state);
        stateInput.sendKeys(Keys.ENTER);
        WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
        cityInput.sendKeys(city);
        cityInput.sendKeys(Keys.ENTER);
    }
    @And("the user submits the form")
    public void the_user_submits_the_form() {
        driver.findElement(By.id("submit")).click();
    }
    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() throws InterruptedException {
        WebElement modalTitle = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertEquals("Thanks for submitting the form", modalTitle.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}