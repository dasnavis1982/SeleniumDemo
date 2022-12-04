package com.web.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WordPressLoginPage {

    private WebDriver driver;
    private Properties properties;
    private FileInputStream fileInputStream;
    private WebElement webElement;

    public WordPressLoginPage() throws IOException {
        properties = new Properties();
        fileInputStream = new FileInputStream("src/test/java/application.properties");
        properties.load(fileInputStream);
    }

    public void launch() {
        System.setProperty("Webdriver.chrome.driver", properties.getProperty("driverPath"));
        driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));

    }


}