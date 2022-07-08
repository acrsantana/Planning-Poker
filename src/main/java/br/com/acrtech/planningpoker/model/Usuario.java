package br.com.acrtech.planningpoker.model;

import br.com.acrtech.planningpoker.dto.UsuarioDto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nome;
  private String email;
  private String senha;
  @Column(name = "data_nascimento")
  private LocalDate dataNascimento;
  private boolean visivel = true;
  @Column(name = "data_criacao")
  private LocalDate dataCriacao = LocalDate.now();


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


  public boolean getVisivel() {
    return visivel;
  }

  public void setVisivel(boolean visivel) {
    this.visivel = visivel;
  }

  public boolean isVisivel() {
    return visivel;
  }

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Usuario() {
  }

  public Usuario(UsuarioDto usuarioDto) {
    this.id = usuarioDto.getId();
    this.nome = usuarioDto.getNome();
    this.email = usuarioDto.getEmail();
    this.dataNascimento = LocalDate.parse(usuarioDto.getDataNascimento());
  }

  @Override public String toString() {
    return "Usuario{" + "id=" + id + ", nome='" + nome + '\'' + ", email='" + email + '\'' + ", senha='" + senha + '\'' + ", dataNascimento=" + dataNascimento + ", visivel=" + visivel + ", dataCriacao=" + dataCriacao + '}';
  }
}
