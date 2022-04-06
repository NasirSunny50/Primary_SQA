import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("gmail");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='remember']")).click();
        driver.findElement(By.cssSelector("input.signinbtn")).click();
    }
}
