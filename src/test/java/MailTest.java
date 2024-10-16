import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static base.BaseSelenideConfiguration.*;
import static pages.MailPage.*;

public class MailTest  {

    @BeforeAll
    @Description("Настройка браузера и указание ссылки для запуска")
    public static void setUP() {
        setBrowserAndUrl("chrome","https://www.google.com");
        openPage("/mail");
    }
    @Test
    @DisplayName("Вход в почту")
    @Description("Производим авторизацию, входим в гугл почту")
    public void test1() {
        enterMail();
    }
    @Test
    @DisplayName("Отправка письма")
    @Description("Создание письма и его отправка на почту")
    public void test2() {
        sendMail();
    }
}