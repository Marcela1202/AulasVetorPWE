package exsHerança;

public class Cheque extends Pagamento {

	private String numeroDoCheque;
	
	public Cheque(String nomedoPagador, String cpf, double valoraSerPago, String numerodoCheque) {
		super(nomedoPagador, cpf, valoraSerPago);
		this.numeroDoCheque = numeroDoCheque;
	}

	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}

	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}
	
}
