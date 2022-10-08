package br.com.calculadoraimc.controller;

import br.com.calculadoraimc.model.Pessoa;

public class CalculaImc {
	
	private Pessoa pessoa;
	
	public CalculaImc(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public float calcularImc() {
		return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
	}

	public String classifcarImc(float imc) {
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc >= 18.5 && imc <= 24.9) {
			return "Peso normal";
		} else if (imc >= 25.0 && imc <= 29.9) {
			return "Pré-obesidade";
		} else if (imc >= 30.0 && imc <= 34.9) {
			return "Obesidade Grau 1";
		} else if (imc >= 35.5 && imc <= 39.9) {
			return "Obesidade Grau 2";
		} else {
			return "Obesidade Grau 3";
		}
	}
}
