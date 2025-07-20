package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LoginPage;
import pom.ProductPage;
import pom.checkoutInformation;
import testsetup.BaseTest;

public class LoginTest extends BaseTest {
    @Test(priority=2)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Assert user is redirected to inventory page after login
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"), "Valid login failed.");
    }

    @Test(priority=1)
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_password");

        String errorMsg = loginPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("Username and password do not match any user in this service"),
            "Expected error message not displayed.");
    }  
    @Test
    public void testAddBackpackToCartAndCheckout() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);

        // Perform full flow: open product, add to cart, click cart icon, then checkout
        productPage.selectBackpackAddToCartAndCheckout();

        // Assert that user is on checkout page
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-one"), "Did not navigate to checkout page");
    }

//    @Test
//    public void testCheckoutInformationFormSubmission() {
//        checkoutInformation checkoutInfo = new checkoutInformation(driver);
//        checkoutInfo.fillInformationAndContinue("John", "Doe", "12345");
//        checkoutInfo.completeOrderAndLogout();
//
//        // Assert that user navigated to next step
//        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"), "Logout unsuccessful or wrong redirection.");    }
//
//
//
// 
}
