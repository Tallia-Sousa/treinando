package com.example.testando123.repositories;

import com.example.testando123.Entity.User.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorieUsers extends JpaRepository<Usuario, String> {


    Usuario findByEmailUser(String emailUser);
}
