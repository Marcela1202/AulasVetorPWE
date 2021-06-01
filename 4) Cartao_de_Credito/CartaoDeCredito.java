package exsHerança;

public class CartaoDeCredito extends Pagamento {
	
	private String numeroDoCartao;
	
	public CartaoDeCredito(String nomeDoPagador, String cpf, double valoraSerPago, String numeroDoCartao ) {
		super(nomeDoPagador, cpf, valoraSerPago);
		this.numeroDoCartao = numeroDoCartao;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}
}
