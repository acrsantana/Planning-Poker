package br.com.acrtech.planningpoker.dto;

import br.com.acrtech.planningpoker.model.Usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.format.DateTimeFormatter;

public class UsuarioDto {
    private long id;
    @NotNull
    private String nome;
    @Email(message = "Favor informar um e-mail válido")
    @NotNull(message = "É necessário informar um e-mail")
    private String email;
    @NotNull(message = "A senha não pode ser nula")
    @Size(min = 6, max = 20, message = "A senha precisa ter entre 6 e 20 caracteres")
    private String senha;

    private String dataNascimento;
    private String dataCriacao;

    public UsuarioDto() {
    }

    public UsuarioDto(Usuario usuario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.dataNascimento = formatter.format(usuario.getDataNascimento());
        this.dataCriacao = formatter.format(usuario.getDataCriacao());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override public String toString() {
        return "UsuarioDto{" + "id=" + id + ", nome='" + nome + '\'' + ", email='" + email + '\'' + ", senha='" + senha + '\'' + ", dataNascimento=" + dataNascimento + ", dataCriacao=" + dataCriacao + '}';
    }
}
