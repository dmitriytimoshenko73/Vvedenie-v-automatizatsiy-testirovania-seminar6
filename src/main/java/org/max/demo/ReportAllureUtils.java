package org.max.demo;

import io.qameta.allure.Step;

public class ReportAllureUtils {

    @Step
    public static void given(){
        System.out.println("given");
    };
    @Step
    public static void when(){
        System.out.println("when");
    };
    @Step
    public static void then(){
        System.out.println("then");
    };
}
