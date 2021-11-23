package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Testing_Facebook_Login {

    private static WebDriver driver;
    @BeforeAll
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
    }
    @Test
    @DisplayName("Going To Facebook")
    @Order(1)
    public void step_1_go_to_facebook_page() throws InterruptedException {
        driver.get("https://facebook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(), \"Allow All Cookies\")]")).click();
        assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up","The page does not match");
    }

    @Test
    @DisplayName("Filling The Form")
    @Order(2)
    public void step_2_fill_form() throws InterruptedException {
        Thread.sleep(500);
        //was zu tun
        //daten
        String username = "saidtahali";
        String password = "1234567890";
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(password);
        //ergibniss
        assertTrue(true);
    }

    @Test
    @DisplayName("Clicking Login")
    @Order(3)
    public void step_3_click_login_button() throws InterruptedException {
        //was zu tun
        //daten
        //ergibniss
        driver.findElement(By.xpath("//button[1]")).click();
        Thread.sleep(3000);
        try {
            //assertEquals(driver.findElement(By.xpath("//label")).getText(), "Welcome Said");
        }
        catch (Exception e){
            e.printStackTrace();
            driver.close();
        }
        driver.close();
    }

}
