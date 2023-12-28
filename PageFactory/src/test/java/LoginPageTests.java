import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTests {

    private WebDriver driver = new ChromeDriver();
    private LoginPage loginPage = new LoginPage(driver);

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
        assertThat(loginPage.getError().getText()).contains("Incorrect email or password");
    }

    @Test
    public void testinvalidLoginPage1() {
        loginPage.openLoginPage();
        loginPage.getEmailInput();
        loginPage.invalidPass();
        assertThat(loginPage.getError().getText()).contains("Incorrect email or password");
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
