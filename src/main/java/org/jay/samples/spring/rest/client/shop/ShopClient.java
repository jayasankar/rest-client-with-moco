package org.jay.samples.spring.rest.client.shop;

import org.springframework.web.client.RestTemplate;

/**
 * Created by ex4q3 on 13/04/14.
 */
public class ShopClient {

    public String getShop(String shopid) {
        RestTemplate shopClient = new RestTemplate();
        String response = shopClient.getForObject("http://localhost:12306/", String.class);
        return response;
    }


}
