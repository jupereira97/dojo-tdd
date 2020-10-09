package com.mercadolibre.dojos.romannumbers;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RomanNumbersTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {

        //formato: INPUT, EXPECTED
        return new Object[][]{
                {1, "I"},
                {2 , "II"},
                {3 , "III"},
                {4 , "IV"},
                {5 , "V"},
                {6 , "VI"},
                {7 , "VII"},
                {8, "VIII"},
                {9 , "IX"},
                {10 , "X"},
                {11 , "XI"},
                {12 , "XII"},
                {13 , "XIII"},
                {14 , "XIV"},
                {15 , "XV"},
                {16 , "XVI"},
                {17 , "XVII"},
                {18 , "XVIII"}
        };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(int data, String expected) {

        System.out.println("Input Data is: " + data);
        String out = new RomanNumberTranslator().translate(data);

        Assert.assertEquals(expected,out);
    }
}
