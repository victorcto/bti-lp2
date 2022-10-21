package br.com.carbonfootprint.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.carbonfootprint.model.Veiculo;

public class Repositorio {
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();

	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

}
