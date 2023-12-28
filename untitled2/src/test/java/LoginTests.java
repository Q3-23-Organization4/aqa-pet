import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTests {
    private WebDriver driver;

    @Test
    public void testCorrectLogin() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        WebElement successMessage = driver.findElement(By.xpath("//*[@class='flash success']"));//.getText();
        Assert.assertTrue(successMessage.getText().contains("You logged into a secure area!"));

        driver.quit();
   }

    @Test
    public void testIncorrectLogin() {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        String username = "invalid test";
        String password = "invalid pass";

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@class='flash error']"));
        Assert.assertTrue(errorMessage.getText().contains("Your username is invalid!"));

        driver.quit();
    }
}
