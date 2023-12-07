package com.qa.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    private String DRIVER_PATH = "";
    private String BASE_URL = "http://localhost/home";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", this.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        String expectedTitle = "ToDo List - Home";
        String actualTitle = "";
        driver.get(this.BASE_URL);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
