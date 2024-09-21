package com.SP.domain.model;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "tb_expert")
@RequiredArgsConstructor
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String grupo;
    private String instituicao;
    private String periodo;
    private String descricao;
    private String foto;
}