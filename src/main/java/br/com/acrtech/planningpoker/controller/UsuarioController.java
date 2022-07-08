package br.com.acrtech.planningpoker.controller;

import br.com.acrtech.planningpoker.dto.UsuarioDto;
import br.com.acrtech.planningpoker.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/planningpoker")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/login")
    public String paginaLogin(){
        return "login/login";
    }

//    @PostMapping("/login")
//    public String autenticaUsuario(){}

    @GetMapping("/cadastro")
    public String paginaCadastro(final Model model){
        model.addAttribute("usuario", new UsuarioDto());
        return "usuario/cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastro(
        @Valid @ModelAttribute UsuarioDto usuario,
        final Model model
    ) {
        model.addAttribute("usuario", usuarioService.cadastra(usuario));
        return "usuario/respostaCadastro";
    }
}
