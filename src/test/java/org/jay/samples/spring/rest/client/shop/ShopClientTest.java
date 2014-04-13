package org.jay.samples.spring.rest.client.shop;

import static org.junit.Assert.*;

import org.jay.samples.spring.rest.client.shop.ShopClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by ex4q3 on 13/04/14.
 */
@RunWith(JUnit4.class)
public class ShopClientTest {

    @Test
    public void testGetShop() {
        ShopClient shopClient = new ShopClient();
        String response = shopClient.getShop("qw123");
        assertEquals("Hello, Shop", response);
    }

}
