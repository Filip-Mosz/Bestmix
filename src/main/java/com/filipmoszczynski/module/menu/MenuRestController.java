package com.filipmoszczynski.module.menu;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuRestController {

    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;

    }

    private final MenuService menuService;

    @GetMapping({"/menu"})
    public List<MenuDto> getBlog(Model model) {

        List<MenuDto> menuItems = menuService.getMenu();

        model.addAttribute("menuItems", menuItems);

        return menuService.getMenu();
    }

}
