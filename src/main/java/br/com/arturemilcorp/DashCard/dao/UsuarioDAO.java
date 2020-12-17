package br.com.arturemilcorp.DashCard.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.arturemilcorp.DashCard.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	
	public Usuario findByEmailAndPassword(String email, String password);
	
	public Usuario findByEmailOrRacf(String email, String racf);

}
