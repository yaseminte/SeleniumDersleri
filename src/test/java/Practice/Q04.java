package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      //  1. Yeni bir Class olusturalim.C07_ManageWindowSet
      //  2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

      //  3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın boyutu : " + driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : " + driver.manage().window().getPosition());

      //  4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        int konumX=60;
        int konumY=30;
        driver.manage().window().setPosition(new Point(konumX,konumY));

        int width=800;
        int height=600;
        driver.manage().window().setSize(new Dimension(width,height));


        //  5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın istenen koordinat konumu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanın istenen boyut ölçüleri : "+ driver.manage().window().getSize());

      //Konum testi
        int x=driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();
        if(konumX==x && konumY==y){
            System.out.println("İstenen Konum  testi PASSED");
        }else System.out.println("İstenen Konum  testi FAILED");

       // Boyut Testi
        int widthSayi=driver.manage().window().getSize().getWidth();
        int heightSayi=driver.manage().window().getSize().getHeight();
        if(widthSayi==width && heightSayi==height){
            System.out.println("İstenen Boyut  testi PASSED");
        }else System.out.println("İstenen Boyut  testi FAILED");

      //  8. Sayfayi kapatin
        driver.close();


    }
}
