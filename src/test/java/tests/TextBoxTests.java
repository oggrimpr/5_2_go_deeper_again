package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void successfulFillTestWithMediocreLocators() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("alex");
        $("[type=email]").setValue("alex@qag.com");
        $("[placeholder='Current Address']").setValue("current address");
        $(byId("permanentAddress")).setValue("12345");
        $(".btn.btn-primary").click();

        System.out.println("debug");
    }

    @Test
    void successfulFillTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("alex");
        $("#userEmail").setValue("alex@qag.com");
        $("#currentAddress").setValue("current address");
        $("#permanentAddress").setValue("12345");
        $("#submit").click();

    }
}
