package br.unip.dsd.repositorios;

import br.unip.dsd.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dirceu on 8/30/15.
 */
public interface RepositorioUsuario extends JpaRepository<Usuario,Long> {
    public Usuario findById(Long id);

}
