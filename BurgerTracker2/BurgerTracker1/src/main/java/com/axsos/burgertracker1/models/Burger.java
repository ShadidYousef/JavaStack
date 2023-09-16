package com.axsos.burgertracker1.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min=5, max = 20, message = "Must be at least 5 characters")
    private String burgerName;
    @NotBlank
    @Size(min=5, max = 20, message = "Must be at least 5 characters")
    private String restaurantName;
    @NotNull
    @Min(value = 1, message = "Rating can't be below 1")
    @Max(value = 5, message = "Rating can't be above 5")
    private Integer burgerRating;
    @NotBlank
    @Size(min=10, max = 500, message = "Must be at least 10 characters")
    private String burgerNotes;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public Burger(){

    }

    public Burger(String burgerName, String restaurantName, Integer burgerRating, String burgerNotes){
        this.burgerName = burgerName;
        this.restaurantName = restaurantName;
        this.burgerRating = burgerRating;
        this.burgerNotes = burgerNotes;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getBurgerRating() {
        return burgerRating;
    }

    public void setBurgerRating(Integer burgerRating) {
        this.burgerRating = burgerRating;
    }

    public String getBurgerNotes() {
        return burgerNotes;
    }

    public void setBurgerNotes(String burgerNotes) {
        this.burgerNotes = burgerNotes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
