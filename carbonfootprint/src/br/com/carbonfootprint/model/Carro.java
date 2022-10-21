package br.com.carbonfootprint.model;

import br.com.carbonfootprint.model.interfaces.ICarbonFootprint;

public class Carro extends Veiculo implements ICarbonFootprint {
	private double motor;
	
	public Carro(int quilometragem, double motor) {
		super(quilometragem);
		this.motor = motor;
	}
	
	@Override
	public double getCarbonFootprint() {
		if (motor > 2.0) {
			return getQuilometragem() * 1.85;
		} else if (motor < 1.0) {
			return getQuilometragem() * 0.13;
		} else {
			return getQuilometragem() * 1.22;
		}
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return super.toString() + "\nmotor = " + motor;
	}
}
