package com.softserve.edu.opencart.data;

import java.util.List;

interface Countable {
    Countable setMinimumQuantity(int quantity);
    Rateable setRewardPoints(int rewardPoints);
}

interface Rateable {
    Categorizable setRating(double rating);
}

interface Categorizable {
    Subcategorizable setCategory(String category);
}

interface Subcategorizable {
    Recognizable setSubcategory(String subcategory);
}

interface Recognizable {
    Recognizable setBrand(String brand);
    Recognizable setModel(String model);
    Unifiable setName(String productCode);
}

interface Unifiable {
    Available setProductCode(String productCode);
}

interface Available {
    Purchasable setAvailability(String availability);
}

interface Purchasable {
    Purchasable setCurrentPrice(String price);
    Purchasable setOldPrice(String price);
    Purchasable setRewardPrice(String price);
    Purchasable setSmallGroupPrice(String price);
    Purchasable setMediumGroupPrice(String price);
    Describable setLargeGroupPrice(String price);
}

interface Describable {
    Specifiable setDescription(String description);}

interface Specifiable {
    Paintable setSpecification(String specification);
}

interface Paintable {
    Resizable setColor(String color);
}

interface Resizable {
    Reviewable setSize(String size);
}

interface Reviewable {
    Relatable setReviews(List<String> reviews);
}

interface Relatable {
    Buildable setRelated(List<Product> related);
}

interface Buildable {
    Unbreakable build();
}

public interface Unbreakable
        extends Countable, Rateable, Categorizable,
                Subcategorizable, Recognizable, Unifiable,
                Available, Purchasable, Describable, Specifiable,
                Paintable, Resizable, Reviewable, Relatable, Buildable {
    Integer getRewardPoints();

    public Integer getMinimumQuantity();

    public Double getRating();

    public String getCategory();

    public String getSubcategory();

    public String getBrand();

    public String getModel();

    public String getName();

    public String getProductCode();

    public String getAvailability();

    public String getCurrentPrice();

    public String getOldPrice();

    public String getRewardPointsPrice();

    public String getSmallGroupPrice();

    public String getMediumGroupPrice();

    public String getLargeGroupPrice();

    public String getDescription();

    public String getSpecification();

    public String getColor();

    public String getSize();

    public List<String> getReviews();

    public List<Product> getRelated();

}
