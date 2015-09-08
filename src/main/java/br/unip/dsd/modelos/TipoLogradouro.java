package br.unip.dsd.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dirceu on 8/30/15.
 */
@Entity
public class TipoLogradouro {
    @Id
    private Long id;
    private String nome;

    public TipoLogradouro() {
    }

    public TipoLogradouro(Long id, String nome) {

        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoLogradouro)) return false;

        TipoLogradouro that = (TipoLogradouro) o;

        if (!id.equals(that.id)) return false;
        if (!nome.equals(that.nome)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        return result;
    }

}
