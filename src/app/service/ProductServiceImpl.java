package app.service;

import app.domain.Product;
import app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class ProductServiceImpl implements ProductService{
    private ProductRepository repository;
    private String articleProduct;

    public ProductServiceImpl(@Qualifier("productRepositoryFile") ProductRepository repository,
                              @Value("${article.product}") String articleProduct) {
        this.repository = repository;
        this.articleProduct = articleProduct;
    }

    @Override
    public Product getByID(Long id) {
        Product product = repository.getByID(id);
        addArticle(product);
        return repository.getByID(id);
    }

    @Override
    public void addArticle(Product product) {
    String article = String.format("%S.%C.%d",
            articleProduct, product.getBrand().charAt(0), product.getId());
    product.setArticle(article);
    }
}
