package com.example.testando123.Entity.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name = "usuarios")
public class Usuario {


    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    String id;
    @Column(name = "Email")
    String emailUser;
    @Column(name = "Nome")
    String nomeUser;


    public Usuario(String nomeUser, String emailUser ) {
        this.emailUser = emailUser;
        this.nomeUser = nomeUser;
    }
}
