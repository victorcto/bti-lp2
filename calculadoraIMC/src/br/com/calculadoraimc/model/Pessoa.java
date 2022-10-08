package br.com.calculadoraimc.model;

public class Pessoa {
	private float peso;
	private float altura;
	
	public Pessoa(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
