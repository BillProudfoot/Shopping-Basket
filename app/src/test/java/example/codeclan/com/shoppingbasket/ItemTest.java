package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void before() { item = new Item ("Bread", 125, false);}

    @Test
    public void getGroceryTest(){assertEquals("Bread", item.getGrocery());}

    @Test
    public void getPriceTest(){assertEquals(125, item.getPrice());}

    @Test
    public void getIsBogofTest(){assertEquals(false, item.getIsBogof());}

}
