import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTest {

    private WebDriver driver = new ChromeDriver();
    private WebDriverWait wait;
    private LoginPage loginPage = new LoginPage(driver, wait);

    @Test
    public void testLoginPage() {
        loginPage.openLoginPage();
        loginPage.getEmailInput();
        loginPage.validLogin();
        loginPage.getTitileInput();
        assertThat(loginPage.getElement()).isEqualTo("Курси");
    }

    @Test
    public void testinvalidLoginPage() {
        loginPage.openLoginPage();
        loginPage.getEmailInput();
        loginPage.invalidMail();
        Assert.assertTrue(loginPage.getError().getText().contains("Incorrect email or password"));
    }

    @Test
    public void testinvalidLoginPage1() {
        loginPage.openLoginPage();
        loginPage.getEmailInput();
        loginPage.invalidPass();
        Assert.assertTrue(loginPage.getError().getText().contains("Incorrect email or password"));
    }


    @AfterEach
    public void close() {
        driver.quit();
    }

}
