package com.example.demospringdto.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String name;

    @Column
    public String login;

    @Column
    public String password;

    @Column
    public double rating;

    @ManyToOne
    @JoinColumn(name="id_country")
    public Country country;
}
