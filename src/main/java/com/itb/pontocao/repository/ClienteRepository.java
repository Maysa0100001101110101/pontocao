package com.itb.pontocao.repository;
 
import com.itb.pontocao.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
 