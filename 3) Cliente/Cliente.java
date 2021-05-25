package array;

public class Cliente {

	private String nome;
	private int fone, id;
	
		
	public Cliente (String nome, int fone, int id ) {
		this.nome = nome;
		this.fone = fone;
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
