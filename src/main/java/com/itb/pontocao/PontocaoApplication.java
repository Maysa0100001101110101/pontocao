package com.itb.pontocao;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class PontocaoApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(PontocaoApplication.class, args);
        System.out.println("\n------------------------------------------------------------");
            System.out.println(" 🚀 APLICAÇÃO PONTO CÃO (API) RODANDO COM SUCESSO! 🐶🐱");
            System.out.println(" 🌐 Porta: http://localhost:8085");
            System.out.println("------------------------------------------------------------\n");
    }
}