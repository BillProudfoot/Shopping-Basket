package example.codeclan.com.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class BasketTest {

    @Test
    public void getItemCountTest(){
        Basket basket = new Basket();
        assertEquals(7, basket.getBasket().size());}


    }



