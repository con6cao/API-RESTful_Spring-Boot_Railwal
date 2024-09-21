package com.SP.domain.model;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity(name = "tb_expert")
@NoArgsConstructor
@AllArgsConstructor
public class Experiencia {

    private Integer id;
    private String nome;
    private String grupo;
    private String instituiO;
    private String periodo;
    private String descricao;
    private String foto;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getInstituiO() {
        return instituiO;
    }

    public void setInstituiO(String instituiO) {
        this.instituiO = instituiO;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}