package com.SP.domain.model;


import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity(name = "tb_contacts")
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private String telefone;
    private String nome;
    private String email;
    private String git;

}