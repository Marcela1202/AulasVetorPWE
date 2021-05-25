package testes;

import java.util.Scanner;

import principal.Produto;

public class TesteProduto {

public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		String nome;
		double preco;
		int qnt;
		
		System.out.println("Insira o nome do produto");
		nome = x.nextLine();
		
		System.out.println("Insira seu preço");
		preco = x.nextDouble();
		
		System.out.println("Insira a quantidade");
		qnt = x.nextInt();
		
		
		Produto produto = new Produto(nome, preco, qnt);
		
		System.out.println(produto.ToString());
			
	}
	
}
