package com.example.api_produtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Idoso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_idoso;
    private String nome;
    private int telefone;

    public Idoso(){}

    public Idoso(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public long getId_idoso() {
        return id_idoso;
    }

    public void setId_idoso(long id_idoso) {
        this.id_idoso = id_idoso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    

}
