package Base;

import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    @BeforeAll
    public static void openPage() {
        BaseSelenideConfiguration.setBrowserAndUrl("chrome","https://www.google.com");
        try {
            BaseSelenideConfiguration.openPage("/mail");
        } catch (Exception e) {
            openPage();
        }
    }
}
