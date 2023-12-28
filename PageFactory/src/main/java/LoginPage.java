import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//*[@type=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@type=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[contains(text(),'Курси')]")
    private WebElement titleElement;

    @FindBy(xpath = "//*[contains(text(),'Incorrect email or password')]")
    private WebElement errorElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void openLoginPage() {
        driver.get("https://lms.ithillel.ua/auth");
    }

    public WebElement getEmailInput() {
        return wait.until(ExpectedConditions.visibilityOf(emailInput));
    }

    public WebElement getTitileInput() {
        return wait.until(ExpectedConditions.visibilityOf(titleElement));
    }

    public WebElement getError() {
        return wait.until(ExpectedConditions.visibilityOf(errorElement));
    }

    public void validLogin(){
        emailInput.sendKeys("buravska.nika@gmail.com");
        passwordInput.sendKeys("Udasir1996");
        submitButton.click();
    }

    public void invalidMail(){
        emailInput.sendKeys("buravsk.nika@gmail.com");
        passwordInput.sendKeys("Udasir1996$");
        submitButton.click();
    }

    public void invalidPass(){
        emailInput.sendKeys("buravsk.nika@gmail.com");
        passwordInput.sendKeys("Udasir1996");
        submitButton.click();
    }

    public String getElement(){
        return titleElement.getText();
    }
}

