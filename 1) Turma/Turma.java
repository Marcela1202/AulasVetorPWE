package principal;

public class Turma {
	
	private String nome, curso;
	private int qnt, serie;

	public Turma(String nome, String curso, int qnt, int serie) {
		this.nome = nome;
		this.curso = curso;
		this.qnt = qnt;
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

public String ToString() {
		
		return "Nome: " + nome +
				"\nCurso: " + curso +
				"\nSerie: " + serie +
				"\nNumero de alunos: " + qnt;
				
	}
}
