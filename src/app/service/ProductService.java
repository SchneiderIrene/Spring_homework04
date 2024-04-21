package app.service;

import app.domain.Product;

public interface ProductService {
    Product getByID(Long id);
    void addArticle (Product product);
}
