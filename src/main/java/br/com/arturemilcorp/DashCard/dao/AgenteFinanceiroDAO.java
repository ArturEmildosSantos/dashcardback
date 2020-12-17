package br.com.arturemilcorp.DashCard.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.arturemilcorp.DashCard.model.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro , Integer>{
	
	public ArrayList<AgenteFinanceiro> findAllByOrderByVolumeDesc();

}
