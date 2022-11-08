package br.ufrn.imd.impostorenda.visao;

import java.io.IOException;
import java.util.Scanner;

import br.ufrn.imd.impostorenda.dao.PessoaDAO;
import br.ufrn.imd.impostorenda.model.ContaCorrente;
import br.ufrn.imd.impostorenda.model.Pessoa;
import br.ufrn.imd.impostorenda.model.SeguroVida;

public class ImpostoRendaPF {
	public static void main(String[] args) throws InterruptedException, IOException {
		PessoaDAO dao = new PessoaDAO();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("********************************** IMPOSTO DE RENDA *********************************");
			System.out.println("\nEscolha uma opção:\n[1] Criar \n[2] Remover\n[3] Listar\n[4] Listar tributações\n[5] Imposto total\n[6] Sair");
			System.out.print("\n> ");
			
			String menu = sc.nextLine();
			if (menu.equals("1")) {
				System.out.println("\n*************************************** CRIAR ***************************************");
				System.out.println("\nPARTE 1: CONTA CORRENTE");
				System.out.print("Digite a agência: ");
				String agencia = sc.nextLine();
				System.out.print("Digite o número da conta: ");
				String numeroConta = sc.nextLine();
				System.out.print("Digite o saldo: ");
				String saldo = sc.nextLine();
				
				System.out.println("\nPARTE 2: SEGURO DE VIDA");
				System.out.print("Digite o número do seguro: ");
				String numeroSeguro = sc.nextLine();
				System.out.print("Digite o nome do beneficiário: ");
				String beneficiado = sc.nextLine();
				System.out.print("Digite o valor: ");
				String valor = sc.nextLine();
				System.out.print("Digite o taxa: ");
				String taxa = sc.nextLine();
				
				System.out.println("\nPARTE 3: PESSOA");
				System.out.print("Digite o seu nome: ");
				String nome = sc.nextLine();
				System.out.print("Digite o seu salário: ");
				String salario = sc.nextLine();
				
				ContaCorrente conta = new ContaCorrente(agencia, numeroConta, Double.parseDouble(saldo));
				SeguroVida seguro = new SeguroVida(Integer.parseInt(numeroSeguro), beneficiado, Double.parseDouble(valor), Double.parseDouble(taxa));
				Pessoa pessoa = new Pessoa(nome, Double.parseDouble(salario), conta, seguro);
				dao.cadastraPessoa(pessoa);
			} else if (menu.equals("2")) {
				System.out.println("\n*************************************** REMOVER *************************************");
				if (dao.getPessoas().isEmpty()) {
					System.out.println("Não possui pessoa para remover.");
				} else {
					System.out.print("Digite o número da agência a qual quer remover: ");
					String agencia = sc.nextLine();
					System.out.print("Digite o número da conta a qual quer remover: ");
					String numeroConta = sc.nextLine();
					Pessoa pessoa = dao.buscaPessoaPorAgenciaConta(agencia, numeroConta);
					if (pessoa != null) {
						dao.removePessoa(pessoa);
					} else {
						System.out.println("Pessoa não encontrada.");
					}
				}
			} else if (menu.equals("3"))  {
				System.out.println("\n********************************** LISTA DE PESSOAS *********************************");
				if (dao.getPessoas().isEmpty()) {
					System.out.println("Não há pessoas para serem exibidas.");
				} else {
					dao.listaPessoas();
				}
			} else if (menu.equals("4")) {
				System.out.println("\n******************************** LISTA DE TRIBUTAÇÕES *******************************");
				if (dao.getPessoas().isEmpty()) {
					System.out.println("Não há pessoas para serem exibidas.");
				} else {
					dao.calcularTributosPessoas();
				}
			}  else if (menu.equals("5")) {
				System.out.println("\n*********************************** IMPOSTO TOTAL ***********************************");
				if (dao.getPessoas().isEmpty()) {
					System.out.println("Não há pessoas para serem exibidas.");
				} else {
					dao.imprimeImpostoTotal();
				}
			} else if (menu.equals("6")) {
				System.exit(0);
				break;
			} else {
				System.err.println("Valor incorreto. Por favor, digite um número válido dentre as opções exibidas.");
			}
		}
		sc.close();
	}
	

}
