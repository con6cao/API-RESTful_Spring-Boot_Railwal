package com.SP.domain.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "tb_contacts")
@RequiredArgsConstructor
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefone;
    private String nome;
    private String email;
    private String git;
}