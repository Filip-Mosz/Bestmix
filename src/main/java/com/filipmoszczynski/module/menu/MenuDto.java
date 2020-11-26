package com.filipmoszczynski.module.menu;

public class MenuDto {

    private String name;
    private String link;

    public String getLink() {
        return link;
    }

    public MenuDto(String name){
        this.name = name;
    }

    public MenuDto(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }
}
