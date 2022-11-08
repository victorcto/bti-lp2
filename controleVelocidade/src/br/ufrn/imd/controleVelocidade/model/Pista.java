package br.ufrn.imd.controleVelocidade.model;

import br.ufrn.imd.controleVelocidade.excecoes.AcimaVelocidadeException;
import br.ufrn.imd.controleVelocidade.excecoes.PistaException;

public class Pista {
	public void iniciar() throws PistaException {
		try {
			Automovel auto = new Automovel(60);
			auto.acelerar(30);
		} catch (AcimaVelocidadeException a) {
			throw new PistaException("Pista com problema", a);
		}
	}
}
