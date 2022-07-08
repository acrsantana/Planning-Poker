package br.com.acrtech.planningpoker.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Random;

public class Senha {
    private String senha;
    private String hash;

    public Senha() {
        this.senha = gerarSenha();
        this.hash = encriptarSenha(this.senha);
    }

    private String encriptarSenha(String senha) {
        return new BCryptPasswordEncoder().encode(senha);
    }

    private String gerarSenha() {
        return String.valueOf(new Random().nextLong(100000, 999999));
    }

    public String getSenha() {
        return senha;
    }

    public String getHash() {
        return hash;
    }
}
