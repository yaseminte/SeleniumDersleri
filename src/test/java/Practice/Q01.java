package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- Amazon sayfasina gidelim https://www.amazon.com
        driver.get("https://amazon.com");

        // 2- Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3- Sayfa basliginin amazon icerdigini test edin
        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED");
        }

        // 4- Sayfa adresini (URL) yazdirin
        System.out.println(driver.getCurrentUrl());

        // 5- Sayfa URL'inin amazon icerdigini test edin
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();

        // 6- Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandles());

        // 7- Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("HTML testi PASSED");
        }else {
            System.out.println("HTML testi FAILED");
        }

        // 8- Sayfayi kapatin
        driver.close();


    }
}
