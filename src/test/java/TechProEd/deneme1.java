package TechProEd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class deneme1 {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.instagram.com/");
        WebElement kullanici = driver.findElement(By.xpath("//input[@name='username']"));
        kullanici.sendKeys("ismailozkan93@icloud.com");

        WebElement sifre = driver.findElement(By.xpath("//*[@aria-label='Password']"));
        sifre.sendKeys("Ankara06");

        WebElement loginbtn= driver.findElement(By.xpath("//*[@id='loginForm']"));
        loginbtn.click();

        WebElement notnow=driver.findElement(By.cssSelector("button.sqdOP yWX7d    y3zKF"));//<button class="     " type="button">Not Now</button>
        notnow.sendKeys(Keys.ENTER);
    }
}
