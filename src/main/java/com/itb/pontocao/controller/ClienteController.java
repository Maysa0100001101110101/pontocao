package com.itb.pontocao.controller;
 
import com.itb.pontocao.model.entity.Cliente;
import com.itb.pontocao.repository.ClienteRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.ArrayList;
import java.util.List;
 
@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
 
    
 
    @GetMapping
    public List<Cliente> listarClientes() {
       
        List<Cliente> listaTeste = new ArrayList<>();
        Cliente c = new Cliente();
        c.setNome("Cliente Teste SQL Server");
        c.setEmail("teste@email.com");
        listaTeste.add(c);
        
        return listaTeste;
        
    }
}
 