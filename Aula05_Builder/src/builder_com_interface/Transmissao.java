package builder_com_interface;

public class Transmissao {
	
	//Atributos
	
	private String tipo;
	private int quantMarchas;
	
	//Construtor
	
	//Métodos
	
	@Override
	public String toString() {
		return "Transmissao [tipo=" + tipo + ", quantMarchas=" + quantMarchas + "]";
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQuantMarchas() {
		return quantMarchas;
	}
	public void setQuantMarchas(int quantMarchas) {
		this.quantMarchas = quantMarchas;
	}
	
	

}
