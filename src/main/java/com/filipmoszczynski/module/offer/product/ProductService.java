package com.filipmoszczynski.module.offer.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    public List<ProductDto> getProducts() {
        try {
            return  MAPPER.readValue(
                    getClass().getClassLoader().getResource("products.json"),
                    MAPPER.getTypeFactory().constructCollectionType(List.class, ProductDto.class)
            );
        } catch (IOException e) {
            LOGGER.error("Error - No products found", e.getLocalizedMessage());
            return List.of();
        }
    }
}
