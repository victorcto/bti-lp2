package br.com.programasaude.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import br.com.programasaude.controller.Repositorio;
import br.com.programasaude.model.Homem;
import br.com.programasaude.model.Mulher;
import br.com.programasaude.model.Pessoa;

public class ProgramaSaude {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		
		Pessoa homem = new Homem("Victor Couto", sdf.parse("21-11-2020"), 75.0, 1.70);
		Pessoa mulher = new Mulher("Fulana", sdf.parse("16-08-1981"), 48.0, 1.64);
		
		Repositorio repositorio = new Repositorio();
		
		repositorio.adiconarPessoa(homem);
		repositorio.adiconarPessoa(mulher);
		
		for (Pessoa pessoa : repositorio.getPessoas()) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(pessoa);
			System.out.println(pessoa.calculaImc(pessoa.getAltura(), pessoa.getPeso()));
		}
		
	}

}
