package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Testing_Facebook_Login {

    private static WebDriver driver;
    @BeforeAll
    public static void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    @DisplayName("Going To Facebook")
    @Order(1)
    public void step_1_go_to_facebook_page() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(5000);
        //was zu tun
        //daten
        //ergibniss
        assertTrue(true);
    }

    @Test
    @DisplayName("Filling The Form")
    @Order(2)
    public void step_2_fill_form(){
        //was zu tun
        //daten
        //ergibniss
        assertTrue(true);
    }

    @Test
    @DisplayName("Clicking Login")
    @Order(3)
    public void step_3_click_login_button(){
        //was zu tun
        //daten
        //ergibniss
        assertTrue(true);
        driver.close();
    }

}
