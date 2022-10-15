package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void PracticeForm () {

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#firstName").setValue("Egor");
//        Selenide.switchTo().newWindow(WindowType.TAB);
//        open("/automation-practice-form");
//        switchTo().window(0);
        $("#lastName").setValue("Kravets");
        $("[id=userEmail]").setValue("EgorKravets@example.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0984239315");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1998");
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__day--008:not(.react-datepicker__day--outside-month)").click();
   //     $(".react-datepicker__year-select").selectOption(2005);
  //      $(".react-datepicker__month-select").selectOption(January);
   //     $(".react-datepicker__day-select").selectOption(day);

//        $(".react-datepicker__day--008:not(.react-datepicker__day--outside-month)").click();
//        $("[class=\"react-datepicker__day react-datepicker__day--01"+day+" react-datepicker__day--outside-month\"]").click();
//        $("#class=react-month-select").setValue("value=January");
//        $("#class=react-year-select").setValue("value=1982");
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[id=hobbiesWrapper]").$(byText("Sports")).click();
        $("[id=hobbiesWrapper]").$(byText("Reading")).click();
        $("[id=hobbiesWrapper]").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("11111.png");
        $("[id=currentAddress]").setValue("Lagovo 15");
        $("#state").scrollIntoView(true);
        $("#state").click();
        $("#state").$(byText("NCR")).click();
        $("#city").click();
        $("#city").$(byText("Delhi")).click();
        $("#submit").click();


    }
}