package com.itb.pontocao.repository;
 
import com.itb.pontocao.model.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
 
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
 
   
    Optional<Funcionario> findByEmail(String email);
 
    
    List<Funcionario> findByCargo(String cargo);
}
 