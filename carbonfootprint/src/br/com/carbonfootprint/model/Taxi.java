package br.com.carbonfootprint.model;

import br.com.carbonfootprint.model.interfaces.ICarbonFootprint;

public class Taxi extends Veiculo implements ICarbonFootprint {
	private int qtdPessoas;
	
	public Taxi(int quilometragem, int qtdPessoas) {
		super(quilometragem);
		this.qtdPessoas = qtdPessoas;
	}
	
	@Override
	public double getCarbonFootprint() {
		return getQuilometragem() * 1.1;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nquantidades de pessoas = " + qtdPessoas;
	}
}
