package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutInformation {
    private WebDriver driver;

    public checkoutInformation(WebDriver driver) {
        this.driver = driver;
    }

    // Checkout form fields
    private By firstNameInput = By.id("first-name");
    private By lastNameInput = By.id("last-name");
    private By postalCodeInput = By.id("postal-code");
    private By continueButton = By.id("continue");

    // Additional locators
    private By finishButton = By.id("finish");
    private By backToProductsButton = By.id("back-to-products");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");

    // Fill checkout form
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeInput).sendKeys(postalCode);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void fillInformationAndContinue(String firstName, String lastName, String postalCode) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickContinue();
    }

    // Complete the checkout
    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    // Return to product page after order
    public void clickBackToProducts() {
        driver.findElement(backToProductsButton).click();
    }

    // Open burger menu
    public void openMenu() {
        driver.findElement(menuButton).click();
    }

    // Log out
    public void clickLogout() {
    	driver.findElement(logoutLink).click();
    	}
    public void completeOrderAndLogout() {
        clickFinish();
        clickBackToProducts();
        openMenu();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        clickLogout();
    }
}
