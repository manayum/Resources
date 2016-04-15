import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Download {

    public static void main(String[] args) {

// Create a profile
        FirefoxProfile profile=new FirefoxProfile();

// Set preferences for file type
        profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");

// Open browser with profile
        WebDriver driver=new FirefoxDriver(profile);

// Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// Maximize window
        driver.manage().window().maximize();

// Open APP to download application
        driver.get("http://www.filehippo.com/download_adobe_reader");

// Click on download
        driver.findElement(By.xpath(".//*[@id='program-header']/div[4]/a[1]")).click();

    }

}Now you can see here value is blank so we need to mention which type of file it will not ask if download starts in case.
Note- In this post I am giving values for .exe file(application), in your case if you want to download pdf, excel file etc. you need to mention values (MIME type).
Here you can find their MIME type that will be the values for these settings.
http://www.sitepoint.com/web-foundations/mime-types-complete-list/

