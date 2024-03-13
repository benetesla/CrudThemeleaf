package com.faculdade.engenhariasoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.faculdade.engenhariasoftware.model.Usuario;

@Controller
public class CadastroController {

    @GetMapping("/cadastro")
    public String mostrarFormulario() {
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvarCadastro(Usuario usuario) {
        // Aqui você pode salvar o usuário no banco de dados
        return "redirect:/cadastro";
    }
}
