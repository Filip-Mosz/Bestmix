package com.filipmoszczynski.module.offer;

import com.filipmoszczynski.module.menu.MenuDto;
import com.filipmoszczynski.module.menu.MenuService;
import com.filipmoszczynski.module.offer.product.ProductDto;
import com.filipmoszczynski.module.offer.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class OfferController {

    @Autowired
    public OfferController(MenuService menuService, ProductService productService) {
        this.menuService = menuService;
        this.productService = productService;
    }

    private final MenuService menuService;
    private final ProductService productService;

    @RequestMapping("/offer")
    public String getOffer(){
        return "offer";
    }

    @RequestMapping("/offer/{id}")
    public String getProduct(@PathVariable("id") String id, Model model) {
        Optional<ProductDto> product = productService.getProduct(id,null);
        List<MenuDto> menuItems = menuService.getMenu();
        model.addAttribute("product", getProduct(product.get()));
        model.addAttribute("menuItems", menuItems);

        return "offer/product.html";
    }
    @RequestMapping("/offer/{id}/{lang}")
    public String getProductEng(@PathVariable("id") String id, @PathVariable("lang") String lang, Model model) {
        Optional<ProductDto> product = productService.getProduct(id,lang);
        List<MenuDto> menuItems = menuService.getMenu();
        model.addAttribute("product", getProduct(product.get())); //there's a error here (no value present) -> [capturing css link as variable "lang"]
        model.addAttribute("menuItems", menuItems);

        return "offer/product.html";
    }

    private ProductDto getProduct(ProductDto product) {
        return product.setDescription(product.getDescription()); //not sure how it should work...
    }
}

//demeter BlogController
