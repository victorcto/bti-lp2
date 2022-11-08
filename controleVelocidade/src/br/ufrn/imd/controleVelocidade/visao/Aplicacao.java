package br.ufrn.imd.controleVelocidade.visao;

import br.ufrn.imd.controleVelocidade.excecoes.PistaException;
import br.ufrn.imd.controleVelocidade.model.Pista;

public class Aplicacao {
	public static void main(String[] args) {
		Pista pista = new Pista();
		try {
			pista.iniciar();
		} catch (PistaException p) {
			// p.printStackTrace();
			System.out.println("Pista foi bloqueada.");
		}
	}
}
