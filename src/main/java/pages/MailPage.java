package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MailPage {

    private static SelenideElement emailArea = $(By.xpath("//input[@type ='email']"));
    private static SelenideElement passwordArea = $(By.xpath("//input[@type ='password']"));
    private static SelenideElement composeButton = $(By.xpath("//div[text() = 'Compose']"));
    private static SelenideElement fromSendInputArea = $(By.xpath("//div[@class='aH9']//input"));
    private static SelenideElement mailTextAreaInput = $(By.xpath("//div[@class = 'Am aiL Al editable LW-avf tS-tW']"));
    private static SelenideElement sendButton = $(By.xpath("//div[@class = 'T-I J-J5-Ji aoO v7 T-I-atl L3']"));

    private static final String FROM_SEND_MAIL_ADDRESS = "dokuchaev_av@tkbbank.ru";
    private static final String LOGIN = "bmo785168@gmail.com";
    private static final String PASSWORD = "q2a3fer78po93";
    private static final String TEXT_FOR_SEND = "Добрый день\nБакулин Александр Дмитриевич\nАвтотест готов\nТакже прикрепляю ссылку на Git: https://github.com/bmo404jk/TransCapitalBankTest";

    public static void enterMail() {
        emailArea.click();
        emailArea.append(LOGIN);
        emailArea.pressEnter();
        passwordArea.append(PASSWORD);
        passwordArea.pressEnter();
    }
    public static void sendMail() {
        composeButton.shouldBe(exist,visible);
        composeButton.click();
        fromSendInputArea.click();
        fromSendInputArea.append(FROM_SEND_MAIL_ADDRESS);
        fromSendInputArea.pressEnter();
        mailTextAreaInput.click();
        mailTextAreaInput.append(TEXT_FOR_SEND);
        sendButton.click();
        sleep(3000);
    }
}