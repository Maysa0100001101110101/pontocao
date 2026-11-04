package com.itb.pontocao.model.entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
 
@Entity
public class Funcionario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String nomeCompleto; // Corrigido para nomeCompleto (evita o erro das linhas 30 e 34)
    private String email;        // Declarado apenas uma vez (remove o erro de campo duplicado)
    private String telefone;
    private String cargo;
    private BigDecimal salario;  // Importado corretamente do java.math.BigDecimal
    private LocalDate dataAdmissao; // Importado corretamente do java.time.LocalDate
 
    // ==========================================
    // CONSTRUTORES (Opcional, mas recomendado)
    // ==========================================
    public Funcionario() {
    }
 
    // ==========================================
    // GETTERS E SETTERS
    // ==========================================
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getNomeCompleto() {
        return nomeCompleto;
    }
 
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public String getCargo() {
        return cargo;
    }
 
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 
    public BigDecimal getSalario() {
        return salario;
    }
 
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
 
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
 
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
 