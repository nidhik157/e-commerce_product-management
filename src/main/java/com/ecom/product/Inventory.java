package com.ecom.product;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory") // Specify the table name explicitly
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Add constraints for category
    private String category;

    @Column(nullable = false) // Add constraints for category
    private String image;

    @Column(nullable = false) // Add constraints for size
    private String size;

    @Column(nullable = false) // Add constraints for color
    private String color;

    @Column(nullable = false) // Add constraints for price
    private Double price;

    @Column(nullable = false) // Add constraints for stock
    private Integer stock;

    @Column(nullable = false) // Add constraints for stock
    private String description;

    // Constructors
    public Inventory() {
        // Default constructor
    }

    public Inventory(String category, String size, String color, Double price, Integer stock, String description, String image) {
        this.category = category;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stock = stock;
        this.description=description;
        this.image=image;

    }


    // Getters
    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }
    public String getImage() {
        return image;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
