package br.ufrn.imd.impostorenda.model;

import java.util.Objects;

public class Pessoa implements Tributavel {
	private String nome;
	private double salario;
	private ContaCorrente conta;
	private SeguroVida seguro;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro) {
		this.nome = nome;
		this.salario = salario;
		this.conta = conta;
		this.seguro = seguro;
	}
	
	@Override
	public double calculaTributos() {
		return salario * 0.11;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public void setCont(ContaCorrente conta) {
		this.conta = conta;
	}

	public SeguroVida getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(conta, other.conta);
	}
}
