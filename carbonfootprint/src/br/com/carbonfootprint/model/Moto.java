package br.com.carbonfootprint.model;

import br.com.carbonfootprint.model.interfaces.ICarbonFootprint;

public class Moto extends Veiculo implements ICarbonFootprint {
	private int cilindrada;
	
	public Moto(int quilometragem, int cilindrada) {
		super(quilometragem);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double getCarbonFootprint() {
		if (cilindrada > 650) {
			return getQuilometragem() * 0.65;
		} else if (cilindrada < 150) {
			return getQuilometragem() * 0.2;
		} else {
			return getQuilometragem() * 0.5;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "\ncilindrada = " + cilindrada;
	}

}
