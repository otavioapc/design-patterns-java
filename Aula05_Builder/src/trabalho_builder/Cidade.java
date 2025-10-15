package trabalho_builder;

public class Cidade {
	
	//Atributos
	
	private String cidade;
	private String estado;
	private String pais;
	
	//Construtor
	
	public Cidade(String cidade, String estado, String pais) {
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	//Métodos
	
	@Override
	public String toString() {
		return "Cidade [cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + "]";
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
