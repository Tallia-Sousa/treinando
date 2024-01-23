package com.example.testando123.Services;

import com.example.testando123.Entity.User.DtoUser;
import com.example.testando123.Entity.User.Usuario;
import com.example.testando123.repositories.repositorieUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private repositorieUsers repositorirUsers;


    public List<Usuario> listUsers(){
        List<Usuario> list= repositorirUsers.findAll();
        return list;
    }


    public void cadastroUsers(DtoUser dtoUser){
        Usuario user = new Usuario(dtoUser.getNomeUser(), dtoUser.getEmailUser());
        repositorirUsers.save(user);

    }

}
