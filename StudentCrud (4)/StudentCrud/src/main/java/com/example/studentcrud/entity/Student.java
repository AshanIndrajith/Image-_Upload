package com.example.studentcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id", nullable = false)
    private String vehicle_id	;

    @Column(name = "description")
    private String description;

    @Column(name = "damage_date")
    private String damage_date	;


    @Column(name = "image")
    private String image;

    @Column(name = "amount")
    private float amount;

    public Student() {
    }

    public Student(Long id, String vehicle_id, String description, String damage_date, String image, float amount) {
        this.id = id;
        this.vehicle_id = vehicle_id;
        this.description = description;
        this.damage_date = damage_date;
        this.image = image;
        this.amount = amount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDamage_date() {
        return damage_date;
    }

    public void setDamage_date(String damage_date) {
        this.damage_date = damage_date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
