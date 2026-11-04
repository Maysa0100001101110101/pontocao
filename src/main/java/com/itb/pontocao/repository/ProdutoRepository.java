package com.itb.pontocao.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itb.pontocao.model.entity.Produto;
 
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}


