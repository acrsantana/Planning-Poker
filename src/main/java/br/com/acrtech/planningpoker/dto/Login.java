package br.com.acrtech.planningpoker.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
    @NotNull(message = "O campo login é obrigatório")
    @Email(message = "O campo login deve ser um e-mail válido")
    private String username;
    @NotNull(message = "O campo senha é obrigatório")
    @Size(min = 6, max = 30, message = "A senha deve ter entre 6 e 30 caracteres")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
