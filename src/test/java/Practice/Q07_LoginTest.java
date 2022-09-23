package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q07_LoginTest {
    public static void main(String[] args) {

        // 1. Bir class oluşturun: LoginTest
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        // c. email textbox,password textbox, and signin button elementlerini locate
        WebElement emailTextBox = driver.findElement(By.name("session[email]"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButton = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();


        // e. Expected user id nin
        //    testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement kullaniciAdi = driver.findElement(By.className("navbar-text"));
        String expectedUserId = "testtechproed@gmail.com";
        String actualUserId = kullaniciAdi.getText();

        if (actualUserId.equals(expectedUserId)){
            System.out.println("User Id Testi PASSED");
        }else {
            System.out.println("User Id Testi FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));

        if (addressElementi.isDisplayed()){
            System.out.println("adres testi PASSED");
        }else {
            System.out.println("adres testi FAILED");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("sign out testi PASSED");
        }else {
            System.out.println("sign out testi FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi : " + linkListesi.size());

        driver.close();

    }
}
