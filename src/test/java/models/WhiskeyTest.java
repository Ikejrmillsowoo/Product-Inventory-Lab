package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {

    @Test
    public void setNameTest() {
        //given(1)
        String expected = "NIKE";

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setIdTest() {
        //given(1)
        int expected = 1;

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setPriceTest() {
        //given(1)
        float expected = 2;

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }

    @Test
    public void setBrandTest() {
        //given(1)
        String expected = "Nike";

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }


    @Test
    public void setSizeTest() {
        //given(1)
        int expected = 4;

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getSize());
    }

    @Test
    public void setQuantityTest() {
        //given(1)
        int expected = 0;

        //When (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        //Then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }


    @Test
    public void constructorTest() {
        //given
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 2;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //When
        Whiskey whiskey = new Whiskey(expectedId, expectedName, expectedBrand,  expectedSize, expectedQty, expectedPrice);

        //Then
        Assertions.assertEquals(expectedId, whiskey.getId());
        Assertions.assertEquals(expectedName, whiskey.getName());
        Assertions.assertEquals(expectedBrand, whiskey.getBrand());
        Assertions.assertEquals(expectedSize, whiskey.getSize());
        Assertions.assertEquals(expectedQty, whiskey.getQty());
        Assertions.assertEquals(expectedPrice, whiskey.getPrice());
    }
}


