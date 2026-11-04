package com.itb.pontocao.controller;
 
import com.itb.pontocao.model.entity.Pet;
import com.itb.pontocao.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "*")
public class PetController {
 
    @Autowired
    private PetRepository petRepository;
 
    // ROTA PARA LISTAR: Retorna todos os pets cadastrados no sistema
    @GetMapping
    public List<Pet> listarTodos() {
        return petRepository.findAll();
    }
 
    // ROTA PARA CADASTRAR: Salva um novo pet (com nome, espécie, etc) no banco de dados
    @PostMapping
    public Pet cadastrar(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
 
    // ROTA PARA BUSCAR POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Pet> buscarPorId(@PathVariable Long id) {
        return petRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}