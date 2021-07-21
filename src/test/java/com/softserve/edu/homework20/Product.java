package com.softserve.edu.homework20;

interface IName {
    IName setIName(String name);
}

interface IBrand {
    IBrand setIBrand(String brand);
}

interface IProductCode {
    IProductCode setIProductCode(String productCode);
}

interface IRewardPoints {
    IRewardPoints setIRewardPoints(String rewardPoints);
}

interface IAvailability {
    IAvailability setIAvailability(String availability);
}

interface IPrice {
    IPrice setIPrice(String price);
}


public class Product implements IName, IBrand, IProductCode, IRewardPoints, IAvailability, IPrice{

    String name;
    String brand;
    String productCode;
    String rewardPoints;
    String availability;
    String price;

    public static Product get() {
        return new Product();
    }

    @Override
    public Product setIName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Product setIBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Product setIProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @Override
    public Product setIRewardPoints(String rewardPoints) {
        this.rewardPoints = rewardPoints;
        return this;
    }

    @Override
    public Product setIAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    @Override
    public Product setIPrice(String price) {
        this.price = price;
        return this;
    }

    public Product build(){
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", productCode='" + productCode + '\'' +
                ", rewardPoints='" + rewardPoints + '\'' +
                ", availability='" + availability + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
