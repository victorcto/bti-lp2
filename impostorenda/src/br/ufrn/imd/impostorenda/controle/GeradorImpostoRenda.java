package br.ufrn.imd.impostorenda.controle;

import br.ufrn.imd.impostorenda.model.Pessoa;

public class GeradorImpostoRenda {
	private double totalTributo;
	
	public double calculaValorTotalTributo(Pessoa p) {
		totalTributo = p.calculaTributos() + p.getConta().calculaTributos() + p.getSeguro().calculaTributos();
		return totalTributo;
	}

	public double getTotalTributo() {
		return totalTributo;
	}
}
