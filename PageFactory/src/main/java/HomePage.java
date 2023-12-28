import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private final WebDriver driver;

    @FindBy(xpath = "//*[contains(@data-dropdown-trigger, 'aboutSchool') and contains(@class, 'site-nav-link')]")
    private WebElement dropDownList;

    @FindBy(xpath = "//*[contains(@data-dropdown-trigger, 'coursesMenu') and contains(@class, 'site-nav-link')]")
    private WebElement dropDownList1;

    @FindBy(xpath = "//a[contains(text(),'бізнесу')]")
    private WebElement link1;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[4]/a")
    private WebElement link2;

    @FindBy(xpath = "//a[contains(text(),'Блог')]")
    private WebElement link3;

    @FindBy(xpath = "//*[@id=\"btn-consultation-hero\"]")
    private WebElement freeConsult;

    @FindBy(xpath = "//a[contains(text(),'Особистий кабінет')]")
    private WebElement logIn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://ithillel.ua/");
    }

    public String getJob() {
        return link2.getText();
    }

    public String getBusines() {
        return link1.getText();
    }

    public String getContact() {
        return link3.getText();
    }

    public String getFirLink() {
        return dropDownList.getText();
    }

    public String getSecLink() {
        return dropDownList1.getText();
    }
}

