package com.filipmoszczynski.module.references.reference;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ReferenceService {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(ReferenceService.class);

    public List<ReferenceDto> getReferences() {
        try {
            return  MAPPER.readValue(
                    getClass().getClassLoader().getResource("references.json"),
                    MAPPER.getTypeFactory().constructCollectionType(List.class, ReferenceDto.class)
            );
        } catch (IOException e) {
            LOGGER.error("Error - No references found", e.getLocalizedMessage());
            return List.of();
        }
    }

//    public Optional<ProductDto> getReference(String id) {
//        return getProducts()
//                .stream()
//                .filter(product->product.getId().equalsIgnoreCase(id))
//                .findFirst();
//    }
}
