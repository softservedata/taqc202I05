package com.softserve.edu.hw4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Product {
    @NonNull
    private String name;
    @NonNull
    private Double price;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (Objects.isNull(o)) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(product.name, this.name)
                && Objects.equals(product.price, this.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
