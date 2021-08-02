package projeto1;

public class ContaPoupanca extends Conta{
	
	double txCorrecao;

	public ContaPoupanca(Pessoa cliente, int nrConta, double saldo, double txCorrecao) {
		super(cliente, nrConta, saldo);
		this.txCorrecao = txCorrecao;
	}

	public double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}
	
	public void atualizaSaldoRendimento() {
		saldo += saldo*(txCorrecao/100.0);
	}
	
	public void abrirConta(Pessoa cliente) {
		setNrConta(nrConta);
		setSaldo(saldo);
		setCliente(cliente);
	}

}
