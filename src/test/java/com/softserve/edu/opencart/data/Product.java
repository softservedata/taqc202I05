package com.softserve.edu.opencart.data;

import java.util.List;

public class Product implements Unbreakable {
    private Integer rewardPoints;
    private Integer minimumQuantity;
    private Double rating;
    private String category;
    private String subcategory;
    private String brand;
    private String model;
    private String name;
    private String productCode;
    private String availability;
    private String currentPrice;
    private String oldPrice;
    private String rewardPointsPrice;
    private String smallGroupPrice;
    private String mediumGroupPrice;
    private String largeGroupPrice;
    private String description;
    private String specification;
    private String color;
    private String size;
    private List<String> reviews;
    private List<Product> related;

    private Product() {}

    public static Countable get() {
        return new Product();
    }

    @Override
    public Countable setMinimumQuantity(int quantity) {
        minimumQuantity = quantity;
        return this;
    }

    @Override
    public Rateable setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
        return this;
    }

    @Override
    public Categorizable setRating(double rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public Subcategorizable setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public Recognizable setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    @Override
    public Recognizable setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Recognizable setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Unifiable setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Available setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @Override
    public Purchasable setAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    @Override
    public Purchasable setCurrentPrice(String price) {
        currentPrice = price;
        return this;
    }

    @Override
    public Purchasable setOldPrice(String price) {
        oldPrice = price;
        return this;
    }

    @Override
    public Purchasable setRewardPrice(String price) {
        rewardPointsPrice = price;
        return this;
    }

    @Override
    public Purchasable setSmallGroupPrice(String price) {
        smallGroupPrice = price;
        return this;
    }

    @Override
    public Purchasable setMediumGroupPrice(String price) {
        mediumGroupPrice = price;
        return this;
    }

    @Override
    public Describable setLargeGroupPrice(String price) {
        largeGroupPrice = price;
        return this;
    }

    @Override
    public Specifiable setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Paintable setSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    @Override
    public Resizable setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Reviewable setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public Relatable setReviews(List<String> reviews) {
        this.reviews = reviews;
        return this;
    }

    @Override
    public Buildable setRelated(List<Product> related) {
        this.related = related;
        return this;
    }

    @Override
    public Unbreakable build() {
        return this;
    }

    @Override
    public Integer getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }

    @Override
    public Double getRating() {
        return rating;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getSubcategory() {
        return subcategory;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProductCode() {
        return productCode;
    }

    @Override
    public String getAvailability() {
        return availability;
    }

    @Override
    public String getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public String getOldPrice() {
        return oldPrice;
    }

    @Override
    public String getRewardPointsPrice() {
        return rewardPointsPrice;
    }

    @Override
    public String getSmallGroupPrice() {
        return smallGroupPrice;
    }

    @Override
    public String getMediumGroupPrice() {
        return mediumGroupPrice;
    }

    @Override
    public String getLargeGroupPrice() {
        return largeGroupPrice;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getSpecification() {
        return specification;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public List<String> getReviews() {
        return reviews;
    }

    @Override
    public List<Product> getRelated() {
        return related;
    }
}
