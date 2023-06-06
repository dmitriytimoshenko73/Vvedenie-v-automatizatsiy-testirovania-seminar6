package org.max.demo;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReportAllureTest {

    @Test
    void simplePassTest() {
        //given
        //when
        //then
        Assertions.assertTrue(true);
       // TimeUnit u = TimeUnit.MILLISECONDS;
    }

    @Test
    void simpleUnPassTest() {
        //given
        //when
        //then
        Assertions.fail();
    }

    @Test
    void simpleErrorTest() {
        //given
        int a = 10;
        int b = 0;
        //when
        int c = a/b;
        //then
    }

    @Test
    @DisplayName("Для данного теста указано имя")
    void nameTest() {
        //given
        //when
        //then
        Assertions.assertTrue(true);
    }

    @Test
    @Description("Добавим описание для нашего теста")
    void descriptionTest() {
        //given
        //when
        //then
        Assertions.assertTrue(true);
    }

    @Test
    void stepTest() {
        //given
        ReportAllureUtils.given();
        //when
        ReportAllureUtils.when();
        //then
        ReportAllureUtils.then();
    }





}
