package DownUp;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DownloadFile {
    private final SelenideElement downloadLink = $(By.xpath("//*[@href=\"download/test.txt\"]"));
    public void downloadFile() {
        downloadLink.click();
    }
}


