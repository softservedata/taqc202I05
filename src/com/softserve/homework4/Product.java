package com.softserve.homework4;


/*
Homework 4 (from 21.05.2021)
1) Створити клас Product з такими полями: назва продукту та ціна.
   Клас повинен містити конструктор, гетери та сетери, методu toString(), equals().
   В методі main створити п'ять екземплярів типу Product.

   //Вивести на екран назву продукта з найбільшою ціною.
   Вивести на екран продукти, які повторюються.
Для коду використати пакет com.softserve.homework4
Запушати код на github у свою вітку.

* */
public class Product {
    private String ProductName;
    private double ProductPrice;

    public Product(String productName, double productPrice) {
        this.ProductName = productName;
        this.ProductPrice = productPrice;
    }

    public static void main(String[] args) {
    /* Product P1 = new Product("Apple", 12.10);
        Product P2 = new Product("Pear", 32.50);
        Product P3 = new Product("Cherry", 20.00);
        Product P4 = new Product("Cherry", 20.00);
        Product P5 = new Product("Apricot", 25.80);

        double max1 = P1.ProductPrice > P2.ProductPrice ? P1.ProductPrice : P2.ProductPrice;
        double max2 = P3.ProductPrice > P4.ProductPrice ? P3.ProductPrice : P4.ProductPrice;
        double max3 = max1 > max2 ? max1 : max2;
        double max = max3 > P5.ProductPrice ? max3 : P5.ProductPrice;
        System.out.println("The highest product price is " + max);
    */

        Product[] fruits = new Product[5];
        fruits[0] = new Product("Apple", 12.10);
        fruits[1] = new Product("Pear", 32.50);
        fruits[2] = new Product("Cherry", 20);
        fruits[3] = new Product("Apricot", 25);
        fruits[4] = new Product("Apricot", 25);

        double highestPrice = fruits[0].getProductPrice();
        Product maxPriceProd = fruits[0];
        for (Product actualProd : fruits) {
            double actualPrice = actualProd.getProductPrice();
            if (actualPrice > highestPrice) {
                highestPrice = actualPrice;
                maxPriceProd = actualProd;
            }
        }
        System.out.println("The highest product price is " + highestPrice);

        System.out.println("The most expensive product is "  + maxPriceProd.getProductName());

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    System.out.println("Duplicate products are: " + fruits[i].getProductName());
                }
            }
        }
    }
    public String getProductName() {
        return  ProductName;
    }
    public double getProductPrice() {
        return  ProductPrice;
    }
    public void setProductName(String productName) {
        ProductName =  productName;
    }
    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ( (obj == null) || (getClass() != obj.getClass()) ) {
            return false;
        }
        Product other = null;
        if (obj instanceof Product){
            other = (Product) obj;
        }
        if ( (other == null)  ||  (ProductPrice != other.ProductPrice)
                || ( (ProductName == null) && (other.ProductName != null) )
                || ( (ProductName != null) && (other.ProductName == null) ) ) {
            return false;
        }
        if ( (ProductName == null) && (other.ProductName == null) ) {
            return true;
        }
        return ProductName.equals(other.ProductName);
    }
    @Override
    public String toString() {
        return "Product [ProductName=" + ProductName + ", ProductPrice=" + ProductPrice +"]";
    }
}
