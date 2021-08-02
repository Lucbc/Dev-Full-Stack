package projeto1;

public class ContaEspecial extends Conta{

	double limite;

	public ContaEspecial(Pessoa cliente, int nrConta, double saldo, double limite) {
		super(cliente, nrConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void verificaSaldo(){
		System.out.println("Valor do Saldo: " + getSaldo());
	}
	
	public void abrirConta(Pessoa cliente) {
		setNrConta(nrConta);
		setSaldo(saldo);
		setCliente(cliente);
	}
	
}
