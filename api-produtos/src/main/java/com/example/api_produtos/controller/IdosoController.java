package com.example.api_produtos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_produtos.model.Idoso;
import com.example.api_produtos.repository.IdosoRepository;

@RestController
@RequestMapping("/idosos")
public class IdosoController {
    private final IdosoRepository repository;
    
    public IdosoController(IdosoRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping
    public Idoso criar(@RequestBody Idoso idoso) {
        return repository.save(idoso);
    }

    @GetMapping
    public List<Idoso> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Idoso buscar(@PathVariable Long id_idoso) {
        return repository.findById(id_idoso).orElse(null);
    }

    @PutMapping("/{id}")
    public Idoso atualizar(@PathVariable Long id_idoso, @RequestBody Idoso novoIdoso) {
        return repository.findById(id_idoso).map(idoso -> {
            idoso.setNome(novoIdoso.getNome());
            idoso.setTelefone(novoIdoso.getTelefone());
            return repository.save(idoso);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id_idoso) {
        repository.deleteById(id_idoso);
    }
}
