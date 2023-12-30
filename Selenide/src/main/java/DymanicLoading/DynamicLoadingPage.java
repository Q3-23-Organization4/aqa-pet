package DymanicLoading;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {

    private final SelenideElement startButton = $("#start button");
    private final SelenideElement finishText = $(By.xpath("//*[@id=\"finish\"]"));

    public DynamicLoadingPage clickStartButton() {
        startButton.click();
        finishText.shouldBe(visible, Duration.ofSeconds(7));
        return this;
    }

    public String getFinishText() {
        return finishText.getText();
    }
}
