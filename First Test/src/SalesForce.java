import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("#username")).sendKeys("NasirSunny");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        driver.findElement(By.name("rememberUn")).click();
        //driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
