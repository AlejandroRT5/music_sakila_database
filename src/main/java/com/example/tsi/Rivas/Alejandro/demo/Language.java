package com.example.tsi.Rivas.Alejandro.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int language_id;

private String name;

/// Empty Constructor ///
@OneToMany
@JoinColumn(name = "language_id", insertable = false, updatable = false)
@JsonIgnore
private Set<Film> film;

    public Language(String name) {
this.name = name;
    }
    public Language() {}
    public int getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



