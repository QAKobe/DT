package com.kuba_php.tests;

import com.kuba_php.pages.MainClass;
import org.testng.annotations.Test;

public class MyTestClass extends MyTestBase {



    @Test(dataProvider = "testData", dataProviderClass = MyData.class)
    public void testFillOutForm(String name, String lastName, String businessName, String email) throws InterruptedException {

        MainClass mainClass = new MainClass(driver);
        mainClass.fillOutForm(name, lastName, businessName, email);

    }


}
