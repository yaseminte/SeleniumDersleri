package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a gidip Nutella aratalim
        driver.get("https://www.amazon.com");

        // findElement(By ... Locator) --> istedigimiz web elementini bize dondurur
        // biz de o web elementini kullanmak icin bir objeye assign ederiz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

       /* WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
          bu locator caismadi
          Locator alirken gozunuzden kacan detaylar olabilir
          aldigimiz bir locator cakismazsa alternatif locator'lar denemeliyiz
        */

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Ara">
         */
        // herhangi bir web elementine istedigimiz yaziyi gondermek istersek
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


    }
}