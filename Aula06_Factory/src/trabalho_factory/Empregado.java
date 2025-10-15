package trabalho_factory;

import java.time.LocalDate;

public abstract class Empregado {


	private String nome;
	private String email;
	private int anoDeContratacao;

	// Construtor

	public Empregado(String nome, String email, int anoDeContratacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.anoDeContratacao = anoDeContratacao;
	}

	// Métodos

	public abstract double ganhar();

	public int tempoCasa() {

		LocalDate dataLocal = LocalDate.now();
		int anoAtual = dataLocal.getYear();

		return anoAtual - anoDeContratacao;

	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + ", anoDeContratacao=" + anoDeContratacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnoDeContratacao() {
		return anoDeContratacao;
	}

	public void setAnoDeContratacao(int anoDeContratacao) {
		this.anoDeContratacao = anoDeContratacao;
	}

}
