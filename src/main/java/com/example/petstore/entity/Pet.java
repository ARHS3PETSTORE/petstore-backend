package com.example.petstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Age", nullable = false)
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
