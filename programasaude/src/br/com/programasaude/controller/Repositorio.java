package br.com.programasaude.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.programasaude.model.Pessoa;

public class Repositorio {
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void adiconarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}
