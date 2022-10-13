package br.om.sistemaescolar.view;

import br.om.sistemaescolar.model.Aluno;
import br.om.sistemaescolar.model.Prova;
import br.om.sistemaescolar.model.Turma;

public class SistemaEscolar {
	public static void main(String[] args) {
		Prova prova11 = new Prova(3.0, 3.5);
		Prova prova21 = new Prova(4.0, 4.0);
		Prova prova12 = new Prova(6.5, 3.0);
		Prova prova22 = new Prova(1.5, 1.5);
		Prova prova13 = new Prova(3.5, 4.0);
		Prova prova23 = new Prova(5.0, 4.0);
		
		Aluno aluno1 = new Aluno(prova11, prova21);
		Aluno aluno2 = new Aluno(prova12, prova22);
		Aluno aluno3 = new Aluno(prova13, prova23);
		
		Turma turma = new Turma(aluno1, aluno2, aluno3);
		
		double mediaAluno1 = aluno1.calcularMedia();
		double mediaAluno2 = aluno2.calcularMedia();
		double mediaAluno3 = aluno3.calcularMedia();
		double mediaTurma = turma.calcularMedia();
		
		System.out.println("= = = = = = Sistema Escolar = = = = = =");
		System.out.println("Média do aluno 1: " + mediaAluno1);
		System.out.println("Média do aluno 2: " + mediaAluno2);
		System.out.println("Média do aluno 3: " + mediaAluno3);
		System.out.println("---------------------------------------");		
		System.out.println("Média da turma: " + mediaTurma);
	}
}
