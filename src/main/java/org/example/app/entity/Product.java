package org.example.app.entity;

import org.example.app.utils.PriceValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static org.example.app.utils.Constants.CURRENCY;
import static org.example.app.utils.Constants.MEASURE;

@Component
public class Product {

    private Long id;
    private String name;
    private String quota;
    private String price;

    public Product() {
    }

    public Product(String firstName, String quota, String price) {
        this.name = firstName;
        this.quota = quota;
        this.price = price;
    }

    public Product(Long id, String name, String quota, String price) {
        this.id = id;
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(id, product.id)) return false;
        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(quota, product.quota)) return false;
        return Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (quota != null ? quota.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String formattedPrice = PriceValidator.formatPrice(this.getPrice());
        return "  ID: " + this.getId() +
                "\n     Назва: " + this.getName() +
                "\n     Кількість: " + this.getQuota() + " " + MEASURE +
                "\n     Ціна: " + formattedPrice + " " + CURRENCY + "\n";
    }
}
