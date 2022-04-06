import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA\\QA Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com"); //hit the URl
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl()); //validate URL

        //System.out.println(driver.getPageSource()); //page source

        driver.get("http://yahoo.com");
        //driver.navigate().back();

        driver.close(); //closes current browser
        driver.quit(); //closes all the browsers opened by selenium




//        driver.manage().window().maximize();
//        driver.get(URL);
//        driver.findElement(By.cssSelector("#anonLogin > a")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("nasirsunny50@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("sunnysony1234");
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
//        driver.findElement(By.id("q")).sendKeys("Mask");




    }
}
