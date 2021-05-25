package testes;

import java.util.Scanner;
import principal.Turma;

public class TesteTurma {
	
public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		String nome, curso;
		int qnt, serie;
	
		
		System.out.println("Insira o nome da turma");
		nome = x.nextLine();
		
		System.out.println("Insira o nome do curso");
		curso = x.nextLine();
		
		System.out.println("Insira o numero de alunos");
		qnt = x.nextInt();
		
		System.out.println("Insira a série");
		serie = x.nextInt();
	
		Turma turma = new Turma(nome, curso, qnt, serie);
		
		System.out.println(turma.ToString());
			
		System.out.println("Insira o numero de alunos");
		qnt = x.nextInt();
		
		turma.setQnt(qnt);
		
		System.out.println(turma.ToString());
		
	}
}
