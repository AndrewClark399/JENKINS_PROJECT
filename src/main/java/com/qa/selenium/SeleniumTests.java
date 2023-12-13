package com.qa.selenium;
import org.seleniumhq.selenium.WebDriver;
import org.seleniumhq.selenium.edge.EdgeDriver;
import org.seleniumhq.selenium.By;

public class SeleniumTests {
    private static String DRIVER_PATH = "C:\\Program Files\\edgedriver\\msedgedriver.exe";
    private static String BASE_URL = "http://localhost:3000";
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", SeleniumTests.DRIVER_PATH);
        WebDriver driver = new EdgeDriver();
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
