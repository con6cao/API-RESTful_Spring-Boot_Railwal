package com.SP.domain.model;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@JsonRootName(value = "usuario")
@Entity(name = "tb_user")
@RequiredArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private String tipoIdentidade;
    private String endereco;
    private String numIdentidade;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Competencia> competencias;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Habilidade> habilidades;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Experiencia> experiencias;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Contato> contatos;
}