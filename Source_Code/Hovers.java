import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Hovers {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void hoversTest() {
        driver.get("http://the-internet.herokuapp.com/hovers");

        // Find and hover over desired element
        WebElement avatar = driver.findElement(By.className("figure"));
        Actions builder = new Actions(driver);
        builder.moveToElement(avatar).build().perform();

        // Wait until the hover appears
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("figcaption")));

        try {
            // Assert that the hover displayed
            assertThat(driver.findElement(By.className("figcaption")).isDisplayed(), is(Boolean.TRUE));
            
            /**if (driver.findElement(By.className("figcaption")).isDisplayed()) {
                System.out.println("Dislayed");
            } else {
                System.out.println("not displayed");

            }*/
        }
        catch (Exception e)
        {
            System.out.println("Not displayed");
        }
    }
}

