package com.filipmoszczynski.module.offer.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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
            LOGGER.error("Error {}", e.getLocalizedMessage());
            return List.of();
        }
    }

    public Optional<ProductDto> getProduct(String id) {
        return getProducts()
                .stream()
                .filter(product->product.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public static String formatDescription(String description) {
        System.lineSeparator();
        return description.replaceAll("#", "\n"); // \\ wywala błąd, ' jest wypisywany, System.lineSeparator() nie działa
    }
}
