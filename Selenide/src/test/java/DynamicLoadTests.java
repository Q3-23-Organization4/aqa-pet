import DymanicLoading.DynamicLoadingPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class DynamicLoadTests {

    @Test
    public void testDynamicLoading1() {
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        open("https://the-internet.herokuapp.com/dynamic_loading/1");
        String finishText = dynamicLoadingPage.clickStartButton().getFinishText();
        assertEquals(finishText, "Hello World!", "Incorrect finish text");
    }

    @Test
    public void testDynamicLoading2() {
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        open("https://the-internet.herokuapp.com/dynamic_loading/2");
        String finishText = dynamicLoadingPage.clickStartButton().getFinishText();
        assertEquals(finishText, "Hello World!", "Incorrect finish text");
    }
}
