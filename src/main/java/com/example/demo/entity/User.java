package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(Integer id) {
        this.id = id;
    }

    public User() {
    }
}
