package com.lukeneal.api.domain;

import java.util.Date;

public class ProductDto {

    private String productName;

    private String description;

    private String categoryName;

    private String creationDate;

    private String updatedDate;

    private String lastPurchasedDate;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getLastPurchasedDate() {
        return lastPurchasedDate;
    }

    public void setLastPurchasedDate(String lastPurchasedDate) {
        this.lastPurchasedDate = lastPurchasedDate;
    }
}
