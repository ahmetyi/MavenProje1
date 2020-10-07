package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class day07_IlkDers {
    public static void main(String[] args) {
        //Browserlari kullanabilmek icin WebDriverManager kütüphanesini kullaniyor.
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https:www.amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("samsung headphones" + Keys.ENTER);

        //<span dir="auto">1-16 of 357 results for</span>
        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        System.out.println(sonucSayisi.getText());

        WebElement ilkUrun = driver.findElement(By.xpath("//img[@class='s-image']"));
        System.out.println(ilkUrun.getText());

        List<WebElement> urun = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        urun.get(4).getText();

        for (WebElement w : urun) {
            System.out.println(w.getText());
        }
    }
}