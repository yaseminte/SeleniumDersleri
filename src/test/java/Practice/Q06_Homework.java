package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06_Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.Yeni bir class olusturalim (Homework)
        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("title testi PASSED");
        } else {
            System.out.println(actualTitle);
        }

        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        // yazdirin.
        String arananKelime = "facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(arananKelime)){
            System.out.println("URL testi PASSED");
        } else {
            System.out.println(actualUrl);
        }

        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        // 5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String arananKelime2 = "Walmart.com";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(arananKelime2)){
            System.out.println("title2 testi PASSED");
        }else {
            System.out.println("title2 testi FAILED");
        }

        // 6.Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // 7.Sayfayi yenileyin
        driver.navigate().refresh();

        // 8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().fullscreen();

        // 9.Browser’i kapatin
        driver.quit();

    }

}
