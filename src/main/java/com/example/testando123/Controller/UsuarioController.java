package com.example.testando123.Controller;

import com.example.testando123.Entity.User.DtoUser;
import com.example.testando123.Entity.User.Usuario;
import com.example.testando123.Services.UsuarioService;
import com.example.testando123.repositories.repositorieUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsuarioController {

@Autowired
private repositorieUsers repositorieUsers;

@Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity cadastro(@RequestBody DtoUser dtoUser){

        Usuario user = repositorieUsers.findByEmailUser(dtoUser.getEmailUser());

        if(user == null){
            usuarioService.cadastroUsers(dtoUser);
            return ResponseEntity.ok().build();

        }

        return ResponseEntity.status(422).build();


    }
}
