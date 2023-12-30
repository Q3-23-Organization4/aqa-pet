import DownUp.DownloadFile;
import DownUp.UploadFile;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownUpTests {

    @Test
    public void testFileDownload() {
        open("https://the-internet.herokuapp.com/download");
        DownloadFile downloadPage = new DownloadFile();
        downloadPage.downloadFile();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testFileUpload() {
        open("https://the-internet.herokuapp.com/upload");
        UploadFile uploadPage = new UploadFile();
        SelenideElement chooseFileInput = $(By.xpath("//*[@id=\"file-upload\"]"));
        chooseFileInput.sendKeys("C:\\Users\\burav\\IdeaProjects\\aqa-pet\\Selenide\\src\\test\\resources\\GIT command.txt");
        uploadPage.uploadFile();
    }
}

