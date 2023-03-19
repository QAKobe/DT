package com.Zhanna_php.pages;

import org.testng.annotations.DataProvider;

public class AllData {
    @DataProvider(name = "PhPData")
    public Object[][] geData() {
        return new Object[][]{ //String firstname,String lastname,String bussiness,String email
                {"Zhanna", "kiffe", "asd","trt@gmail"},
                {"nana", "vr", "edv","tyju@gmail"},
                {"sanny", "dbt", "edv","etty@gmail"},

        };
    }
}
