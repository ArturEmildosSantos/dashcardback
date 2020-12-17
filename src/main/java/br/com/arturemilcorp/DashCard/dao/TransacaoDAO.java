package br.com.arturemilcorp.DashCard.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.arturemilcorp.DashCard.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer> {

}
