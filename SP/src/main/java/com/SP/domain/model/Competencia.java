package com.SP.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "tb_competents")
@RequiredArgsConstructor
public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}