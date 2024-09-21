package com.SP.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "tb_competents")
@NoArgsConstructor
@AllArgsConstructor
public class Competencia {

    private Long id;
    private String nome;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}