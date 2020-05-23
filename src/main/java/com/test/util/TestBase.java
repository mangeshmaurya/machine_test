package com.test.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() throws FileNotFoundException {
        try {
            prop = new Properties();
            FileInputStream fis= new FileInputStream("F:\\Test\\src\\main\\java\\com\\test\\config\\config.properties");
            prop.load(fis);

        }catch(IOException e) {
            e.getMessage();
        }
    }


    public static void intialization() {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","F:\\Test\\webdriver\\chromedriver.exe");
            driver =new ChromeDriver();
        }
        else if(browserName.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "F:\\Test\\webdriver\\chromedriver.exegeckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
}
