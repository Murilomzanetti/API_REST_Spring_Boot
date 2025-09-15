package com.example.api_produtos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_produtos.model.Idoso;

public interface IdosoRepository extends JpaRepository<Idoso, Long> {
    List<Idoso> findByNome(String nome);
    List<Idoso> findByNomeContaining(String parteDoNome);
}
