package br.com.carbonfootprint.model;

import br.com.carbonfootprint.model.interfaces.ICarbonFootprint;

public class Veiculo implements ICarbonFootprint{
	private int quilometragem;
	
	public Veiculo(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	@Override
	public double getCarbonFootprint() {
		return 0;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	@Override
	public String toString() {
		return "Veiculo "+ "(" + getClass().getSimpleName() + "): \nquilometragem = " + quilometragem;
	}
}
