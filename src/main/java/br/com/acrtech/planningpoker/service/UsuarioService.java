package br.com.acrtech.planningpoker.service;

import br.com.acrtech.planningpoker.dto.EmailDto;
import br.com.acrtech.planningpoker.repository.UsuarioRepository;
import br.com.acrtech.planningpoker.dto.UsuarioDto;
import br.com.acrtech.planningpoker.model.Senha;
import br.com.acrtech.planningpoker.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    EmailService emailService;
    public UsuarioDto cadastra(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario(usuarioDto);
        Senha senha = new Senha();
        usuario.setSenha(senha.getHash());
        usuario = usuarioRepository.save(usuario);
        EmailDto email = new EmailDto(usuario.getEmail(), "Sua senha de acesso ao EstimaTI", "Segue senha de acesso ao EstimaTI: ");
        emailService.enviaEmail(email, senha);
        return new UsuarioDto(usuario);
    }
}
