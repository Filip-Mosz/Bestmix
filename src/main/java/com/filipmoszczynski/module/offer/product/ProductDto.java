package com.filipmoszczynski.module.offer.product;

public class ProductDto {

    private String id;
    private String name;
    private String header;

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
}
