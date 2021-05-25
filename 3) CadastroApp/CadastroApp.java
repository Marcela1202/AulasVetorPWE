package array;

import javax.swing.JOptionPane;

public class CadastroApp {
	
	public static void main(String[] args) {
	
		int a;
		Bancocliente = banco new Bancocliente();
	
		do {
			a = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:" + "\n 1. Inserir" +"\n 2. Listar cliente expecifico" +"\n 3. Gerar lista de todos os clientes" +"\n 4. Remover algum cliente" +"\n 5. Alterar dados" +"\n 6. Sair"));
		
		if(a==1) {
			String nome = JOptionPane.showInputDialog("Insira o nome do cliente");
			int fone = Integer.parseInt(JOptionPane.showInputDialog("Insira o fone do cliente"));
			int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id"));
			
			Cliente cliente = new Cliente(nome, fone, id);
			banco.Inserir(cliente);
			break;
		}
		
		if(a==2) {
			
			int h = Integer.parseInt(JOptionPane.showInputDialog("Insira o id"));
			
			banco.Listarcliente(h);
			break;
		}
		if(a==3) {
			
			banco.Listarclientes();
			break;
			
		}
		if(a==4) {
			
			int h = Integer.parseInt(JOptionPane.showInputDialog("Em qual posição esta o cliente que deseja remover?"));
			banco.remover(h);
			break;
		}
		if(a==5) {
			
			int posicao =  Integer.parseInt(JOptionPane.showInputDialog("Em qual posição esta o cliente que deseja alterar?"));
			String n1 = JOptionPane.showInputDialog("Novo nome");
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Novo fone"));
			int n3 = Integer.parseInt(JOptionPane.showInputDialog("Novo id"));
			
			banco.alterar(posicao, n1, n2, n3);
			break;
		}
		
		else {
			
			System.out.println("!VALOR INVALIDO!"); 			
		}
		
		
		
		}while (a!=0);
		
	}

}
