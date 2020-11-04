package com.filipmoszczynski.module.offer.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

        ProductDto testProduct= new ProductDto();
        ProductService testService = new ProductService();


    @BeforeEach
    void setUp() {

        testProduct.setId("food");

    }

    @Test
    void getProducts() {

        assertEquals(testService.getProducts().size(), 4);

    }

    @Test
    void getProduct() {

        ProductDto currentValue = extract(testService.getProduct("food"));

        assertEquals(currentValue.getId(), testProduct.getId());

    }

    ProductDto extract (Optional<ProductDto> optional) {
        if (optional.isPresent())
        {
            return optional.get();
        }

        return new ProductDto();
    }
}