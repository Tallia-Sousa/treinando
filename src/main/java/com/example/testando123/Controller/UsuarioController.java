package com.example.testando123.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/pagina")
    public String pagina() {
        return "index";
    }
}
