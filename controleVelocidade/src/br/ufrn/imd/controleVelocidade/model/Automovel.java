package br.ufrn.imd.controleVelocidade.model;

import br.ufrn.imd.controleVelocidade.excecoes.AcimaVelocidadeException;

public class Automovel {
	public static final double VELOCIDADE_MAXIMA = 80.0;
	private double velocidadeAtual;
	
	public Automovel(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void acelerar(int velocidade) throws AcimaVelocidadeException {
		if ((velocidadeAtual + velocidade) > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
		} else {
			velocidadeAtual += velocidade;
		}
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
}
