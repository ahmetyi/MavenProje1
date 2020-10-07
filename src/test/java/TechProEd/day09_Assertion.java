package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day09_Assertion {

   private static WebDriver driver;         //private istege baglidir.

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        String title= driver.getTitle();

        Assert.assertEquals("Google Arama Sayfasi",title);
    }

    @Test
    public void test2(){
        driver.get("http://Amazon.com");
        String title1=driver.getTitle();

        boolean iceriyorMu=title1.contains("Amazon");//true ya da false
        Assert.assertTrue(iceriyorMu);

    }

    @Test
    public void test3(){
        driver.get("http://facebook.com");
        String title2=driver.getTitle();

        boolean iceriyorMu=title2.contains("Youtube");
        Assert.assertFalse(iceriyorMu);
        //Beklenen gerceklesirse kalani calistirir.
        System.out.println("Test dogrulama bitti");

    }
    @Test
    public void test4(){
        driver.get("http://google.com");
        String title= driver.getTitle();

        System.out.println("Merhabalar..");
        Assert.assertEquals("Google Arama Sayfasi",title);

        //Beklenen gerceklesmiyorsa Kalani calistirmiyor.
        System.out.println("Test dogrulama islemi bitti.");


    }





    @AfterClass
    public static void tearDown(){

    driver.quit();


    }




}
