package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q08_AmazonSearchTest {
    public static void main(String[] args) {

        // 1. Bir class oluşturun : AmazonSearchTest
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a.amazon web sayfasına gidin.
        driver.get("https://www.amazon.com");

        // b.Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);


        // c.Amazon 'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//*[text()='1-16 of 109 results for']"));
        System.out.println("sonuclar : "+sonucYazisiElementi.getText());

        // d.Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkSonuc = driver.findElement(By.xpath("//img[@class='s-image']"));
        ilkSonuc.click();

        driver.close();
    }
}
