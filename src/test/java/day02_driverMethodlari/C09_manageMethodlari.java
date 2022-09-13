package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amaazon.com");
        /*
        İleride wait konusunu daha geniş ele alacağız
        Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
        bir bekleme suresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir.
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagi tanir
         */

        driver.close();

    }
}
