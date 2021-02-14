package com.filipmoszczynski.module.offer.product;

public class ProductDto {

    private String id;
    private String name;
    private String header;
    private String description;
    public String description_en;

    public String getId() {
        return id;
    }

    public ProductDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public ProductDto setHeader(String header) {
        this.header = header;
        return this;
    }



    public String getDescription() {
        return description;
    }

    public ProductDto setDescription(String description) {
//        this.description = description;
        this.description = ProductService.formatDescription(description);
        return this;
    }
}
