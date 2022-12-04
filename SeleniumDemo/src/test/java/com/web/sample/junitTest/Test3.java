package com.web.sample.junitTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    WebDriver driver;
    @Test
    public void lunch(){
        System.setProperty("webdriver.chrome.driver", "/User/navisalfredjeromefrancisantonyraj/Downloads/chromedriver");
        System.out.println("Hello");
        driver = new ChromeDriver();

        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
    }
}
