package exsHerança;

public class Pagamento {

	private String nomedoPagador, cpf;
	private double valoraSerPago;



	public Pagamento(String nomeDoPagador, String cpf, double valoraSerPago) {
		this.nomedoPagador = nomeDoPagador;
		this.cpf = cpf;
		this.valoraSerPago = valoraSerPago;
	}



	public String getNomedoPagador() {
		return nomedoPagador;
	}



	public void setNomedoPagador(String nomedoPagador) {
		this.nomedoPagador = nomedoPagador;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public double getValoraSerPago() {
		return valoraSerPago;
	}



	public void setValoraSerPago(double valoraSerPago) {
		this.valoraSerPago = valoraSerPago;
	}
	
}