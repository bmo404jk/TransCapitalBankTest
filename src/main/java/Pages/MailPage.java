package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MailPage {

    private SelenideElement emailArea = $(By.xpath("//input[@type ='email']"));
    private SelenideElement passwordArea = $(By.xpath("//input[@type ='password']"));
    private SelenideElement composeButton = $(By.xpath("//div[text() = 'Compose']"));
    private SelenideElement fromSendInputArea = $(By.xpath("//div[@class='aH9']//input"));
    private SelenideElement mailTextAreaInput = $(By.xpath("//div[@id = ':8w']"));
    private SelenideElement sendButton = $(By.xpath("//div[@id = ':7c']"));

    private final String FROM_SEND_MAIL_ADDRESS = "dokuchaev_av@tkbbank.ru";
    private final String LOGIN = "bmo785168@gmail.com";
    private final String PASSWORD = "q2a3fer78po93";
    private final String TEXT_FOR_SEND = "Добрый день\nБакулин Александр Дмитриевич\nАвтотест готов\nТакже прикрепляю ссылку на Git: https://github.com/bmo404jk/TransCapitalBankTest";

    public void enterMail() {
           emailArea.click();
           emailArea.append(LOGIN);
           emailArea.pressEnter();
           passwordArea.append(PASSWORD);
           passwordArea.pressEnter();
    }

    public void sendMail() {
           try {
               composeButton.shouldBe(exist,visible);
               composeButton.click();
           } catch (Exception e) {
               refresh();
               enterMail();
           }

            fromSendInputArea.click();
            fromSendInputArea.append(FROM_SEND_MAIL_ADDRESS);
            fromSendInputArea.pressEnter();
            mailTextAreaInput.click();
            mailTextAreaInput.append(TEXT_FOR_SEND);
            sendButton.click();
            sleep(3000); //Ждём, пока отправиться письмо, не стал делать проверку по всплывающему сообщению об отправке
    }
}
