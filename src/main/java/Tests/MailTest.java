package Tests;

import Base.BaseTest;
import Pages.MailPage;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class MailTest extends BaseTest {

    MailPage mailPage = new MailPage();

    @Test
    @Description("Производим авторизацию, входим в гугл почту")
    public void test1() {
        mailPage.enterMail();
    }

    @Test
    @Description("Создание письма и его отправка на почту")
    public void test2() {
        mailPage.sendMail();
    }
}
