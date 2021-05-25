package principal;

public class Disciplina {

	private String nome, prof;
	private int semestre;
	private boolean oferta;
	
	public Disciplina(String nome, String prof, int semestre, boolean oferta) {
		this.nome = nome;
		this.prof = prof;
		this.semestre = semestre;
		this.oferta = oferta;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public boolean isOferta() {
		return oferta;
	}

	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}
	
	public String ToString() {
		
		return "Nome: " + nome +
				"\nProfessor: " + prof +
				"\nSemestre: " + semestre +
				"\nOfertada: " + oferta;
	}
	
}
