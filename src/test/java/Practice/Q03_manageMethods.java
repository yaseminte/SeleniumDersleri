package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03_manageMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      // 1. Yeni bir Class olusturalim.C06_ManageWindow
      // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

      // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın simge durumu boyutu : " + driver.manage().window().getSize());
        System.out.println("Sayfanın simge durumu konumu : " + driver.manage().window().getPosition());

        // 4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

      // 5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

      // 6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin maximize boyutu : " + driver.manage().window().getSize());
        System.out.println("Sayfanin maxmize konumu : " + driver.manage().window().getPosition());

        // 7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

      // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin fullscreen boyutu : " + driver.manage().window().getSize());
        System.out.println("Sayfanin fullscreen konumu : " + driver.manage().window().getPosition());

      // 9. Sayfayi kapatin
        driver.close();


    }
}
