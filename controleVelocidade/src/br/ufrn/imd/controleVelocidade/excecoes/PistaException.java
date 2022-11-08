package br.ufrn.imd.controleVelocidade.excecoes;

public class PistaException extends Exception {
	private static final long serialVersionUID = 3207792197927254715L;
	
	public PistaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
