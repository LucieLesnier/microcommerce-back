package com.example.microcommerce;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class CharacterClass {
    private String name;
    private int life;
    private int id;

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    public CharacterClass(String name, int life, int id) {
        this.name = name;
        this.life = life;
        this.id = id;
    }
}
