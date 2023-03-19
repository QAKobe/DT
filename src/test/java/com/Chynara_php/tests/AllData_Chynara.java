package com.Chynara_php.tests;

import org.testng.annotations.DataProvider;

public class AllData_Chynara {
    @DataProvider(name = "getInfo")
    public Object[][] provideData(){
        return new Object[][]{
                {"Chynara", "Om", "star", "iuyg@mail.ru"},
                {"Alex", "Mac", "BMV", "jhsgd@gmail.com"},
                {"Mark", "Leo","HR", "jhgdfjh@gmail.com"}
        };
    }
}
