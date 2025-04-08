package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    @Test
    public void setNameTest(){
        //given(1)
        String expected = "NIKE";

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIdTest(){
        //given(1)
        int expected = 1;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setPriceTest(){
        //given(1)
        float expected = 2;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test
    public void setBrandTest(){
        //given(1)
        String expected = "Nike";

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest(){
        //given(1)
        String expected = "Basket Ball";

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest(){
        //given(1)
        int expected = 4;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQuantityTest(){
        //given(1)
        int expected = 0;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
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
        Sneaker sneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice );

        //Then
        Assertions.assertEquals(expectedId, sneaker.getId());
        Assertions.assertEquals(expectedName, sneaker.getName());
        Assertions.assertEquals(expectedBrand, sneaker.getBrand());
        Assertions.assertEquals(expectedSize, sneaker.getSize());
        Assertions.assertEquals(expectedSport, sneaker.getSport());
        Assertions.assertEquals(expectedQty, sneaker.getQty());
        Assertions.assertEquals(expectedPrice, sneaker.getPrice());
    }
}
