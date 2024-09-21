package com.SP.domain.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Entity(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private String tipoIdentidade;
    private String endereco;
    private String numIdentidade;
    private List<Competencia> competencias ;
    private List<Habilidade> habilidades ;
    private List<Experiencia> experiencias ;
    private List<Contato> contatos ;

}