package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day08_BeforeAfterClass {
    @BeforeClass
    public static void setUp(){
        System.out.println("setUp calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("teardown calisti");
    }

}
