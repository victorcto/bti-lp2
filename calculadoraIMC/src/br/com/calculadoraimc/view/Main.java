package br.com.calculadoraimc.view;

import java.util.Locale;
import java.util.Scanner;

import br.com.calculadoraimc.controller.CalculaImc;
import br.com.calculadoraimc.model.Pessoa;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("= = = = = = = = = = = = = = = = Calculadora IMC = = = = = = = = = = = = = = = = ");
		System.out.print("\n1. Qual é o seu peso, em quilogramas (kg)? ");
		float peso = sc.nextFloat();
		System.out.print("2. Qual é a sua altura, em metros (m)? ");
		float altura = sc.nextFloat();
		
		CalculaImc imc = new CalculaImc(new Pessoa(peso, altura));
		
		float resultado = imc.calcularImc();
		String classificacao = imc.classifcarImc(resultado);
		
		System.out.println(String.format("\nO resultado do seu IMC é %.2f, no qual é classificado como %s.", resultado, classificacao));
		
		sc.close();
	}
}
