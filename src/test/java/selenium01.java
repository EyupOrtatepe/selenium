import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class selenium01 {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();

        List<WebElement> buttonListesi= driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());
        for (WebElement each:buttonListesi){
            System.out.println(each.getText());
        }

    }
}
