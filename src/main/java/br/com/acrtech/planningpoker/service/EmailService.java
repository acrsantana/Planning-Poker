package br.com.acrtech.planningpoker.service;

import br.com.acrtech.planningpoker.dto.EmailDto;
import br.com.acrtech.planningpoker.dto.UsuarioDto;
import br.com.acrtech.planningpoker.model.Senha;
import br.com.acrtech.planningpoker.model.Usuario;
import br.com.acrtech.planningpoker.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void enviaEmail(EmailDto email, Senha senha) {
        /** TODO - Implementar envio de e-mail. */
        System.out.println(email.getTo());
        System.out.println(email.getSubject());
        System.out.println(email.getMessage() + senha.getSenha());
    }
}
