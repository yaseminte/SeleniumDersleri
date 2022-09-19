package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a."https://a.testaddressbook.com adresine gidiniz
        driver.get("http://a.testaddressbook.com");

        // b.Sign in butonuna basiniz
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        // email textbox, password textbox and sign in buton elemanlarini locate ediniz
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButon = driver.findElement(By.name("commit"));

        // d. Kullanici adini ve sifreyi asagiya girin ve oturum acin(sign in) butonuna tiklayin
        //    i.   Username : testtechproed@gmail.com
        //    ii.  Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButon.click();

        // e. Expected user id'nin testtechproed@gmail.com oldugunu dogrulayin (verify)
        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));
        // bir webElementin uzerinde ne yazdigini gormek istersek webElementIsmi.getText() kullaniriz
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail = "testtechproed@gmail.com";

        if (expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("Expected Kullanici Adi testi PASSED");
        }else {
            System.out.println("Expected Kullanici Adi TEsti FAILED");
        }

        // f. Address ve sign out textlerinin goruntulendigini (displayed) dogrulayin (verify).
        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));
        if (adressesElementi.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else {
            System.out.println("adresses testi FAILED");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("signOut testi PASSED");
        }else {
            System.out.println("signOut testi FAILED");
        }

        // sayfada kac tane link oldugunu bulun
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : " + linklerListesi.size());

        // linkleri yazdiralim
        // Listemiz WebElementlerden olustugu icin, direk yazdirirsak referanslari yazdirir
        // onun yerine for-each loop yapip her bir link webelementinin uzerindeki yaziyi yazdirmaliyiz

        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());
        }


        driver.close();






    }
}
