package br.com.agrotiskane.agrotis_kane.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.agrotiskane.agrotis_kane.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value = "SELECT u FROM Usuario u WHERE UPPER(TRIM(u.nome)) LIKE %?1%")
	List<Usuario> buscarPorNome(String name);
	
}
