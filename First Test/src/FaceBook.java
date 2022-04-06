import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/");
        driver.findElement(By.id("email")).sendKeys("muddinsunny@yahoo.com");
        driver.findElement(By.name("pass")).sendKeys("123456");
        //driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
    }
}

