package br.com.arturemilcorp.DashCard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arturemilcorp.DashCard.dao.TransacaoDAO;
import br.com.arturemilcorp.DashCard.model.Transacao;

@RestController
@CrossOrigin("*")
public class TransacaoController {

	@Autowired
	TransacaoDAO dao;
	
	
	@GetMapping("/transacoes")
	public ArrayList<Transacao> obterTodas(){
		ArrayList<Transacao> lista;
		lista = (ArrayList<Transacao>)dao.findAll();
		return lista;
	}

}
	
	

