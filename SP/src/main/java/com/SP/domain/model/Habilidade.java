package com.SP.domain.model;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity(name = "tb_handle")
@NoArgsConstructor
@AllArgsConstructor
public class Habilidade {

    private Integer id;
    private String nome;
    private String periodo;
}