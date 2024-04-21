package app.repository;

import app.domain.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepositoryMap implements ProductRepository{

    private Map <Long,Product> database = new HashMap<>();

    public ProductRepositoryMap() {
        database.put(1L, new Product(1L, "Smartphone", "Huawei", 499.99));
        database.put(2L, new Product(2L, "Smartphone", "Samsung", 1499.99));
        database.put(3L, new Product(3L, "Smartphone", "Motorola", 699.99));
        database.put(4L, new Product(4L, "Smartphone", "Sony", 899.99));
        database.put(5L, new Product(5L, "Smartphone", "Google", 999.99));
    }

    @Override
    public Product getByID(Long id) {
        return database.get(id);
    }
}
