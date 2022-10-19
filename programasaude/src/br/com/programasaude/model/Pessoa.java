package br.com.programasaude.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, Date dataNascimento, double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}

	public abstract String calculaImc(double altura, double peso);
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Nome: " + nome + "\nData de Nascimento: " + sdf.format(dataNascimento)	 + "\nPeso: " + peso + "\nAltura: " + altura;
	}

}
