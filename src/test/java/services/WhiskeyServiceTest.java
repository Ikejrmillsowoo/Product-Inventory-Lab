package services;

import models.Sneaker;
import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {
    @Test
    public void createTest(){
        //Given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSize = "lg";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //When
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);

        //Then
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        String actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        Assertions.assertEquals(Integer.class.getName(), Integer.valueOf(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void findWhiskeyByIdTest(){
        //given
        String expectedName = "Air Forces";
        String expectedBrand = "Nike";
        String expectedSize = "xl";
        int expectedQty = 8;
        float expectedPrice = 70.00f;

        //when
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);

        //Then
        Whiskey actualWhiskey = whiskeyService.findWhiskeyById(testWhiskey.getId());
        Assertions.assertEquals(testWhiskey.getName(), actualWhiskey.getName());
    }

    @Test

    public void findAllTest(){
        //given
        WhiskeyService whiskeyService = new WhiskeyService();

        //when
        Whiskey testWhiskey = whiskeyService.create("Air Forces", "Nike", "xl", 12, 70.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Stan Smith", "Adidas", "lg", 12, 80.00f);
        int actualNumOfSneakers = 2;


        //Then
        Assertions.assertEquals(whiskeyService.findAll().length, actualNumOfSneakers);
    }

    @Test
    public void deleteTest(){
        //given
        WhiskeyService whiskeyService = new WhiskeyService();
        //when
        Whiskey testWhiskey = whiskeyService.create("Air Forces", "Nike", "Tennis", 12, 70.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Stan Smith", "Adidas", "Tennis", 12, 80.00f);
        int idToDelete = testWhiskey.getId();
        int actualNumOfWhistkey = 1;


        //Then
        Assertions.assertTrue(whiskeyService.delete(idToDelete));
        Assertions.assertEquals(whiskeyService.findAll().length, actualNumOfWhistkey);
    }
}
