package app.domain;

import java.util.Objects;

public class Product {
    private Long id;
    private String title;
    private String brand;
    private double price;
    private String article;

    public Product(Long id, String title, String brand, double price) {
        this.id = id;
        this.title = title;
        this.brand = brand;
        this.price = price;
    }

    public Long getId() {
        return id;
    }


    public String getBrand() {
        return brand;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(price, product.price) != 0) return false;
        if (!Objects.equals(id, product.id)) return false;
        if (!Objects.equals(title, product.title)) return false;
        if (!Objects.equals(brand, product.brand)) return false;
        return Objects.equals(article, product.article);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (article != null ? article.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, %s %S, price: %.2f, article - %s",
                id, title, brand, price, article);
    }
}
