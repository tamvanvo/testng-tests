package com.google.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Search {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){}

    @AfterClass(alwaysRun = true)
    public void tearDown() {this.driver.quit();}

    @Test(groups = {"p1", "pageLoads"})
    public void loadPage() {
        openChromeBrowser("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test(groups = {"p2"}, dependsOnMethods = "loadPage")
    public void search() {
        String str = "Tricentis";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='q']")));
        searchBox.sendKeys(str);
        System.out.println("---- Done");
    }

    private void openChromeBrowser (String baseURL) {
        WebDriver driver = null;
        try{
            String chromeDriverPath = System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe";
            System.out.println("---- Opening chrome browser");
            DesiredCapabilities capability = new DesiredCapabilities();
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            capability.setJavascriptEnabled(true);
            capability.setCapability("chrome.switches", "--start-maximized");
            capability.setCapability(ChromeOptions.CAPABILITY, new ChromeOptions());
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            driver = new ChromeDriver(capability);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.get(baseURL);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        this.driver = driver;
    }
}
