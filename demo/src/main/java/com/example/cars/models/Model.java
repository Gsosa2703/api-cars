package com.example.cars.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Model {

    @Id
    private int id_Model;

    private String name;
    private String motor;

    @OneToMany(mappedBy = "model", fetch = FetchType.EAGER)
    private Set<Model> models;

    public Model( String name, String motor) {
        this.name = name;
        this.motor = motor;
    }
}
