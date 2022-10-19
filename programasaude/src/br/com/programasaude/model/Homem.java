package br.com.programasaude.model;

import java.util.Date;

public class Homem extends Pessoa {
	public Homem(String nome, Date dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String calculaImc(double altura, double peso) {
		double imc = peso / (altura * altura);
		
		if (imc < 20.7) {
			return String.format("%.2f - Abaixo do peso ideal.", imc);
		} else if (imc >= 20.7 && imc <= 26.4) {
			return String.format("%.2f - Peso ideal", imc);
		} else {
			return String.format("%.2f -  Acima do peso ideal.", imc);
		}
	}

}
