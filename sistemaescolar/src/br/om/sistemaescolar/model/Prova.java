package br.om.sistemaescolar.model;

public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	public Prova(double notaParte1, double notaParte2) {
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}

	public double calcularNotaTotal() {
		double total =  notaParte1 + notaParte2;
		try {
			if (total > 10.0) {
				throw new Exception("A soma das partes da nota não pode ultrapassar 10.0!");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		return total;
	}
	
	public double getNotaParte1() {
		return notaParte1;
	}
	
	public void setNotaParte1(double notaParte1) {
		this.notaParte1 = notaParte1;
	}
	
	public double getNotaParte2() {
		return notaParte2;
	}
	
	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}
}
