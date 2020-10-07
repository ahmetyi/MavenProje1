package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day08_IlkOrnek {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test(){
        //google.com'a gidicem sayfamin title bakacagim.Google kelimesi geciyorsa testim basarili.
        driver.get("https://google.com");

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("teardown calisti");
        driver.quit();
    }

}
