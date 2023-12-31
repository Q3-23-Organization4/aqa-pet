package DownUp;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadFile {
    private final SelenideElement uploadButton = $(By.xpath("//*[@id=\"file-submit\"]"));


    public void uploadFile() {
        uploadButton.click();
    }


}
