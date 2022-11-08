package br.ufrn.imd.impostorenda.model;

import java.util.Objects;

public class ContaCorrente implements Tributavel {
	private String agencia;
	private String numero;
	private double saldo;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	@Override
	public double calculaTributos() {
		return saldo * 0.0038;
	}

	public void saca(double valor) {
		saldo -= valor;
		String msg = String.format("Saque de %.1f em [%s] efetuado com sucesso!", valor, numero);
		System.out.println(msg);
	}
	
	public void deposita(double valor) {
		saldo += valor;
		String msg = String.format("Depósito de %.1f em [%s] efetuado com sucesso!", valor, numero);
		System.out.println(msg);
	}
	
	public void transfere(double valor, ContaCorrente cc) {
		saca(valor);
		cc.deposita(valor);
		String msg = String.format("Transferindo %.1f para [%s]", valor, cc.getNumero());
		System.out.println(msg);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(numero, other.numero);
	}
}
