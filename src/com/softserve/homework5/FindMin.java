package com.softserve.homework5;

/*
Homework 5 (from 25.10.2021)
1) Використати клас Product з Homework 4.
   В методі main створити масив із десяти екземплярів типу Product (можна захардкодити).
   Вивести назву продукту (або продуктів) з найменшою ціною.
Для коду використати пакет com.softserve.homework5
Запушати код на github у свою вітку.
*/

import com.softserve.homework4.Product;

public class FindMin {

    public static void main(String[] args) {
        Product[] fruits = new Product[10];
        fruits[0] = new Product("Plum", 28.10);
        fruits[1] = new Product("Pear", 32.50);
        fruits[2] = new Product("Cherry", 20);
        fruits[3] = new Product("Cherry", 20);
        fruits[4] = new Product("Apricot", 25);
        fruits[5] = new Product("Apple", 16.50);
        fruits[6] = new Product("Peach", 42.50);
        fruits[7] = new Product("Grapes", 32);
        fruits[8] = new Product("Raspberries", 34.00);
        fruits[9] = new Product("Strawberries", 57.00);

        double lowestPrice = fruits[0].getProductPrice();
        Product minPriceProd = fruits[0];
        for (Product actualProd : fruits) {
            double actualPrice = actualProd.getProductPrice();
            if (actualPrice < lowestPrice) {
                lowestPrice = actualPrice;
                minPriceProd = actualProd;
            }
        }
        System.out.println("The cheapest product is "  + minPriceProd.getProductName());
    }
}
