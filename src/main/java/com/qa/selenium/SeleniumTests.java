package com.qa.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class SeleniumTests {
    private static String DRIVER_PATH = "C:\\Program Files\\chromedriver\\chromedriver.exe";
    private static String BASE_URL = "http://localhost:3000";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", SeleniumTests.DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        String expectedTitle = "React App";
        String actualTitle = "";
        driver.get(SeleniumTests.BASE_URL);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
