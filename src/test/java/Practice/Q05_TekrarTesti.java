package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05_TekrarTesti {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Yeni bir class olusturun (TekrarTesti)
        // 2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title testi PASSED");
        } else {
            System.out.println(actualTitle);
        }

        // 3. Sayfa URL'sinin “youtube” içerip içermediğini
        // (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String arananKelime = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url tetsi PASSED");
        } else {
            System.out.println(actualUrl);
        }

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // 5. Youtube sayfasina geri donun
        driver.navigate().back();

        // 6. Sayfayi yenileyin
        driver.navigate().refresh();

        // 7. Amazon sayfasina donun
        driver.navigate().forward();

        // 8.Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini
        // (contains) doğrulayın, Yoksa
        // doğru başlığı(Actual Title) yazdırın.
        actualTitle = driver.getTitle();
        arananKelime = "amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title2 testi PASSED");
        }else {
            System.out.println(actualTitle);
        }

        // 10.Sayfa URL'sinin
        // https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        // URL'yi yazdırın
        String expectedUrl = "https://www.amazon.com/";
        actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url2 testi PASSED");
        }else {
            System.out.println(actualUrl);
        }

        // 11.Sayfayi kapatin
        driver.quit();

    }

}
