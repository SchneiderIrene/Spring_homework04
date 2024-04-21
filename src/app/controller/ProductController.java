package app.controller;

import app.domain.Product;
import app.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
   private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public Product getID(Long id){
        return  service.getByID(id);
    }
}
