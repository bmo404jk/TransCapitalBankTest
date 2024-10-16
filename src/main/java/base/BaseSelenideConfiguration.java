package base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public interface BaseSelenideConfiguration {

    static void setBrowserAndUrl(String browser, String baseUrl) {
        Configuration.browser = browser;
        Configuration.baseUrl = baseUrl;
        Configuration.timeout = 10000;
    }
    static void openPage(String subUrl) {
        Selenide.open (subUrl);
    }
}