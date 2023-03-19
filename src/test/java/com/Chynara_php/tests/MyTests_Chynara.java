package com.Chynara_php.tests;

import com.Chynara_php.pages.MainClassC_Chynara;
import org.testng.annotations.Test;

public class MyTests_Chynara extends TestBase_Chynara{
    @Test(dataProvider = "getInfo", dataProviderClass = AllData_Chynara.class)
    public void validateSubmit(String fName, String lName, String bName, String eMail){
        MainClassC_Chynara mainClass = new MainClassC_Chynara(driver);
        mainClass.validateAll(fName, lName, bName, eMail);

    }
}
