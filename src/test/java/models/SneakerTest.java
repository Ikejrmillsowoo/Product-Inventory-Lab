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
        float expected = 2;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test
    public void setSportTest(){
        //given(1)
        float expected = 2;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test
    public void setSizeTest(){
        //given(1)
        int expected = 4;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test
    public void setQuantityTest(){
        //given(1)
        int expected = 0;

        //When (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        //Then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }
}
