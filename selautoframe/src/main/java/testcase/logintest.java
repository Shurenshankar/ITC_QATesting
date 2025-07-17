package testcase;

import pom.loginpage;
import testsetup.basetest;

public class logintest extends basetest {
    public static void main(String[] args) {
        logintest test = new logintest();
        test.setUp();
        test.driver.get("https://practicetestautomation.com/practice-test-login/");
        loginpage loginPage = new loginpage(test.driver);
        loginPage.login("student", "Password123");
        // You can add validations here
        String currentUrl = test.driver.getCurrentUrl();
        System.out.println("Login success. Navigated to: " + currentUrl);
        test.tearDown();
    }
}