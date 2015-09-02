package br.unip.dsd.modelos;


import javax.persistence.OneToMany;
import java.util.Collections;
import java.util.List;

/**
 * Created by dirceu on 8/30/15.
 */
public class Usuario {

    private Long id;
    private String name;

    @OneToMany
    private List<Endereco> enderecos = Collections.emptyList();

    public Usuario(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (name != null ? !name.equals(usuario.name) : usuario.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
