import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageTests {

    private WebDriver driver = new ChromeDriver();
    private WebDriverWait wait;
    private HomePage homePage = new HomePage(driver, wait);



    @Test
    public void testHeaders() {
        homePage.open();
        assertThat(homePage.getBusines()).isEqualTo("бізнесу");
        assertThat(homePage.getContact()).isEqualTo("блог");
        assertThat(homePage.getJob()).isEqualTo("працевлаштування");
        assertThat(homePage.getFirLink()).isEqualTo("школа");
        assertThat(homePage.getSecLink()).isEqualTo("курси");
    }

    @AfterEach
    public void close() {
        driver.quit();
    }

}

