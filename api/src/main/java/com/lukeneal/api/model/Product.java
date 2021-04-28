package com.lukeneal.api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;


    // Note: I have made these date fields type String for time's sake. The data needs formatting correctly to insert as a Date.
    @Column
    private String creationDate;

    @Column
    private String updatedDate;

    @Column
    private String lastPurchasedDate;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public void setUpdatedDate(String updateDate) {
        this.updatedDate = updatedDate;
    }

    public String getLastPurchasedDate() {
        return lastPurchasedDate;
    }

    public void setLastPurchasedDate(String lastPurchasedDate) {
        this.lastPurchasedDate = lastPurchasedDate;
    }
}
