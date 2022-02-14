package br.com.comercio.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_categoria")
    private Integer categoria;

    @Column(name = "cat_descricao", length = 45)
    private String descricao;

    @Lob
    @Column(name = "cat_resumo")
    private String resumo;

    public String getDescricao() {
        return descricao;
    }

    public Integer getCod_categoria() {
        return categoria;
    }

    public void setCod_categoria(Integer categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria1 = (Categoria) o;
        return Objects.equals(categoria, categoria1.categoria) && Objects.equals(descricao, categoria1.descricao) && Objects.equals(resumo, categoria1.resumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, descricao, resumo);
    }
}
