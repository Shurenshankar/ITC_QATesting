package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By backpackProduct = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack"); // ✅ Correct
    private By cartIcon = By.className("shopping_cart_link"); 
    private By checkoutBtn = By.id("checkout");  // <-- added this

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBackpackProduct() {
        driver.findElement(backpackProduct).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }

    public void selectBackpackAddToCartAndCheckout() throws InterruptedException {
    	Thread.sleep(4000);
        openBackpackProduct();
        addToCart();
        clickCartIcon();
        clickCheckout();
    }
}
