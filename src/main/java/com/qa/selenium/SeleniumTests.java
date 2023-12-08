package com.qa.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class SeleniumTests {
    private String DRIVER_PATH = "C:\Program Files\edgedriver\msedgedriver.exe";
    private String BASE_URL = "http://localhost:3000/home";
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", this.DRIVER_PATH);
        WebDriver driver = new EdgeDriver();
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
