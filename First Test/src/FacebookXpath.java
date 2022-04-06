import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("NasirSunny");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
}
