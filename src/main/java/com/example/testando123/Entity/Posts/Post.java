package com.example.testando123.Entity.Posts;

import com.example.testando123.Entity.User.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "posts")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Usuario autor;


    @Column(columnDefinition = "TEXT")
    private String content;
}
