package com.crud.Angular_Spring_Full_Project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String email;
    @Column
    private String experience;
    @Column
    private String domain;

    public String getName() {
        return name;
    }
}
