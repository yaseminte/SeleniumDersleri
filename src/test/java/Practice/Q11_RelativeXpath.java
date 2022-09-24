package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Q11_RelativeXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement boston = driver.findElement(By.id("pid6_thumb"));
        WebElement nYC = driver.findElement(By.id("pid3_thumb"));
        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement bayArea = driver.findElement(By.id("pid11_thumb"));

        WebElement berlinilkLocate = driver.findElement(RelativeLocator.with(By.tagName("img"))
                .toRightOf(boston).above(sailor));

        WebElement berlinIkinciLocate = driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(nYC).toLeftOf(bayArea));

        WebElement berlinUcuncuLocate = driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(nYC).above(sailor));

        // 3 ) Relative locator’larin dogru calistigini test edin
        berlinilkLocate.click();
        if (berlinilkLocate.isEnabled()){
            System.out.println("Berlin ilk locate PASSED");
        }else {
            System.out.println("Berlin ilk locate FAILED");
        }

        berlinIkinciLocate.click();
        if (berlinIkinciLocate.isEnabled()){
            System.out.println("Berlin ikinci locate PASSED");
        }else {
            System.out.println("Berlin ikinci locate FAILED");
        }

        berlinUcuncuLocate.click();
        if (berlinUcuncuLocate.isEnabled()){
            System.out.println("Berlin ucuncu locate PASSED");
        }else {
            System.out.println("Berlin ucuncu locate FAILED");
        }

        driver.close();


    }
}
