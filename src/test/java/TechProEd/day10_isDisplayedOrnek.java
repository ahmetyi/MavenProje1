package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day10_isDisplayedOrnek {
static WebDriver driver;
@BeforeClass
   public static void setUp(){
    WebDriverManager.chromedriver().setup();


}
@Before
    public void beforeMethod(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://bestbuy.com");
}
    @After
    public  void methodtanSonra(){
        driver.quit();
    }
@Test
    public void titleTest(){
    String baslik= driver.getTitle();
    Assert.assertTrue(baslik.contains("Best"));
}
@Test
    public void logoTest(){
    WebElement logo=driver.findElement(By.xpath("//img[@class='logo']"));
    boolean display= logo.isDisplayed();
    Assert.assertTrue(display);
}
@Test
    public void LinkTest(){//<img src="https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/mexico.svg" alt="Mexico">
    WebElement link=driver.findElement(By.partialLinkText("Mexico"));
    boolean linkgor= link.isDisplayed();
    Assert.assertTrue(linkgor);
}

}
