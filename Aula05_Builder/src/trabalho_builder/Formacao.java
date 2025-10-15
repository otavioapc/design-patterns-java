package trabalho_builder;

public class Formacao {

	// Atributos

	private int ano;
	private String instituicao;
	private Cidade cidade;

	// Métodos
	
	@Override
	public String toString() {
		return "Formacao [ano=" + ano + ", instituicao=" + instituicao + ", cidade=" + cidade + "]";
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;

	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}	
	
}
