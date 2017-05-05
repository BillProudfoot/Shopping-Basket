package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class CustomerTest {

    Customer customer;

    @Before
    public void before() { customer = new Customer ("Smith", false);}

    @Test
    public void getNameTest(){assertEquals("Smith", customer.getName());}

    @Test
    public void getIsLoyaltyCardholderTest(){assertEquals(false, customer.getIsLoyaltyCardholder());}



}
