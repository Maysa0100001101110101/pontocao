package com.itb.pontocao.model.entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity 
@Table(name="Produto")
public class Produto {
 


    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String racao;
    private String brinquedo;
    private String petisco;
    private String shampoo;
    private String remedio;
   

    
    public Produto() {
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public String getPetisco() {
        return petisco;
    }

    public void setPetisco(String petisco) {
        this.petisco = petisco;
    }

    public String getShampoo() {
        return shampoo;
    }

    public void setShampoo(String shampoo) {
        this.shampoo = shampoo;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }
}
