package com.SP.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "tb_handle")
@RequiredArgsConstructor
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String periodo;
}