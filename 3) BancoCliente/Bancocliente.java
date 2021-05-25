package array;

import java.util.ArrayList;

public class Bancocliente {
	
	ArrayList<Cliente> clientes;
		
		
	public Bancocliente() {
			
			clientes = new ArrayList<Cliente>();
		}
	
	public void Inserir (Cliente cliente) {
		
		clientes.add(cliente);
		
		}
		
	public void Listarcliente(int id) {
		
		int x = 0;
		
		for(Cliente cliente : clientes) {
			if(cliente.getId() == id) {
			System.out.println("Cliente [" + x + "]= Nome: " + cliente.getNome() + " fone: " + cliente.getFone() + " ID: " + cliente.getId());
			}
			
			x++;
			
		}
	}
	
	public void Listarclientes() {
		
		int x = 0;
		
		for(Cliente cliente : clientes) {
			System.out.println("Cliente [" + x + "]= Nome: " + cliente.getNome() + " fone: " + cliente.getFone() + " ID: " + cliente.getId());
			x++;	
		
		}		
	}
	
	public void remover(int z) {
		
		clientes.remove(z); 
	
	}
	
	public void alterar(int id, int posicao, String nome, int fone) {
		
		int x = 0;
		
		if (posicao == x) {
			clientes.get(x).setNome(nome);
			clientes.get(x).setFone(fone);
			clientes.get(x).setId(id);
		}
		x++;
	}
}
