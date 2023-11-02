package com.guitarchive.guitarchive.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Guitar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String make;
    private String model;
    private String year;
    private String imageURL;
    private String purchaseDate;
    private String purchaseLocation;
    private String description;


    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseLocation() {
        return purchaseLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchaseLocation(String purchaseLocation) {
        this.purchaseLocation = purchaseLocation;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
