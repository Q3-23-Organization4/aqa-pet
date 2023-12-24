import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static final By EMAIL = By.xpath("//*[@type=\"email\"]");

    private static final By PASSWORD = By.xpath("//*[@type=\"password\"]");

    private static final By SUBMIT_BUTTON = By.xpath("//*[@type=\"submit\"]");

    public void openLoginPage() {
        driver.get("https://lms.ithillel.ua/auth");

    }

    public WebElement getEmailInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
    }

    public WebElement getTitileInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Курси')]")));
    }

    public WebElement getError() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Incorrect email or password')]")));
    }

    public void validLogin(){
        driver.findElement(EMAIL).sendKeys("buravska.nika@gmail.com");
        driver.findElement(PASSWORD).sendKeys("Udasir1996");
        driver.findElement(SUBMIT_BUTTON).click();

    }

    public void invalidMail(){
        driver.findElement(EMAIL).sendKeys("buravsk.nika@gmail.com");
        driver.findElement(PASSWORD).sendKeys("Udasir1996$");
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void invalidPass(){
        driver.findElement(EMAIL).sendKeys("buravsk.nika@gmail.com");
        driver.findElement(PASSWORD).sendKeys("Udasir1996");
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String getElement(){
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Курси')]"));
        return element.getText();
    }

}
