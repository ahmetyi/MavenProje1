package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class day10_DropDownOrnek {
//1.Amazon.com a gidelim
// 2.Dropdown üzerinde software secelim.
//3.Arama kutusuna Java yazalim ve arama yapalim.
//4.Sonuc sayisini ekrana yazdiralim.

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Test
    public void Test1(){
        driver.get("http://www.amazon.com");
        WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropdown);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        select.selectByVisibleText("Software");
        WebElement arama=  driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("JAVA"+Keys.ENTER);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        WebElement aramasayi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(aramasayi.getText());

        Assert.assertTrue(aramasayi.getText().contains("JAVA"));

    }

@AfterClass
    public static void tearDown(){
        driver.quit();
}




}





