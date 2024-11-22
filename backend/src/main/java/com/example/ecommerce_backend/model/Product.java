package com.example.ecommerce_backend.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;

    //Getters and Setters
    public long getId(){
        return id;
    }
    public void setId(Long id)
    {
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price=price;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        this.imageUrl=imageUrl;
    }

}