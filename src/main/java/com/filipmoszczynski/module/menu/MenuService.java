package com.filipmoszczynski.module.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("Home Page"),
                new MenuDto("O nas"),
                new MenuDto("Aktualności"),
                new MenuDto("Oferta"),
                new MenuDto("Kontakt")
        );
    }

}
