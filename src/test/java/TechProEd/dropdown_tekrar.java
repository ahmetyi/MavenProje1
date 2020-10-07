package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdown_tekrar {
static WebDriver driver;
   @BeforeClass
   public static void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();

   }

   @Test
   public void test1(){
       driver.get("http://www.amazon.com");
       WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
       Select select=new Select(dropDown);

       try {
           Thread.sleep(2000);
       }catch (InterruptedException e){

       }

       select.selectByVisibleText("Baby");

       try {
           Thread.sleep(2000);
       }catch (InterruptedException e){

       }

        select.selectByValue("search-alias=automotive-intl-ship");

       try {
           Thread.sleep(2000);
       }catch (InterruptedException e){

       }

       select.selectByIndex(5);

       WebElement secim=select.getFirstSelectedOption();
       System.out.println(secim.getText());

       List<WebElement> liste =select.getOptions();

       for(WebElement w:liste){
           System.out.println(w.getText());
       }

        int toplam=liste.size();
       System.out.println(toplam);

   }

}
