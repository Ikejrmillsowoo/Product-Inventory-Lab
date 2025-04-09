package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {
    @Test
    public void createTest(){
        //Given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //When
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

        //Then
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        Assertions.assertEquals(Integer.class.getName(), Integer.valueOf(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
    }

    @Test
    public void findSneakerByIdTest(){
        //given
        String expectedName = "Air Forces";
        String expectedBrand = "Nike";
        String expectedSport = "Tennis";
        int expectedSize = 12;
        int expectedQty = 8;
        float expectedPrice = 70.00f;

        //when
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

        //Then
        Sneaker actualSneaker = sneakerService.findSneakerById(1);

        System.out.println(actualSneaker.getName());

        Assertions.assertEquals(testSneaker.getName(), actualSneaker.getName());
    }

    @Test
    public void findAllTest(){
        //given
        SneakerService sneakerService = new SneakerService();

        //when
        Sneaker testSneaker = sneakerService.create("Air Forces", "Nike", "Tennis", 12, 8, 70.00f);
        Sneaker testSneaker2 = sneakerService.create("Stan Smith", "Adidas", "Tennis", 12, 10, 80.00f);
        int actualNumOfSneakers = 2;


        //Then
        Assertions.assertEquals(sneakerService.findAll().length, actualNumOfSneakers);
    }

    @Test
    public void deleteTest(){
        //given
        SneakerService sneakerService = new SneakerService();

        //when
        Sneaker testSneaker = sneakerService.create("Air Forces", "Nike", "Tennis", 12, 8, 70.00f);
        Sneaker testSneaker2 = sneakerService.create("Stan Smith", "Adidas", "Tennis", 12, 10, 80.00f);
        int idToDelete = 1;
        int actualNumOfSneakers = 1;


        //Then
        Assertions.assertTrue(sneakerService.delete(1));
        Assertions.assertEquals(sneakerService.findAll().length, actualNumOfSneakers);
    }
}
