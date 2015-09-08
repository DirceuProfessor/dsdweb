package br.unip.dsd.modelos;


import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

/**
 * Created by dirceu on 8/30/15.
 */
@Entity
public class Usuario implements Serializable{

    @Id
    @Column(name="usuario_id")
    private Long id;
    private String nome;

    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="usuario")
    public List<Endereco> endereco = Collections.<Endereco>emptyList();

    public Usuario() {
    }
        public Usuario(Long id, String nome) {
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

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (endereco != null ? !endereco.equals(usuario.endereco) : usuario.endereco != null) return false;
        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (nome != null ? !nome.equals(usuario.nome) : usuario.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        return result;
    }
}
