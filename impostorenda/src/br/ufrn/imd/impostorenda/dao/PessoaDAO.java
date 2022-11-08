package br.ufrn.imd.impostorenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.impostorenda.controle.GeradorImpostoRenda;
import br.ufrn.imd.impostorenda.model.Pessoa;
import br.ufrn.imd.impostorenda.visao.Color;

public class PessoaDAO {
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastraPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		String msg = String.format("\n%sPessoa com a conta [%s] e agência [%s] foi adicionada com sucesso!%s", Color.GREEN_BOLD, pessoa.getConta().getNumero(), pessoa.getConta().getAgencia(), Color.RESET);
		System.out.println(msg);
	}
	
	public void removePessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
		String msg = String.format("\n%sPessoa com a conta [%s] e agência [%s] foi remvoida com sucesso!%s", Color.RED_BOLD, pessoa.getConta().getNumero(), pessoa.getConta().getAgencia(), Color.RESET);
		System.out.println(msg);
	}
	
	public Pessoa buscaPessoaPorAgenciaConta(String agencia, String conta) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getConta().getAgencia().equals(agencia) && pessoa.getConta().getNumero().equals(conta)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public void listaPessoas() {
		for (Pessoa pessoa : pessoas) {
			for (int i=1; i<=85; i++) System.out.print("*");
			String linha1 = String.format("\nNome...: %s \t Salário.: %.2f", pessoa.getNome(), pessoa.getSalario());
			String linha2 = String.format("Agência: %s Conta.: %s \t Saldo.: %.2f", pessoa.getConta().getAgencia(), pessoa.getConta().getNumero(), pessoa.getConta().getSaldo());
			String linha3 = String.format("Seguro: %s \t Beneficiário.: %s ", pessoa.getSeguro().getNumero(), pessoa.getSeguro().getBeneficiado());
			String linha4 = String.format("Valor Seguro: %.2f", pessoa.getSeguro().getValor());
			System.out.println(linha1);
			System.out.println(linha2);
			System.out.println(linha3);
			System.out.println(linha4);
		}
	}
	
	public void calcularTributosPessoas() {
		for (Pessoa pessoa : pessoas) {
			for (int i=1; i<=85; i++) System.out.print("*");
			GeradorImpostoRenda irpf = new GeradorImpostoRenda();
			irpf.calculaValorTotalTributo(pessoa);
			String msg = String.format("\nNome...: %s \t IRPF.: %.2f", pessoa.getNome(), irpf.calculaValorTotalTributo(pessoa));
			System.out.println(msg);
		}
	}

	public void imprimeImpostoTotal() {
		GeradorImpostoRenda irpf = new GeradorImpostoRenda();
		double impostoTotal = 0, maiorSeguro = pessoas.get(0).getSeguro().getValor(), maiorImposto = irpf.calculaValorTotalTributo(pessoas.get(0));
		Pessoa pessoaMaiorImposto = pessoas.get(0), pessoaMaiorSeguro = pessoas.get(0);
		
		for (Pessoa pessoa : pessoas) {
			irpf = new GeradorImpostoRenda();
			impostoTotal += irpf.calculaValorTotalTributo(pessoa);
			
			if (irpf.calculaValorTotalTributo(pessoa) > maiorImposto) {
				maiorImposto = irpf.calculaValorTotalTributo(pessoa);
				pessoaMaiorImposto = pessoa;
			}
			
			if (pessoa.getSeguro().getValor() > maiorSeguro) {
				maiorSeguro = pessoa.getSeguro().getValor();
				pessoaMaiorSeguro = pessoa;
			}
		}
		
		String linha1 = String.format("\nValor total de imposto recolhido: %.2f", impostoTotal);
		String linha2 = String.format("Pessoa com maior imposto pago: %s", pessoaMaiorImposto.getNome());
		String linha3 = String.format("Beneficiário com maior valor de seguro: %s", pessoaMaiorSeguro.getNome());
		System.out.println(linha1);
		System.out.println(linha2);
		System.out.println(linha3);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}
