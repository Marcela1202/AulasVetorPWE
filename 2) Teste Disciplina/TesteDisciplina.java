package testes;

import java.util.Scanner;
import principal.Disciplina;

public class TesteDisciplina {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		String nome, prof;
		int semestre;
		boolean oferta;
		
		System.out.println("Insira o nome da disciplina");
		nome = x.nextLine();
		
		System.out.println("Insira o nome do professor");
		prof = x.nextLine();
		
		System.out.println("Insira o semestre");
		semestre = x.nextInt();
		
		System.out.println("Digite 'true' caso seja ofertada, caso não, 'false'");
		oferta = x.nextBoolean();
	
		Disciplina disciplina = new Disciplina(nome, prof, semestre, oferta);
		
		System.out.println(disciplina.ToString());
			
	}
}
