package com.example.testando123.Entity.User;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name = "usuarios")
@EqualsAndHashCode(of = "id")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private String id;
    @Column(name = "Email")
    String emailUser;
    @Column(name = "Nome")
    String nomeUser;


    public Usuario(String nomeUser, String emailUser ) {
        this.emailUser = emailUser;
        this.nomeUser = nomeUser;
    }
}
