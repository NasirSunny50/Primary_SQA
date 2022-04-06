import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartechCSSselector {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.startech.com.bd/account/login");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("youtube");
        driver.findElement(By.cssSelector("input[id=\"input-password\"]")).sendKeys("123456");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.cssSelector("button.btn")).click();
        //driver.findElement(By.cssSelector("body.account-login:nth-child(2) div.container.ac-layout.before-login:nth-child(7) div.panel.m-auto div.p-body form:nth-child(1) > button.btn.btn-primary:nth-child(3)")).click();
    }
}
