package com.example.tsi.Rivas.Alejandro.demo;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    private int last_update;

    private String name;

    public Category() {}

    public Category(String name, int last_update, int category_id) {

        this.name = name;
        this.last_update = last_update;
        this.category_id = category_id;

    }

    public int getCategory_id() {
        return category_id;
    }
    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }

    public int getLast_Update() {
        return last_update;
    }

    }

