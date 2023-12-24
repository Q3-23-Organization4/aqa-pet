import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }

    private static final By DROP_DOWN_LIST = By.xpath("//*[contains(@data-dropdown-trigger, 'aboutSchool') and contains(@class, 'site-nav-link')]");

    private static final By DROP_DOWN_LIST1 = By.xpath("//*[contains(@data-dropdown-trigger, 'coursesMenu') and contains(@class, 'site-nav-link')]");

    private static final By LINK1 = By.xpath("//a[contains(text(),'бізнесу')]");
    private static final By LINK2 = By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[4]/a");

    private static final By LINK3 = By.xpath("//a[contains(text(),'Блог')]");

    private static final By FREE_CONSULT = By.xpath("//*[@id=\"btn-consultation-hero\"]");

    private static final By LOG_IN = By.xpath("//a[contains(text(),'Особистий кабінет')]");

    public void open() {
        driver.get("https://ithillel.ua/");
    }

    public String getJob() {
        return driver.findElement(LINK2).getText();
    }

    public String getBusines() {
        return driver.findElement(LINK1).getText();
    }

    public String getContact() {
        return driver.findElement(LINK3).getText();
    }

    public String getFirLink() {
        return driver.findElement(DROP_DOWN_LIST).getText();
    }

    public String getSecLink() {
        return driver.findElement(DROP_DOWN_LIST1).getText();
    }
}
