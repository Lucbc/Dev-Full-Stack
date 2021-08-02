package projeto1;


public class PessoaFisica extends Pessoa{
	
	int cpf;
	String genero;
	String dtNascimento;
	
	public PessoaFisica(int id, String nome, String endereco, int cpf, String genero, String dtNascimento) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.genero = genero;
		this.dtNascimento = dtNascimento;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}
