package com.example.cars.models;

import javax.persistence.*;

@Entity
public class Car{

    @Id
    private int id_Car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;


    public Car(Model model, Brand brand) {
        this.model = model;
        this.brand = brand;
    }
}
