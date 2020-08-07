package com.example.cars.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
public class Brand {
    private int id_Brand;
    private String nombre;
    private Date startDate;
    private String country;

    @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
    private Set<Car> cars;

    public Brand(String nombre, Date startDate, String country) {
        this.nombre = nombre;
        this.startDate = startDate;
        this.country = country;
    }
}
