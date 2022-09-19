package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

        // 1) Bir class olusturun : Locators css
        // 2) Main method olusturun ve asagidaki gorevi tamamlayin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a.Verilen web sayfasina gidin http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //    b.Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("#session_email"));

        //    c.Locate password textbox
        WebElement passwordTextBox = driver.findElement(By.cssSelector("#session_password"));

        //    d.Locate sign-in button
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Sign in']"));

        //    e.Asagidaki kullanici adini ve sifreyi girin ve sign in dugmesine tiklayin
        //
        //     i.  Username : testtechproed@gmail.com
        //     ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        driver.close();


    }
}
