package com.itb.pontocao.controller;
 
import com.itb.pontocao.model.entity.Funcionario;
import com.itb.pontocao.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*")
public class FuncionarioController {
 
    @Autowired
    private FuncionarioRepository funcionarioRepository;
 
    
    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }
 
    
    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
 

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
        return funcionarioRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
 