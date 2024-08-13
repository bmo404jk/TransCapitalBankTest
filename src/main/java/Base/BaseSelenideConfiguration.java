package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public abstract class BaseSelenideConfiguration {

    public static void setBrowserAndUrl(String browser,String baseUrl) {
        Configuration.browser = browser;
        Configuration.baseUrl = baseUrl;
    }
    public static void openPage(String subUrl) {
        Selenide.open (subUrl);
    }
}
