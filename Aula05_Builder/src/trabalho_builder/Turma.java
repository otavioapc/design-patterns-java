package trabalho_builder;

public class Turma {

	// Atributos

	private int numero;
	private int ano;
	private String descricao;

	// Métodos

	@Override
	public String toString() {
		return "Turma [numero=" + numero + ", ano=" + ano + ", descricao=" + descricao + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
